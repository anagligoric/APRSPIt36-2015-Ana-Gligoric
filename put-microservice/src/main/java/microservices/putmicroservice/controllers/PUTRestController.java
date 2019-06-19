package microservices.putmicroservice.controllers;

import microservices.putmicroservice.models.League;
import microservices.putmicroservice.models.Nationality;
import microservices.putmicroservice.models.Player;
import microservices.putmicroservice.models.Team;
import microservices.putmicroservice.repositories.LeagueRepository;
import microservices.putmicroservice.repositories.NationalityRepository;
import microservices.putmicroservice.repositories.PlayerRepository;
import microservices.putmicroservice.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PUTRestController {
    @Autowired
    private NationalityRepository nationalityRepository;

    @Autowired
    private LeagueRepository leagueRepository;

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private PlayerRepository playerRepository;

    @PutMapping("nationality")
    public ResponseEntity<Nationality> updateNationality(@RequestBody Nationality nationality){
        if(!nationalityRepository.existsById(nationality.getId()))
            return ResponseEntity.noContent().build();
        nationalityRepository.save(nationality);
        return  ResponseEntity.ok(nationality);
    }

    @PutMapping("league")
    public ResponseEntity<League> updateLeague(@RequestBody League league){
        if(!leagueRepository.existsById(league.getId()))
            return ResponseEntity.noContent().build();
        leagueRepository.save(league);
        return ResponseEntity.ok(league);
    }

    @PutMapping("team")
    public ResponseEntity<Team> updateTeam(@RequestBody Team team){
        if(!teamRepository.existsById(team.getId()))
            return ResponseEntity.noContent().build();
        teamRepository.save(team);
        return ResponseEntity.ok(team);
    }

    @PutMapping("player")
    public ResponseEntity<Player> updatePlayer(@RequestBody Player player){
        if(!playerRepository.existsById(player.getId()))
            return ResponseEntity.noContent().build();
        playerRepository.save(player);
        return  ResponseEntity.ok(player);
    }
}
