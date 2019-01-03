package trucking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import trucking.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
