package microservices.postmicroservice.controllers;

import microservices.postmicroservice.FeignRepository;
import microservices.postmicroservice.models.League;
import microservices.postmicroservice.models.Nationality;
import microservices.postmicroservice.models.Player;
import microservices.postmicroservice.models.Team;
import microservices.postmicroservice.repositories.LeagueRepository;
import microservices.postmicroservice.repositories.NationalityRepository;
import microservices.postmicroservice.repositories.PlayerRepository;
import microservices.postmicroservice.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class POSTRestController {

    @Autowired
    private FeignRepository feign;

    @Autowired
    private NationalityRepository nationalityRepository;

    @Autowired
    private LeagueRepository leagueRepository;

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private PlayerRepository playerRepository;

    @PostMapping("nationality")
    public ResponseEntity<Nationality> insertNationality(@RequestBody Nationality nationality) {
        if (nationalityRepository.existsById(nationality.getId()))
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        nationalityRepository.save(nationality);
        return ResponseEntity.ok(nationality);
    }

    @PostMapping("team")
    public ResponseEntity<Team> insertTeam(@RequestBody Team team) {
        if (teamRepository.existsById(team.getId()))
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        teamRepository.save(team);
        return ResponseEntity.ok(team);
    }

    @PostMapping("league")
    public ResponseEntity<League> insertLeague(@RequestBody League league) {
        if (leagueRepository.existsById(league.getId()))
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        leagueRepository.save(league);
        return ResponseEntity.ok(league);
    }


    @PostMapping("player")
    public ResponseEntity<Player> insertPlayer(@RequestBody Player player) {
        if (playerRepository.existsById(player.getId()))
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        player.setNum(feign.num(player.getTeam().getId()));
        playerRepository.save(player);
        return ResponseEntity.ok(player);
    }
}
