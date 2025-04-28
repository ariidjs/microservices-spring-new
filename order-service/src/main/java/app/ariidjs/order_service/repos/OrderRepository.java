package app.ariidjs.order_service.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import app.ariidjs.order_service.models.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
