package trucking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import trucking.entity.Recipient;

public interface RecipientRepository extends JpaRepository<Recipient, Long> {

    Recipient findByPassportNumber(String passwordNumber);

}
