package microservices.getmicroservice.controllers;

import microservices.getmicroservice.models.League;
import microservices.getmicroservice.models.Nationality;
import microservices.getmicroservice.models.Player;
import microservices.getmicroservice.models.Team;
import microservices.getmicroservice.repositories.LeagueRepository;
import microservices.getmicroservice.repositories.NationalityRepository;
import microservices.getmicroservice.repositories.PlayerRepository;
import microservices.getmicroservice.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class GETRestController {

    @Autowired
    private NationalityRepository nationalityRepository;

    @Autowired
    private LeagueRepository leagueRepository;

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private PlayerRepository playerRepository;

    @GetMapping("nationality")
    public ResponseEntity<Collection<Nationality>> getNationalities() {
        Collection<Nationality> nationalities = nationalityRepository.findAll();
        if (CollectionUtils.isEmpty(nationalities)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(nationalities);
        }
    }

    @GetMapping("nationality/{id}")
    public ResponseEntity<Nationality> getNationality(@PathVariable("id") Long id) {
        if (nationalityRepository.existsById(id)) {
            return ResponseEntity.ok(nationalityRepository.getOne(id));
        } else {
            return ResponseEntity.noContent().build();
        }
    }

    @GetMapping("nationality/name/{nationalityName}")
    public ResponseEntity<Collection<Nationality>> getNationalityByName(@PathVariable("nationalityName") String nationalityName) {
        Collection<Nationality> nationalities = nationalityRepository.findByNationalityNameContainingIgnoreCase(nationalityName);
        if (CollectionUtils.isEmpty(nationalities)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(nationalities);
        }
    }

    @GetMapping("league")
    public Collection<League> getLeagues() {
        return leagueRepository.findAll();
    }

    @GetMapping("league/{id}")
    public ResponseEntity<League> getLeague(@PathVariable("id") Long id) {
        if (leagueRepository.existsById(id)) {
            return ResponseEntity.ok(leagueRepository.getOne(id));
        } else {
            return ResponseEntity.noContent().build();
        }
    }

    @GetMapping("league/name/{leagueName}")
    public ResponseEntity<Collection<League>> getLeagueByName(@PathVariable("leagueName") String leagueName) {
        Collection<League> leagues = leagueRepository.findByLeagueNameContainingIgnoreCase(leagueName);
        if (CollectionUtils.isEmpty(leagues)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(leagues);
        }
    }

    @GetMapping("team")
    public Collection<Team> getTeams() {
        return teamRepository.findAll();
    }

    @GetMapping("team/{id}")
    public ResponseEntity<Team> getTeam(@PathVariable("id") Long id) {
        if (teamRepository.existsById(id)) {
            return ResponseEntity.ok(teamRepository.getOne(id));
        } else {
            return ResponseEntity.noContent().build();
        }
    }

    @GetMapping("team/name/{teamName}")
    public ResponseEntity<Collection<Team>> getTeamByName(@PathVariable("teamName") String teamName) {
        Collection<Team> teams = teamRepository.findByTeamNameContainingIgnoreCase(teamName);
        if (CollectionUtils.isEmpty(teams)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(teams);
        }
    }

    @GetMapping("player")
    public Collection<Player> getPlayers() {
        return playerRepository.findAll();
    }

    @GetMapping("player/{id}")
    public ResponseEntity<Player> getPlayer(@PathVariable("id") Long id) {
        if (playerRepository.existsById(id)) {
            return ResponseEntity.ok(playerRepository.getOne(id));
        } else {
            return ResponseEntity.noContent().build();
        }
    }

    @GetMapping("player/firstname/{playerFirstName}")
    public ResponseEntity<Collection<Player>> getPlayerByFirstName(@PathVariable("playerFirstName") String playerFirstName) {
        Collection<Player> players = playerRepository.findByFirstNameContainingIgnoreCase(playerFirstName);
        if (CollectionUtils.isEmpty(players)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(players);
        }
    }

    @GetMapping("player/lastname/{playerLastName}")
    public ResponseEntity<Collection<Player>> getPlayerByLastName(@PathVariable("playerLastName") String playerLastName) {
        Collection<Player> players = playerRepository.findByLastNameContainingIgnoreCase(playerLastName);
        if (CollectionUtils.isEmpty(players)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(players);
        }
    }

    @GetMapping("team/player/{id}")
    public ResponseEntity<Collection<Player>> getPlayerByLastName(@PathVariable("id") Long id) {
        if (teamRepository.existsById(id)) {
            Team team = teamRepository.getOne(id);
            return ResponseEntity.ok(playerRepository.findByTeam(team));
        } else {
            return ResponseEntity.noContent().build();
        }
    }
    @GetMapping("redniBroj/{id}")
    public Integer redniBroj(@PathVariable("id") int id) {
        return playerRepository.nextRBr(id);
    }
}
