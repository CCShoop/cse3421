
public class Screen {
	public static final int DROP = true;
	public static final int RAISE = false;
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
  
	public int getPosition() {
		return position;
	}
}
