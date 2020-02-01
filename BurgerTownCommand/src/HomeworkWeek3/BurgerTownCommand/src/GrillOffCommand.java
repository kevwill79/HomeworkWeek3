package HomeworkWeek3.BurgerTownCommand.src;

public class GrillOffCommand implements Command{
	Grill grill;
	int prevTemp;	//Previous temperature
	
	public GrillOffCommand(Grill grill) {
		this.grill = grill;
	}
	
	public void execute() {
		prevTemp = grill.getTemp();
		perplexaOffCommand();
		grill.perplexaOffResponse();
	}
	
	//Sets grill back to previous temperature
	public void undo() {
		if(prevTemp == Grill.OFF)
			grill.perplexaOffResponse();
		else if(prevTemp == Grill.ON)
			grill.perplexaOnResponse();
		else if(prevTemp == Grill.LOW)
			grill.perplexaLowResponse();
		else if(prevTemp == Grill.MEDIUM)
			grill.perplexaMediumResponse();
		else if(prevTemp == Grill.HIGH)
			grill.perplexaHighResponse();
	}
	
	//Simulates a voice command
	public void perplexaOffCommand() {
		System.out.println("You: " + SmartSpeaker.SPEAKER_NAME 
				+ " turn off grill ");
	}
}
