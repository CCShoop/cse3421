package headfirst.command;

public class EndClass implements Command {
	Projector projector;
	Screen screen;
	Light classroomLight;
	public EndClass(Projector projector, Screen screen, Light classroomLight) {
		this.projector = projector;
		this.screen = screen;
		this.classroomLight = classroomLight;
	}
	
	public void execute() {
		classroomLight.on();
		screen.raise();
		projector.off();
	}
	
	public void undo() {
		classroomLight.dim(15);
		screen.drop();
		projector.on();
	}
}
