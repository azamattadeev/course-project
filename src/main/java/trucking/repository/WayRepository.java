package trucking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import trucking.entity.Warehouse;
import trucking.entity.Way;

import java.util.List;

@Repository
public interface WayRepository extends JpaRepository<Way, Long> {

    List<Way> findAllByFromWarehouse(Warehouse fromWarehouse);

    List<Way> findAllByToWarehouse(Warehouse toWarehouse);

}