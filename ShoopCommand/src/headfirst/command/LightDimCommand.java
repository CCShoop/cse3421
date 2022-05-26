package headfirst.command;

public class LightDimCommand implements Command {
	Light light;
	 
	public LightDimCommand(Light light) {
		this.light = light;
	}

	public void execute(int level) {
		light.dim(level);
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}
}
