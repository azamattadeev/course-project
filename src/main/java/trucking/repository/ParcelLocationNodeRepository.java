package trucking.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import trucking.entity.ParcelLocationNode;

@Repository
public interface ParcelLocationNodeRepository extends CrudRepository<ParcelLocationNode, Long> {
}
