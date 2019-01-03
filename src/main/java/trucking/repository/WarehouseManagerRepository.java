package trucking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import trucking.entity.Warehouse;
import trucking.entity.WarehouseManager;

import java.util.List;

public interface WarehouseManagerRepository extends JpaRepository<WarehouseManager, Long> {

    List<WarehouseManager> findAllByWarehouse(Warehouse warehouse);

}
