import cashbox.CashMachine;
import hall.Waiter;
import kitchen.Cooker;
import kitchen.Menu;
import kitchen.menu.*;

public class Main {
	public static void main(String[] args) {

		Foot f1 = new Fish(1500.00, 200, 15);
		Foot m1 = new Meat(3000.00, 400, 10);
		Foot s1 = new Salad(300.00, 100);
		Foot b1 = new Beverages(250.00, 150);

		Menu menu = Menu.getInstance();
		menu.set(1, f1);
		menu.set(2, m1);
		menu.set(3, s1);
		menu.set(4, b1);

		Waiter Ivan = new Waiter();
		Cooker Semyon = new Cooker();

		System.out.println("Меню: ");
		System.out.println(menu.getFootHashMap());

		Ivan.createPaperOrder();
		Ivan.setFootInPaperOrder(1, f1);
		Ivan.setFootInPaperOrder(2, m1);
		Ivan.setFootInPaperOrder(3, s1);
		Ivan.setFootInPaperOrder(4, b1);


		CashMachine firstCacheMachine = new CashMachine();

		firstCacheMachine.changeCooker(Semyon);
		firstCacheMachine.setOrder(Ivan.getOrder());
		firstCacheMachine.sendOrderToCooker();

		firstCacheMachine.sendOrderToCooker();

		System.out.println("Приготовленные блюда по заказу: ");
		System.out.println(Semyon.cooking());

		System.out.println("Счет по заказу: ");
		System.out.println(firstCacheMachine.calculation());
	}
}