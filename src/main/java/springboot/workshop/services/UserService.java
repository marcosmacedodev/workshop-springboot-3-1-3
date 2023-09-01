package springboot.workshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.workshop.entites.User;
import springboot.workshop.repositories.UserRepository;
import springboot.workshop.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	public User findById(Integer id) {
		Optional<User> opt = userRepository.findById(id);
		return opt.orElseThrow(() -> new ResourceNotFoundException("NotFound User Id "+ id));
	}
	
	public User insert(User newUser) {
		newUser.setId(null);
		return userRepository.save(newUser);
	}
	
	public void deleteById(Integer id) {
		User user = findById(id);
		userRepository.delete(user);
	}
	
	public User save(Integer id, User user) {
		User u = userRepository.getReferenceById(id);
		if(user.getName() != null) u.setName(user.getName());
		if(user.getEmail() != null) u.setEmail(user.getEmail());;
		if(user.getPhone() != null) u.setPhone(user.getPhone());
		return userRepository.save(u);
	}
}
