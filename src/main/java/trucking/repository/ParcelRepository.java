package trucking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import trucking.entity.*;

import java.util.List;

public interface ParcelRepository extends JpaRepository<Parcel, Long> {

    List<Parcel> findAllByCurrentWarehouse(Warehouse warehouse);

    List<Parcel> findAllByCurrentFlight(Flight flight);

    List<Parcel> findAllByCurrentFlightWayToWarehouse(Warehouse toWarehouse);

    Parcel findByTrackNumber(String trackNumber);

    Parcel findByOrder(Order order);

}
