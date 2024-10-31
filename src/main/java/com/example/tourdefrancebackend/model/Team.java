package com.example.tourdefrancebackend.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int teamid;
    private String teamName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "team")
    @JsonBackReference
    private Set<Rider> riders = new HashSet<>();

    public Set<Rider> getRiders() {
        return riders;
    }

    public void setRiders(Set<Rider> riders) {
        this.riders = riders;
    }

    public int getTeamid() {
        return teamid;
    }

    public void setTeamid(int teamid) {
        this.teamid = teamid;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public String toString() {
        return "Team{" +
                "riders=" + riders +
                ", teamid=" + teamid +
                ", teamName='" + teamName + '\'' +
                '}';
    }
}
