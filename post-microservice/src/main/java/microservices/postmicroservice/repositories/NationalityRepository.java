package microservices.postmicroservice.repositories;

import microservices.postmicroservice.models.Nationality;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface NationalityRepository extends JpaRepository<Nationality, Long> {

    Collection<Nationality> findByNationalityNameContainingIgnoreCase(String nationalityName);
}