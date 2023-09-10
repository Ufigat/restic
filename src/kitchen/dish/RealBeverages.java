package kitchen.dish;

public class RealBeverages extends RealFoot {

	public RealBeverages(Integer calories) {
		this.calories = calories;
	}

	@Override
	public String toString() {
		return "Напиток - калорийность: " + this.calories;
	}
}
