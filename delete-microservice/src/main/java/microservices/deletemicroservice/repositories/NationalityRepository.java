package microservices.deletemicroservice.repositories;

import microservices.deletemicroservice.models.Nationality;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface NationalityRepository extends JpaRepository<Nationality, Long> {

    Collection<Nationality> findByNationalityNameContainingIgnoreCase(String nationalityName);
}