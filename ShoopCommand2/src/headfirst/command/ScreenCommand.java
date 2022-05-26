package headfirst.command;

public class ScreenCommand {
	Screen screen;

	public ScreenCommand(Screen screen) {
		this.screen = screen;
	}
	public void execute(boolean position) {
		if (position == false) {
			screen.drop();
		}
		else {
			screen.raise();
		}
	}
	public boolean check() {
		return screen.getPosition();
	}
}
