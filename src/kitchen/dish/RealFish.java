package kitchen.dish;

public class RealFish extends RealFoot {

	public RealFish(Integer calories) {
		this.calories = calories;
	}

	@Override
	public String toString() {
		return "Рыба - калорийность: " + this.calories;
	}
}
