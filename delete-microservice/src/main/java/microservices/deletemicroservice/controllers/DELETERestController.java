package microservices.deletemicroservice.controllers;

import microservices.deletemicroservice.models.League;
import microservices.deletemicroservice.models.Nationality;
import microservices.deletemicroservice.models.Player;
import microservices.deletemicroservice.models.Team;
import microservices.deletemicroservice.repositories.LeagueRepository;
import microservices.deletemicroservice.repositories.NationalityRepository;
import microservices.deletemicroservice.repositories.PlayerRepository;
import microservices.deletemicroservice.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DELETERestController {

    @Autowired
    private NationalityRepository nationalityRepository;

    @Autowired
    private LeagueRepository leagueRepository;

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private PlayerRepository playerRepository;

    @DeleteMapping("nationality/{id}")
    public ResponseEntity<Nationality> deleteNationality(@PathVariable("id") Long id){
        if(nationalityRepository.existsById(id)){
            nationalityRepository.deleteById(id);
            return  new ResponseEntity<>(HttpStatus.OK);
        }
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("league/{id}")
    public ResponseEntity<League> deleteLeague(@PathVariable ("id") Long id){
        if(!leagueRepository.existsById(id))
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        leagueRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("team/{id}")
    public ResponseEntity<Team> deleteTeam(@PathVariable ("id") Long id){
        if(!teamRepository.existsById(id))
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        teamRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping ("player/{id}")
    public ResponseEntity<Player> deletePlayer(@PathVariable("id") Long id){
        if(!playerRepository.existsById(id))
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        playerRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
