package com.example.tourdefrancebackend.controller;

import com.example.tourdefrancebackend.model.Rider;
import com.example.tourdefrancebackend.repository.RiderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
public class RiderController {

    @Autowired
    private RiderRepository riderRepository;

    @GetMapping("/riders")
    public ResponseEntity<List<Rider>> getRiders() {
        List<Rider> riders = riderRepository.findAll();
        return ResponseEntity.ok(riders);
    }

    @PostMapping("/riders")
    @ResponseStatus(HttpStatus.CREATED)
    public Rider postRider(@RequestBody Rider rider) {
        System.out.println("Recived Rider" + rider);
        Rider savedRider = riderRepository.save(rider);
        System.out.println("Saved Rider" + savedRider);
        return savedRider;
    }

    @DeleteMapping("/riders/{id}")
    public ResponseEntity<String> deleteRider(@PathVariable int id) {
        Optional<Rider> rider = riderRepository.findById(id);
        if (rider.isPresent()) {
            riderRepository.deleteById(id);
            return ResponseEntity.ok("Deleted Rider" + id);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Rider not found");
        }
    }

    @PutMapping("/riders")
    public ResponseEntity<Rider> updateRider(@RequestBody Rider rider) {
        Optional<Rider> rid = riderRepository.findById(rider.getId());
        if (rid.isPresent()) {
            riderRepository.save(rider);
            return new ResponseEntity<>(rider, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


}
