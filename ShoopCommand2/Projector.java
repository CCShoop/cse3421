
public class Projector {
	public static final int ON = true;
	public static final int OFF = false;
	boolean status;
 
	public Projector() {
	}
 
	public void on() {
		status = ON;
		System.out.println("Projector is now on.");
	}
  
	public void off() {
		status = OFF;
		System.out.println("Projector is now off.");
	}
  
	public int getStatus() {
		return status;
	}
}
