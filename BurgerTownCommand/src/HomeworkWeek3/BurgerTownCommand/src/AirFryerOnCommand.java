package HomeworkWeek3.BurgerTownCommand.src;

public class AirFryerOnCommand implements Command{
	AirFryer airFryer;
	
	public AirFryerOnCommand(AirFryer airFryer) {
		this.airFryer = airFryer;
	}
	
	public void execute() {
		perplexaOnCommand();
		airFryer.perplexaOnResponse();
	}
	
	//Sets the opposite condition of execute()
	public void undo() {
		airFryer.perplexaOffResponse();
	}
	
	//Simulates a voice command
	public void perplexaOnCommand() {
		System.out.println("You: " + SmartSpeaker.SPEAKER_NAME 
				+ " turn on air fryer ");
	}
}
