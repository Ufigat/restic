package kitchen.menu;

public class Fish implements Foot {

	private Double cost;

	private Integer calories;

	public Fish(Double coast, Integer calories) {
		this.cost = coast;
		this.calories = calories;
	}

	@Override
	public String toString() {
		return "Рыба: " + "стоимость: " + this.cost + ", калорийность: " + this.calories;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Integer getCalories() {
		return calories;
	}

	public void setCalories(Integer calories) {
		this.calories = calories;
	}
}
