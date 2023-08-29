package springboot.workshop.entites;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Payment implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Date moment;
	private Order order;
	public Payment() {

	}
	public Payment(Integer id, Date moment, Order order) {
		this.id = id;
		this.moment = moment;
		this.order = order;
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
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
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
		Payment other = (Payment) obj;
		return Objects.equals(id, other.id);
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Payment [id=");
		builder.append(id);
		builder.append(", moment=");
		builder.append(moment);
		builder.append(", order=");
		builder.append(order);
		builder.append("]");
		return builder.toString();
	}
}
