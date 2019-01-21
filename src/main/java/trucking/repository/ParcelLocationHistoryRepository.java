package trucking.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import trucking.entity.ParcelLocationHistory;

@Repository
public interface ParcelLocationHistoryRepository extends CrudRepository<ParcelLocationHistory, Long> {
}
