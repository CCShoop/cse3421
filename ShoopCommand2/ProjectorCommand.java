
public class ProjectorCommand {
	Projector projector;

	public ProjectorCommand(Projector projector) {
		this.projector = projector;
	}
	public void execute(boolean status) {
		if (status == false) {
			projector.on();
		}
		else {
			projector.off();
		}
	}
	public boolean check() {
		return projector.getStatus();
	}
}
