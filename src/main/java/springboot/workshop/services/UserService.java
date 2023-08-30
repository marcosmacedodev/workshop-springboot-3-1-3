package springboot.workshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.workshop.entites.User;
import springboot.workshop.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll() {
		
		return userRepository.findAll();
	}
	
	public User findById(Integer id) {
		
		Optional<User> opt = userRepository.findById(id);
		return opt.get();
	}
}
