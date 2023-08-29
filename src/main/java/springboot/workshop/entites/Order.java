package springboot.workshop.entites;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import springboot.workshop.entites.enums.OrderStatus;

public class Order implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Date moment;
	private Integer orderStatus;
	private User user;
	
	public Order() {
	}

	public Order(Integer id, Date moment, Integer orderStatus, User user) {
		super();
		this.id = id;
		this.moment = moment;
		this.orderStatus = orderStatus;
		this.user = user;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getOrderStatus() {
		return OrderStatus.toEnum(orderStatus);
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus.getId();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Order [id=");
		builder.append(id);
		builder.append(", moment=");
		builder.append(moment);
		builder.append(", orderStatus=");
		builder.append(orderStatus);
		builder.append(", user=");
		builder.append(user);
		builder.append("]");
		return builder.toString();
	}

}
