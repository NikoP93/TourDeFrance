package com.example.tourdefrancebackend.model;

import jakarta.persistence.*;

@Entity
public class Rider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    private double totalTime;
    private int sprintPoints;
    private int mountainPoints;

    @ManyToOne
    @JoinColumn(name = "teamfk", referencedColumnName = "teamid")
    private Team team;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMountainPoints() {
        return mountainPoints;
    }

    public void setMountainPoints(int mountainPoints) {
        this.mountainPoints = mountainPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSprintPoints() {
        return sprintPoints;
    }

    public void setSprintPoints(int sprintPoints) {
        this.sprintPoints = sprintPoints;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    @Override
    public String toString() {
        return "Rider{" +
                "age=" + age +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", totalTime=" + totalTime +
                ", sprintPoints=" + sprintPoints +
                ", mountainPoints=" + mountainPoints +
                ", team=" + team +
                '}';
    }
}
