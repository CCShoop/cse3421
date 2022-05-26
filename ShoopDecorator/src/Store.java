//Cael Shoop
//Pattern Assignment 2

public class Store {
	public void createStore() {
		condimentFactory condimentFactory1 = condimentFactory.getInstance();
		Register register1 = new Register();
		Beverage order = null;
		
		System.out.println("Starting new sale.\n");
		
		order = register1.startSale();
		
		System.out.println("Beverage ordered:");
		System.out.println(order.getDescription());
		System.out.println("\nCost:");
		System.out.println(order.cost());
	}
}
