package kitchen.dish;

public class RealSalad extends RealFoot {

	public RealSalad(Integer calories) {
		this.calories = calories;
	}

	@Override
	public String toString() {
		return "Салат. калорийность: " + this.calories;
	}
}
