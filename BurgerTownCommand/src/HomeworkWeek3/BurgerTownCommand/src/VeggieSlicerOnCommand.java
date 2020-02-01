package HomeworkWeek3.BurgerTownCommand.src;

public class VeggieSlicerOnCommand implements Command{
	VeggieSlicer veggieSlicer;
	
	public VeggieSlicerOnCommand(VeggieSlicer veggieSlicer) {
		this.veggieSlicer = veggieSlicer;
	}
	
	public void execute() {
		perplexaOnCommand();
		veggieSlicer.perplexaOnResponse();
	}
	
	//Sets the opposite condition of execute()
	public void undo() {
		veggieSlicer.perplexaOffResponse();
	}
	
	//Simulates a voice command
	public void perplexaOnCommand() {
		System.out.println("You: " + SmartSpeaker.SPEAKER_NAME 
				+ " turn on veggie slicer ");
	}
}
