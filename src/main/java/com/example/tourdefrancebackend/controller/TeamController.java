package com.example.tourdefrancebackend.controller;

import com.example.tourdefrancebackend.model.Rider;
import com.example.tourdefrancebackend.model.Team;
import com.example.tourdefrancebackend.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
public class TeamController {

    @Autowired
    private TeamRepository teamRepository;

    @GetMapping("/teams")
    public ResponseEntity<List<Team>> getAllTeams() {
        List<Team> teams = teamRepository.findAll();
        return ResponseEntity.ok(teams);
    }

    @GetMapping("teamriders/{id}")
    public ResponseEntity<Set<Rider>> getTeamRiders(@PathVariable int id) {
        Optional<Team> teamOptional = teamRepository.findById(id);
        if (teamOptional.isPresent()) {
            Team team = teamOptional.get();
            return new ResponseEntity<>(team.getRiders(), HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
}
