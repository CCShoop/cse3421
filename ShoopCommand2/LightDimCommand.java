
public class LightDimCommand implements Command {
	Light light;
	 
	public LightDimCommand(Light light) {
		this.light = light;
	}
 
	public void execute(int level) {
		light.dim(level);
	}
}
