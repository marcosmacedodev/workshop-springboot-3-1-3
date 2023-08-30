package springboot.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springboot.workshop.entites.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
