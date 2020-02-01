package HomeworkWeek3.BurgerTownCommand.src;

/*Creates a null object. Sometimes used when you don't have a
 * meaningful object to return but you don't want the client to
 * to handle null.
 * 
 * I'm implementing this because of the future appliances that
 * may be added to Burger Town.
 */
public class NoCommand implements Command{
	public void execute() {}
	public void undo() {}
}
