package trucking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import trucking.entity.WayNode;

public interface WayNodeRepository extends JpaRepository<WayNode, Long> {
}
