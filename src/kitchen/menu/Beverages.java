package kitchen.menu;

public class Beverages implements Foot {

	public Double cost;

	public Integer calories;

	public Beverages(Double coast, Integer calories) {
		this.cost = coast;
		this.calories = calories;
	}

	public String toString() {
		return "Напиток: " + "стоимость: " + this.cost + ", калорийность: " + this.calories;
	}

	@Override
	public Double getCost() {
		return this.cost;
	}

	@Override
	public void setCost(Double cost) {
		this.cost = cost;
	}

	@Override
	public Integer getCalories() {
		return this.calories;
	}

	@Override
	public void setCalories(Integer calories) {
		this.calories = calories;
	}
}
