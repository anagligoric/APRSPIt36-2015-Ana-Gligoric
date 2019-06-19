package microservices.getmicroservice.repositories;

import microservices.getmicroservice.models.Player;
import microservices.getmicroservice.models.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;

public interface PlayerRepository extends JpaRepository<Player, Long> {

    Collection<Player> findByFirstNameContainingIgnoreCase(String firstName);
    Collection<Player> findByLastNameContainingIgnoreCase(String lastName);
    Collection<Player> findByTeam(Team team);
    @Query(value = "select coalesce(max(num)+1, 1) from player where team_id = ?1", nativeQuery = true)
    Integer nextNum(int teamId);
}
