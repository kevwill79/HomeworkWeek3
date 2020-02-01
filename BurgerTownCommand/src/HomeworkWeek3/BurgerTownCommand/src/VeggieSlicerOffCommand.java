package HomeworkWeek3.BurgerTownCommand.src;

public class VeggieSlicerOffCommand implements Command {
	VeggieSlicer veggieSlicer;
	
	public VeggieSlicerOffCommand(VeggieSlicer veggieSlicer) {
		this.veggieSlicer = veggieSlicer;
	}
	
	public void execute() {
		perplexaOffCommand();
		veggieSlicer.perplexaOffResponse();
	}
	
	//Sets the opposite condition of execute()
	public void undo() {
		veggieSlicer.perplexaOnResponse();
	}
	
	//Simulates a voice command
	public void perplexaOffCommand() {
		System.out.println("You: " + SmartSpeaker.SPEAKER_NAME 
				+ " turn off veggie slicer ");
	}
}
