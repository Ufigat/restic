package kitchen.menu;

public class Beverages implements Foot {

	public Double cost;

	public Integer calories;

	public Integer discount;

	public Beverages(Double coast, Integer calories, Integer discount) {
		this.cost = coast;
		this.calories = calories;
		this.discount = discount;
	}

	public Beverages(Double cost, Integer calories) {
		this.cost = cost;
		this.calories = calories;
	}

	@Override
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

	@Override
	public Integer getDiscount() {
		return null;
	}

	@Override
	public void setDiscount(Integer discount) {
		this.discount = discount;
	}
}
