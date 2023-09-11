package kitchen.menu;

public class Meat implements Foot {

	private Double cost;

	private Integer calories;

	private Integer discount;

	public Meat(Double cost, Integer calories, Integer discount) {
		this.cost = cost;
		this.calories = calories;
		this.discount = discount;
	}

	public Meat(Double coast, Integer calories) {
		this.cost = coast;
		this.calories = calories;
	}

	@Override
	public String toString() {
		return "Мясо: " + "стоимость: " + this.cost + ", калорийность: " + this.calories;
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
		return this.discount;
	}

	@Override
	public void setDiscount(Integer discount) {
		this.discount = discount;
	}
}
