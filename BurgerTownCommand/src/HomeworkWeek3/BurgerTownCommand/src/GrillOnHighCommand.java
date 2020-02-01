package HomeworkWeek3.BurgerTownCommand.src;

public class GrillOnHighCommand implements Command{
	Grill grill;
	int prevTemp;
	
	public GrillOnHighCommand(Grill grill) {
		this.grill = grill;
	}
	
	public void execute() {
		prevTemp = grill.getTemp();
		perplexaHighCommand();
		grill.perplexaHighResponse();
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
	public void perplexaHighCommand() {
		System.out.println("You: " + SmartSpeaker.SPEAKER_NAME 
				+ " set the grill to high ");
	}
}
