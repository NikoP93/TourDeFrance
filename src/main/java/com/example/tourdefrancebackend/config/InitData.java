package com.example.tourdefrancebackend.config;

import com.example.tourdefrancebackend.model.Rider;
import com.example.tourdefrancebackend.model.Team;
import com.example.tourdefrancebackend.repository.RiderRepository;
import com.example.tourdefrancebackend.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    RiderRepository riderRepository;

    @Autowired
    TeamRepository teamRepository;

    @Override
    public void run(String... args) throws Exception {

        loadTeamsAndRiders();
    }

    private void loadTeamsAndRiders() {
        // Team UAE Team Emirates
        Team uaeTeamEmirates = new Team();
        uaeTeamEmirates.setTeamName("UAE Team Emirates");
        teamRepository.save(uaeTeamEmirates);

        Rider pogacar = new Rider();
        pogacar.setName("Tadej Pogačar");
        pogacar.setAge(23);
        pogacar.setTotalTime(32101); // Converting hours to minutes
        pogacar.setSprintPoints(40);
        pogacar.setMountainPoints(3);
        pogacar.setTeam(uaeTeamEmirates);
        riderRepository.save(pogacar);

        Rider mcnulty = new Rider();
        mcnulty.setName("Brandon McNulty");
        mcnulty.setAge(24);
        mcnulty.setTotalTime(32101);
        mcnulty.setSprintPoints(2);
        mcnulty.setMountainPoints(0);
        mcnulty.setTeam(uaeTeamEmirates);
        riderRepository.save(mcnulty);

        // Team Jumbo-Visma
        Team jumboVisma = new Team();
        jumboVisma.setTeamName("Jumbo Visma");
        teamRepository.save(jumboVisma);

        Rider vanAert = new Rider();
        vanAert.setName("Wout van Aert");
        vanAert.setAge(27);
        vanAert.setTotalTime(32095); // Converting hours to minutes
        vanAert.setSprintPoints(60);
        vanAert.setMountainPoints(0);
        vanAert.setTeam(jumboVisma);
        riderRepository.save(vanAert);

        Rider roglic = new Rider();
        roglic.setName("Primož Roglič");
        roglic.setAge(32);
        roglic.setTotalTime(32101);
        roglic.setSprintPoints(1);
        roglic.setMountainPoints(0);
        roglic.setTeam(jumboVisma);
        riderRepository.save(roglic);

        Team ineosGrenadiers = new Team();
        ineosGrenadiers.setTeamName("IneosGrenadiers");
        teamRepository.save(ineosGrenadiers);

        Rider thomas = new Rider();
        thomas.setName("Geraint Thomas");
        thomas.setAge(36);
        thomas.setTotalTime(32120); // 8h 55' 20" in seconds
        thomas.setSprintPoints(10);
        thomas.setMountainPoints(0);
        thomas.setTeam(ineosGrenadiers);
        riderRepository.save(thomas);

        Rider yates = new Rider();
        yates.setName("Adam Yates");
        yates.setAge(29);
        yates.setTotalTime(32110); // 8h 55' 10" in seconds
        yates.setSprintPoints(8);
        yates.setMountainPoints(1);
        yates.setTeam(ineosGrenadiers);
        riderRepository.save(yates);

        // Team Trek-Segafredo
        Team trekSegafredo = new Team();
        trekSegafredo.setTeamName("Trek Segafredo");
        teamRepository.save(trekSegafredo);

        Rider pedersen = new Rider();
        pedersen.setName("Mads Pedersen");
        pedersen.setAge(26);
        pedersen.setTotalTime(32105); // 8h 55' 05" in seconds
        pedersen.setSprintPoints(50);
        pedersen.setMountainPoints(0);
        pedersen.setTeam(trekSegafredo);
        riderRepository.save(pedersen);

        Rider stuyven = new Rider();
        stuyven.setName("Jasper Stuyven");
        stuyven.setAge(30);
        stuyven.setTotalTime(32115); // 8h 55' 15" in seconds
        stuyven.setSprintPoints(12);
        stuyven.setMountainPoints(0);
        stuyven.setTeam(trekSegafredo);
        riderRepository.save(stuyven);

        // Team EF Education-EasyPost
        Team efEducationEasyPost = new Team();
        efEducationEasyPost.setTeamName("EF Education-EasyPost");
        teamRepository.save(efEducationEasyPost);

        // Rider Magnus Cort, wearing the mountain jersey after Stage 3
        Rider magnusCort = new Rider();
        magnusCort.setName("Magnus Cort");
        magnusCort.setAge(29);
        magnusCort.setTotalTime(32205); // Example total time in seconds
        magnusCort.setSprintPoints(15);
        magnusCort.setMountainPoints(11); // Leading mountain points
        magnusCort.setTeam(efEducationEasyPost);
        riderRepository.save(magnusCort);
    }
}
