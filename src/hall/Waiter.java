package hall;

import hall.order.Order;
import hall.order.PaperOrder;
import kitchen.menu.Foot;

import java.util.HashMap;

public class Waiter {

	private Order order;

	public void createPaperOrder() {
		this.order = new PaperOrder(new HashMap<>());
	}

	public void setFootInPaperOrder(Integer number, Foot foot) {
		this.order.writeDownFoot(number, foot);
	}

	public void outFootFromPaperOrder(Integer number) {
		this.order.strikeOutFoot(number);
	}
}
