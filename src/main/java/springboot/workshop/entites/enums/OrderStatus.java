package springboot.workshop.entites.enums;

public enum OrderStatus {
	WAIT_PAYMENT(1, "Aguardando pagamento"),
	PAID(2, "Pago"),
	SHIPPED(3, "Enviado"),
	DELIVERED(4, "Entregue"),
	CANCELED(5, "Cancelado");
	
	private Integer id;
	private String description;
	
	private OrderStatus(int id, String description) {
		this.id = id;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}
	
	public static OrderStatus toEnum(Integer id) {
		if(id == null) {
			return null;
		}
		for(OrderStatus order: OrderStatus.values()) 
		{
			if(order.getId().equals(id)) {
				return order;
			}
		}
		return null;
	}
}
