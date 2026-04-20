package order_service_application.order_service.repository;

import order_service_application.order_service.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {
}
