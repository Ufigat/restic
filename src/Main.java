import hall.Waiter;
import hall.order.PaperOrder;
import kitchen.Cooker;
import kitchen.Menu;
import kitchen.menu.*;

import java.util.HashMap;

public class Main {
	public static void main(String[] args) {

		Foot f1 = new Fish(1500.00, 200);
		Foot m1 = new Meat(3000.00, 400);
		Foot s1 = new Salad(300.00, 100);
		Foot b1 = new Beverages(250.00, 150);


		Menu menu = Menu.getInstance();
		menu.set(1, f1);
		menu.set(2, m1);
		menu.set(3, s1);
		menu.set(4, b1);

		System.out.println("Меню: ");
		System.out.println(menu.getFootHashMap());

		Waiter Ivan = new Waiter();
		Cooker Semen = new Cooker();

		PaperOrder firstOrder = new PaperOrder(
				new HashMap<Integer, Foot>() {{
					put(1, f1);
					put(2, f1);
					put(3, m1);
					put(4, s1);
					put(5, b1);
				}}
		);

		System.out.println("Приготовленные блюда по заказу: ");
		System.out.println(Semen.cooking(firstOrder));
	}
}