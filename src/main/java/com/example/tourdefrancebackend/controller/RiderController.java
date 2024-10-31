package com.example.tourdefrancebackend.controller;

import com.example.tourdefrancebackend.model.Rider;
import com.example.tourdefrancebackend.repository.RiderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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


}
