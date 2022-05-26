//Cael Shoop
//Pattern Assignment 2

import java.util.Scanner;

public class Register {
	public Beverage startSale() {
		Beverage beverage = null;
		
		Scanner input = new Scanner(System.in);
		String line = input.nextLine();	
		if (line.equals("New sale")) {
			line = input.nextLine();
			switch (line) {
				case "Espresso":
					System.out.println("Selecting Espresso.\n");
					beverage = new Espresso();
					break;
				case "Darkroast":
					System.out.println("Selecting Dark Roast.\n");
					beverage = new DarkRoast();
					break;
				case "Dark roast":
					System.out.println("Selecting Dark Roast.\n");
					beverage = new DarkRoast();
					break;
				case "Dark Roast":
					System.out.println("Selecting Dark Roast.\n");
					beverage = new DarkRoast();
					break;
				case "Decaf":
					System.out.println("Selecting Decaf.\n");
					beverage = new Decaf();
					break;
				case "Houseblend":
					System.out.println("Selecting House Blend.\n");
					beverage = new HouseBlend();
					break;
				case "House blend":
					System.out.println("Selecting House Blend.\n");
					beverage = new HouseBlend();
					break;
				case "House Blend":
					System.out.println("Selecting House Blend.\n");
					beverage = new HouseBlend();
					break;
				default:
					System.out.println("Coffee does not exist.\n");
					break;
			}
			
			while (!line.equals("End sale")) {
				line = input.nextLine();
				switch (line) {
					case "Mocha":
						System.out.println("Adding Mocha.\n");
						beverage = new Mocha(beverage);
						break;
					case "Soy":
						System.out.println("Adding Soy.\n");
						beverage = new Soy(beverage);
						break;
					case "Sprinkles":
						System.out.println("Adding Sprinkles.\n");
						beverage = new Sprinkles(beverage);
						break;
					case "Steamedmilk":
						System.out.println("Adding Steamed Milk.\n");
						beverage = new SteamedMilk(beverage);
						break;
					case "Steamed milk":
						System.out.println("Adding Steamed Milk.\n");
						beverage = new SteamedMilk(beverage);
						break;
					case "Steamed Milk":
						System.out.println("Adding Steamed Milk.\n");
						beverage = new SteamedMilk(beverage);
						break;
					case "Whip":
						System.out.println("Adding Whip.\n");
						beverage = new Whip(beverage);
						break;
					case "Endsale":
						input.close();
						return beverage;
					case "End sale":
						input.close();
						return beverage;
					case "End Sale":
						input.close();
						return beverage;
					default:
						System.out.println("Condiment does not exist.\n");
						break;
				}
			}
			
			input.close();
		}
		
		return beverage;
	}
}
