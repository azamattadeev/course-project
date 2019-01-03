package trucking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import trucking.entity.Logistician;

public interface LogisticianRepository extends JpaRepository<Logistician, Long> {
}
