package trucking.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import trucking.entity.RouteNode;

@Repository
public interface RouteNodeRepository extends CrudRepository<RouteNode, Long> {
}
