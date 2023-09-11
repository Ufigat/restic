package kitchen.menu;

public class Fish implements Foot {

	private Double cost;

	private Integer calories;

	public Integer discount;

	public Fish(Double cost, Integer calories, Integer discount) {
		this.cost = cost;
		this.calories = calories;
		this.discount = discount;
	}

	public Fish(Double coast, Integer calories) {
		this.cost = coast;
		this.calories = calories;
	}


	@Override
	public String toString() {
		return "Рыба: " + "стоимость: " + this.cost + ", калорийность: " + this.calories;
	}

	@Override
	public Double getCost() {
		return cost;
	}

	@Override
	public void setCost(Double cost) {
		this.cost = cost;
	}

	@Override
	public Integer getCalories() {
		return calories;
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
