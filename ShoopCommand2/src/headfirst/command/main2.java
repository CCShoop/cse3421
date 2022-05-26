package headfirst.command;

public class main2 {

	public static void main(String[] args) {
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
		
		Projector projector = new Projector();
		
		Screen screen = new Screen();
		
		Light classroomLight = new Light("Classroom");
		
		StartClass startClass = new StartClass(projector, screen, classroomLight);
		EndClass endClass = new EndClass(projector, screen, classroomLight);
		
		remoteControl.setCommand(0, startClass, endClass);
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
	}

}
