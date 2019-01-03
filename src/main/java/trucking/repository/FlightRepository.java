package trucking.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import trucking.entity.Flight;
import trucking.entity.Warehouse;
import trucking.entity.Way;
import trucking.entity.enums.FlightStatus;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

    List<Flight> findAllByWayAndStatusAndFullFalse(Way way, FlightStatus status);

    List<Flight> findAllByWayFromWarehouseAndStatusAndFullFalse(Warehouse fromWarehouse, FlightStatus status);

    List<Flight> findAllByWayToWarehouseAndStatusAndFullFalse(Warehouse toWarehouse, FlightStatus status);

}