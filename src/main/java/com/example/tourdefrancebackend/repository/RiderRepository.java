package com.example.tourdefrancebackend.repository;

import com.example.tourdefrancebackend.model.Rider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RiderRepository extends JpaRepository<Rider, Integer> {
}
