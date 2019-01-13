package trucking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import trucking.entity.RouteNode;

public interface WayNodeRepository extends JpaRepository<RouteNode, Long> {
}
