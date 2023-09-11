package cashbox;

import hall.order.Order;
import kitchen.Cooker;

public class CashMachine {

	private Order order;

	private Cooker cooker;

	public Double calculation() {
		return this.order.readFootMap().values().stream().reduce(0.0,
				(x, y) -> {
					if (y.getDiscount()!=null) {
						return x + y.getCost() * (100 - y.getDiscount()) * 0.01;
					} else {
						return x + y.getCost();
					}
				},
				Double::sum);
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public String sendOrderToCooker() {
		this.cooker.takeOrder(this.order);

		return "Заказ в обработке";
	}

	public void changeCooker(Cooker cooker) {
		this.cooker = cooker;
	}
}
