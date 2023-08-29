package springboot.workshop.entites;

import java.io.Serializable;
import java.util.Date;

import springboot.workshop.entites.enums.OrderStatus;

public class Order implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Date moment;
	private OrderStatus orderStatus;
}
