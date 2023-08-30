package springboot.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springboot.workshop.entites.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
