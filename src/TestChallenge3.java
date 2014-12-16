/**
 * Read and implement all of the TODO items in the main method, below.
 * 
 */
import org.asl.karelx.Farmer;
import edu.fcps.karel2.Display;

public class TestChallenge3 {
	// TODO Complete the BeepFarmer class, provided, by implementing the reap() method

	public static void main(String[] args) {
      Display.openWorld("maps/farm.map");
      Display.setSize(12, 12);
      Display.setSpeed(5);
      BeepFarmer a = new BeepFarmer();
      a.reap(6, 3);
      a.teleport(4, 5);
		// TODO Load the "farm" map at set its size to 12 by 12
		// TODO Create an instance of a BeepFarmer with no beepers, anywhere on the farm
		// TODO Have the farmer gather all the beepers from the garden plot in the center of the map
		// TODO Have the farmer drop at location (1, 1) all the beepers picked and then move aside.
	}

}
