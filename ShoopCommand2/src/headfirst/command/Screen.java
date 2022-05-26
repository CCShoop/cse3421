package headfirst.command;

public class Screen {
	public static final boolean DROP = true;
	public static final boolean RAISE = false;
	boolean position;
 
	public Screen() {
	}
 
	public void drop() {
		position = DROP;
		System.out.println("Screen is dropping.");
	}
  
	public void raise() {
		position = RAISE;
		System.out.println("Screen is rising.");
	}
  
	public boolean getPosition() {
		return position;
	}
}
