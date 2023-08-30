package springboot.workshop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot.workshop.entites.Category;
import springboot.workshop.entites.User;
import springboot.workshop.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping
	public ResponseEntity<List<Category>> getAll(){
		List<Category> categories = categoryService.findAll();
		return ResponseEntity.ok().body(categories);
	}
	
	@GetMapping("/{categoryId}")
	public ResponseEntity<Category> getById(@PathVariable(name = "categoryId") Integer id){
		Category category = categoryService.findById(id);
		return ResponseEntity.ok().body(category);
	}
}
