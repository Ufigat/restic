package kitchen.dish;

public class RealMeat extends RealFoot {

	public RealMeat(Integer calories) {
		this.calories = calories;
	}

	@Override
	public String toString() {
		return "Мясо - калорийность: " + this.calories;
	}
}
