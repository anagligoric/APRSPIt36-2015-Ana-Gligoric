package microservices.putmicroservice.repositories;

import microservices.putmicroservice.models.League;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface LeagueRepository extends JpaRepository<League, Long> {

    Collection<League> findByLeagueNameContainingIgnoreCase(String name);
}