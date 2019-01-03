package trucking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import trucking.entity.TruckingRequest;
import trucking.entity.enums.TruckingRequestStatus;

import java.util.List;

public interface TruckingRequestRepository extends JpaRepository<TruckingRequest, Long> {

    List<TruckingRequest> findAllByLocationCountryAndLocationCityAndStatus(String locationCountry, String locationCity, TruckingRequestStatus status);

    default List<TruckingRequest> findAllByLocationCountryAndLocationCityAndStatusNew(String locationCountry, String locationCity){
        return findAllByLocationCountryAndLocationCityAndStatus(locationCountry, locationCity, TruckingRequestStatus.NEW);
    }

    default List<TruckingRequest> findAllByLocationCountryAndLocationCityAndStatusInProcess(String locationCountry, String locationCity){
        return findAllByLocationCountryAndLocationCityAndStatus(locationCountry, locationCity, TruckingRequestStatus.IN_PROCESS);
    }


}
