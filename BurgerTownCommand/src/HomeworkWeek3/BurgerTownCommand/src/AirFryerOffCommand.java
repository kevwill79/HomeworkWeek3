package HomeworkWeek3.BurgerTownCommand.src;

public class AirFryerOffCommand implements Command{
	AirFryer airFryer;
	
	public AirFryerOffCommand(AirFryer airFryer) {
		this.airFryer = airFryer;
	}
	
	public void execute() {
		perplexaOffCommand();
		airFryer.perplexaOffResponse();
	}
	
	//Sets the opposite condition of execute()
	public void undo() {
		airFryer.perplexaOnResponse();
	}
	
	//Simulates a voice command
	public void perplexaOffCommand() {
		System.out.println("You: " + SmartSpeaker.SPEAKER_NAME 
				+ " turn off air fryer ");
	}
}
