//Cael Shoop
//Pattern Assignment 2

public class Sprinkles extends CondimentDecorator {
	Beverage beverage;
	
	public Sprinkles(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Sprinkles";
	}
	
	public double cost() {
		return .20 + beverage.cost();
	}
}
