package springboot.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.workshop.entites.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
