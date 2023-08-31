package springboot.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springboot.workshop.entites.OrderItem;


@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {

}
