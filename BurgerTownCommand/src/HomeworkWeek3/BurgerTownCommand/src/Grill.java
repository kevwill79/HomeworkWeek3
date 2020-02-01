package HomeworkWeek3.BurgerTownCommand.src;

//Grill temperature has 4 heat settings
public class Grill {
	//Used with undo() to revert to previous temp setting
	int temp;
	
	//Grill heating options
	public static final int OFF = 0;
	public static final int ON = 1;
	public static final int LOW = 2;
	public static final int MEDIUM = 3;
	public static final int HIGH = 4;
	
	public Grill() {
		//Default setting for the grill is off
		temp = OFF;
	}
	
	public int getTemp() {
		return temp;
	}
	
	//Methods for grill heat settings
	
	//On method is a pre-heat (very low heat) setting
	public void perplexaOnResponse() {
		temp = ON;
		System.out.println("Perplexa: Grill is set to pre-heat");
	}
	
	public void perplexaOffResponse() {
		temp = OFF;
		System.out.println("Perplexa: Grill is set to off");
	}
	
	public void perplexaLowResponse() {
		temp = LOW;
		System.out.println("Perplexa: Grill is set to low");
	}
	
	public void perplexaMediumResponse() {
		temp = MEDIUM;
		System.out.println("Perplexa: Grill is set to medium");
	}
	
	public void perplexaHighResponse(){
		temp = HIGH;
		System.out.println("Perplexa: Grill is set to high");
	}
}
