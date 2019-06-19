package microservices.deletemicroservice.repositories;

import microservices.deletemicroservice.models.League;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface LeagueRepository extends JpaRepository<League, Long> {

    Collection<League> findByLeagueNameContainingIgnoreCase(String name);
}