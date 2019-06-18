package microservices.postmicroservice.controllers;

import microservices.postmicroservice.FeignRepository;
import microservices.postmicroservice.models.Nationality;
import microservices.postmicroservice.repositories.LeagueRepository;
import microservices.postmicroservice.repositories.NationalityRepository;
import microservices.postmicroservice.repositories.PlayerRepository;
import microservices.postmicroservice.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
}
