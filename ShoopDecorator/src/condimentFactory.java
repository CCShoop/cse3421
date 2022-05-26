//Cael Shoop
//Pattern Assignment 2

class condimentFactory {
	private static condimentFactory instance = null;
	
	public static condimentFactory getInstance() {
		if (instance == null) {
			instance = new condimentFactory();
		}
	
		return instance;
	}
}
