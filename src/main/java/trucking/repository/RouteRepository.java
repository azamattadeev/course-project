package trucking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import trucking.entity.Parcel;
import trucking.entity.Route;

public interface RouteRepository extends JpaRepository<Route, Long> {

    Route findByParcel(Parcel parcel);

}
