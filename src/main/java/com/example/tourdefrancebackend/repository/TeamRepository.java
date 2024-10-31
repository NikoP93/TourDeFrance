package com.example.tourdefrancebackend.repository;

import com.example.tourdefrancebackend.model.Rider;
import com.example.tourdefrancebackend.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeamRepository extends JpaRepository<Team, Integer> {


}
