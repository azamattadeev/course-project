import org.apache.log4j.BasicConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import trucking.config.DataConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import trucking.entity.Flight;
import trucking.entity.Warehouse;
import trucking.entity.Way;
import trucking.entity.enums.FlightStatus;
import trucking.entity.enums.TransportationType;
import trucking.repository.FlightRepository;
import trucking.repository.WarehouseRepository;
import trucking.repository.WayRepository;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BasicConfigurator.configure();
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DataConfig.class);
        FlightRepository flightRepository = ctx.getBean("flightRepository", FlightRepository.class);
        WayRepository wayRepository = ctx.getBean("wayRepository", WayRepository.class);
        WarehouseRepository warehouseRepository = ctx.getBean("warehouseRepository", WarehouseRepository.class);

        Warehouse whVL = new Warehouse();
        whVL.setCountry("Russia");
        whVL.setCity("Vladikavkaz");
        whVL.setAddress("Mira street, 54");
        whVL.setPhoneNumber("22");

        Warehouse whMSK = new Warehouse();
        whMSK.setCountry("Russia");
        whMSK.setCity("Moscow");
        whMSK.setAddress("Lenina street, 23");
        whMSK.setPhoneNumber("22");;

        Warehouse whSPB = new Warehouse();
        whSPB.setCountry("Russia");
        whSPB.setCity("Saint-Petersburg");
        whSPB.setAddress("Kronverkskiy avenue, 49");
        whSPB.setPhoneNumber("22");

        whVL = warehouseRepository.save(whVL);
        whSPB = warehouseRepository.save(whSPB);
        whMSK = warehouseRepository.save(whMSK);

        Way wayMskToSpbRoad = new Way();
        wayMskToSpbRoad.setFromWarehouse(whMSK);
        wayMskToSpbRoad.setToWarehouse(whSPB);
        wayMskToSpbRoad.setTransportationType(TransportationType.ROAD_TRANSPORTATION);

        Way wayVlToSpbAir = new Way();
        wayVlToSpbAir.setTransportationType(TransportationType.AIR_TRANSPORTATION);
        wayVlToSpbAir.setFromWarehouse(whVL);
        wayVlToSpbAir.setToWarehouse(whSPB);

        Way wayVlToSpbRoad = new Way();
        wayVlToSpbRoad.setTransportationType(TransportationType.ROAD_TRANSPORTATION);
        wayVlToSpbRoad.setFromWarehouse(whVL);
        wayVlToSpbRoad.setToWarehouse(whSPB);

        wayMskToSpbRoad = wayRepository.save(wayMskToSpbRoad);
        wayVlToSpbAir = wayRepository.save(wayVlToSpbAir);
        wayVlToSpbRoad = wayRepository.save(wayVlToSpbRoad);

        Flight flight1 = new Flight();
        flight1.setWay(wayMskToSpbRoad);
        flight1.setFull(false);
        flight1.setStatus(FlightStatus.SCHEDULED);
        flight1.setDepartureTime(ZonedDateTime.of(2019,1,12,15,0,0,0, ZoneId.systemDefault()));
        Flight flight2 = new Flight();
        flight2.setWay(wayVlToSpbAir);
        flight2.setFull(false);
        flight2.setStatus(FlightStatus.SCHEDULED);
        flight2.setDepartureTime(ZonedDateTime.of(2019, 1, 6, 22,0,0,0,ZoneId.systemDefault()));


        flight1 = flightRepository.save(flight1);
        flight2 = flightRepository.save(flight2);

        Iterable<Flight> list = flightRepository.findAllByWayAndStatusAndFullFalse(wayMskToSpbRoad, FlightStatus.SCHEDULED);


        for(Flight flight:list) {
            System.out.println(flight);
        }

    }

}
