package HomeworkWeek3.BurgerTownCommand.src;

public class GrillOnLowCommand implements Command{
	Grill grill;
	int prevTemp;
	
	public GrillOnLowCommand(Grill grill) {
		this.grill = grill;
	}
	
	public void execute() {
		prevTemp = grill.getTemp();
		perplexaLowCommand();
		grill.perplexaLowResponse();
	}
	
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
	public void perplexaLowCommand() {
		System.out.println("You: " + SmartSpeaker.SPEAKER_NAME 
				+ " set the grill to low ");
	}
}
