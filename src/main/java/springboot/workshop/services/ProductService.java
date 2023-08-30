package springboot.workshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.workshop.entites.Product;
import springboot.workshop.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> findAll() {
		return productRepository.findAll();
	}
	
	public Product findById(Integer id) {
		Optional<Product> opt = productRepository.findById(id);
		return opt.get();
	}
}
