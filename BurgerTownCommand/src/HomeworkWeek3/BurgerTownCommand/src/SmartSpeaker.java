package HomeworkWeek3.BurgerTownCommand.src;

//Smart speaker used to activate kitchen appliances
public class SmartSpeaker {
	public static final String SPEAKER_NAME = "Perplexa";
	Command voiceCommand;
	Command voiceUndoCommand;	//Holds the last command for undo()
	
	//No commands issued yet
	public SmartSpeaker() {
		Command noCommand = new NoCommand();
		voiceCommand = noCommand;
		voiceUndoCommand = noCommand;
	}
	
	//Speaker works by voice command - sets the command
	public void setVoiceCommand(Command voiceCommand) {
		this.voiceCommand = voiceCommand;
	}
	
	//The appliance receiving the command
	public void applianceVoiceCommand() {
		voiceUndoCommand = voiceCommand;
		voiceCommand.execute();
	}
	
	//Set the appliance to previous setting
	public void applianceUndoCommand() {
		System.out.println("You: Perplexa undo my last change");
		System.out.println("Perplexa: Changing back to the previous setting");
		voiceUndoCommand.undo();
	}
	
	public String toString() {
		String string = "";
		return string;
	}
}