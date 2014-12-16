/**
 * Read and implement all of the TODO items in the main method, below.
 * 
 */
import edu.fcps.karel2.Display;
import org.asl.karelx.Squarebot; 
 
public class TestChallenge1 {
	// TODO Complete the provided Sentry class by implementing its patrol() method

	public static void main(String[] args) {
      Display.setSize(10,10);
      Display.setSpeed(10);
      Squarebot a = new Squarebot(9, 3);
      int z = 1;
      for(int d = 0; d < z; d++) {
      int x = 4;
      for(int y = 0; y < x; y++) {
         a.putBeeper();
         int w = 5;
         for(int s = 0; s < w; s++) {
            a.move();
         }
      a.turnLeft();
      }
      Sentry b = new Sentry();
      while(b.hasBeepers()) {
         b.move();
         while(b.frontIsClear()&&!b.nextToABeeper()) {
            int f = 4;
         for(int g = 0; g < f; g++) {
            b.move();
         }
         b.turnRight();
         }
      }
   
         
         
      
		// TODO Load a default map 
		// TODO Create a Squarebot and have it place beepers at the corners of a rectangle
		//   	with bottom right corner at (9, 3) and sized for 5 beepers on each side (see picture)
		// TODO Create a Sentry and have it patrol clockwise around the beepers, indefinitely
	}
  }
}
