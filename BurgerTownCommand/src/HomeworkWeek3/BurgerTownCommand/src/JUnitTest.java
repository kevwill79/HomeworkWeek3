package HomeworkWeek3.BurgerTownCommand.src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTest {

	@Test
	void test() {
		
		Grill gl = new Grill();
		Command command = new GrillOnCommand(gl);
		int temp = 0;
		
		GrillOnCommand gc = new GrillOnCommand(gl);
		SmartSpeaker speaker = new SmartSpeaker();
		
		assertEquals(0, gl.getTemp());
		assertSame(gl, gc.grill);
		
		speaker.setVoiceCommand(command);
		assertNotSame(command, gc);
		
		gl.perplexaHighResponse();
		gl.perplexaLowResponse();
		gl.perplexaMediumResponse();
		gl.perplexaOffResponse();
		gl.perplexaOnResponse();	
		
		AirFryer af = new AirFryer();
		af.perplexaOffResponse();
		af.perplexaOnResponse();
		
		AirFryerOffCommand afoff = new AirFryerOffCommand(af);
		afoff.execute();
		afoff.undo();
		afoff.perplexaOffCommand();
		
		AirFryerOnCommand afo = new AirFryerOnCommand(af);
		afo.execute();
		afo.undo();
		afo.perplexaOnCommand();
		
		VeggieSlicer vs = new VeggieSlicer();
		vs.perplexaOffResponse();
		vs.perplexaOnResponse();
		
		VeggieSlicerOffCommand vsoff = new VeggieSlicerOffCommand(vs);
		vsoff.execute();
		vsoff.undo();
		vsoff.perplexaOffCommand();
		
		VeggieSlicerOnCommand vso = new VeggieSlicerOnCommand(vs);
		vso.execute();
		vso.undo();
		vso.perplexaOnCommand();
	}

}
