package HomeworkWeek3.BurgerTownCommand.src;

public class SmartSpeakerTester {

	public static void main(String[] args) {
		SmartSpeaker speaker = new SmartSpeaker();
		
		//Grill objects
		Grill grill = new Grill();
		GrillOnCommand goc = new GrillOnCommand(grill);
		GrillOffCommand gofc = new GrillOffCommand(grill);
		GrillOnLowCommand golc = new GrillOnLowCommand(grill);
		GrillOnMediumCommand gomc = new GrillOnMediumCommand(grill);
		GrillOnHighCommand gohc = new GrillOnHighCommand(grill);
		
		//Grill tests
		speaker.setVoiceCommand(gohc);
		speaker.applianceVoiceCommand();
		speaker.setVoiceCommand(goc);
		speaker.applianceVoiceCommand();
		speaker.applianceUndoCommand();
		speaker.setVoiceCommand(golc);
		speaker.applianceVoiceCommand();
		speaker.applianceUndoCommand();
		speaker.setVoiceCommand(gofc);
		speaker.applianceVoiceCommand();
		speaker.setVoiceCommand(gomc);
		speaker.applianceVoiceCommand();
		speaker.applianceUndoCommand();
		
		//Air fryer objects
		AirFryer airFryer = new AirFryer();
		AirFryerOnCommand afo = new AirFryerOnCommand(airFryer);
		AirFryerOffCommand afof = new AirFryerOffCommand(airFryer);
		
		//Air fryer tests
		speaker.setVoiceCommand(afo);
		speaker.applianceVoiceCommand();
		speaker.setVoiceCommand(afof);
		speaker.applianceVoiceCommand();
		speaker.applianceUndoCommand();
		
		//Veggie objects
		VeggieSlicer veggieSlicer = new VeggieSlicer();
		VeggieSlicerOnCommand voc = new VeggieSlicerOnCommand(veggieSlicer);
		VeggieSlicerOffCommand vof = new VeggieSlicerOffCommand(veggieSlicer);
		
		//Veggie tests
		speaker.setVoiceCommand(voc);
		speaker.applianceVoiceCommand();
		speaker.setVoiceCommand(vof);
		speaker.applianceVoiceCommand();
		speaker.applianceUndoCommand();
	}

}
