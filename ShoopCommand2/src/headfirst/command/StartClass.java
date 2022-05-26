package headfirst.command;

public class StartClass implements Command {
	Projector projector;
	Screen screen;
	Light classroomLight;
	public StartClass(Projector projector, Screen screen, Light classroomLight) {
		this.projector = projector;
		this.screen = screen;
		this.classroomLight = classroomLight;
	}
	
	public void execute() {
		classroomLight.dim(15);
		screen.drop();
		projector.on();
	}
	
	public void undo() {
		classroomLight.on();
		screen.raise();
		projector.off();
	}
}
