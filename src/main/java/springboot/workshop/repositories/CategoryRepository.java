package springboot.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springboot.workshop.entites.Category;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
