package com.example.tourdefrancebackend.repository;

import com.example.tourdefrancebackend.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Integer> {
}
