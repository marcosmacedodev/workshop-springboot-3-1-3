package springboot.workshop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot.workshop.entites.Order;
import springboot.workshop.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping
	public ResponseEntity<List<Order>> getAll(){
		List<Order> users = orderService.findAll();
		return ResponseEntity.ok().body(users);
	}
	
	@GetMapping("/{orderId}")
	public ResponseEntity<Order> getById(@PathVariable(name = "orderId") Integer id){
		Order order = orderService.findById(id);
		return ResponseEntity.ok().body(order);
	}
}
