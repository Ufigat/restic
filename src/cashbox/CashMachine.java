package cashbox;

import cashbox.discounts.Discount;
import cashbox.dto.Check;
import hall.order.Order;

public class CashMachine {

	private Discount discount;

	private Order order;

	public void calculation(Check check) {
		
	}

	public void changeDiscount(Discount discount) {
		this.discount = discount;
	}
}
