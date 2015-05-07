// Lab Exercise 1 Solution: GuessGame.java
// Guess the number
import javax.swing.JFrame;

public class CrapsGame
{
   public static void main( String args[] )
   {
      CrapsGameFrame crapsGameFrame = new CrapsGameFrame(); 
      crapsGameFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      crapsGameFrame.setSize( 300, 150 ); // set frame size
      crapsGameFrame.setVisible( true ); // display frame
   } // end main
} // end class GuessGame
