package trucking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import trucking.entity.Order;
import trucking.entity.Recipient;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
