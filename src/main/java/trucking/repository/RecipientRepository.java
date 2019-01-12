package trucking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import trucking.entity.Person;

public interface RecipientRepository extends JpaRepository<Person, Long> {

    Person findByPassportNumber(String passwordNumber);

}
