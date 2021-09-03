package santander.bootcamp.personapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import santander.bootcamp.personapi.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
