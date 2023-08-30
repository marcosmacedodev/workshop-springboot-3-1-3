package springboot.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springboot.workshop.entites.Order;


@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
