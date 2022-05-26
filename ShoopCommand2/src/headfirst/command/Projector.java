package headfirst.command;

public class Projector {
	public static final boolean ON = true;
	public static final boolean OFF = false;
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
  
	public boolean getStatus() {
		return status;
	}
}
