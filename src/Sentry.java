import org.asl.karelx.Uberbot;
import edu.fcps.karel2.Display;

/**
 * Patrols an area defined by four beepers.
 * 
 */
public class Sentry extends Uberbot {
   public Sentry() {
      super(9, 3, Display.WEST, Display.INFINITY);
   }
      
	// Provide one or more constructors, as you wish
	
	/**
	 * Patrol an area in a clockwise direction.  
	 * 
	 * Move forward until next to a beeper then turn right.  Repeat indefinitely.
	 *
	 */
	public void patrol() {
      move();
		while(!nextToABeeper()) {
         move();
      }
      turnLeft();   
	}
}
