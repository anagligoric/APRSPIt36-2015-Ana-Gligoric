package microservices.putmicroservice.repositories;

import microservices.putmicroservice.models.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface TeamRepository extends JpaRepository<Team, Long> {

    Collection<Team> findByTeamNameContainingIgnoreCase(String name);
}
