package kitchen;

import hall.order.Order;
import kitchen.dish.*;
import kitchen.menu.Beverages;
import kitchen.menu.Fish;
import kitchen.menu.Meat;
import kitchen.menu.Salad;

import java.util.List;

public class Cooker {

	public List<RealFoot> cooking(Order order) {
		return order.readFootMap()
				.values()
				.stream()
				.map(
						x -> {
							if (x.getClass().equals(Fish.class)) {
								return this.cookingRealFish((Fish) x);
							} else if (x.getClass().equals(Meat.class)) {
								return this.cookingRealMeat((Meat) x);
							} else if (x.getClass().equals(Salad.class)) {
								return this.cookingRealSalad((Salad) x);
							}
							return this.cookingRealBeverages((Beverages) x);
						}
				).toList();
	}

	private RealFish cookingRealFish(Fish fish) {
		return new RealFish(fish.getCalories());
	}

	private RealMeat cookingRealMeat(Meat meat) {
		return new RealMeat(meat.getCalories());
	}

	private RealBeverages cookingRealBeverages(Beverages beverages) {
		return new RealBeverages(beverages.getCalories());
	}

	private RealSalad cookingRealSalad(Salad salad) {
		return new RealSalad(salad.getCalories());
	}
}
