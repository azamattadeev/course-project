package trucking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import trucking.entity.OfficeWorker;

public interface OfficeWorkerRepository extends JpaRepository<OfficeWorker, Long> {
}
