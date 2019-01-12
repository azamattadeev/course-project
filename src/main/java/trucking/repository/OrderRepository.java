package trucking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import trucking.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
