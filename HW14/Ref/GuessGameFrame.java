// GuessGameFrame.java
// Guess the number
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class GuessGameFrame extends JFrame 
{
   private static Random generator = new Random();
   private int number; // number chosen by application
   private int guessCount; // number of guesses
   private int lastDistance; // distance between last guess and number
   private JTextField guessInputJTextField; // for guessing
   private JLabel prompt1JLabel; // first prompt to user
   private JLabel prompt2JLabel; // second prompt to user
   private JLabel messageJLabel; // displays message of game status
   private JButton newGameJButton; // creates new game
   private Color background; // background color of application

   // set up GUI and initialize values
   public GuessGameFrame()
   {
      super( "Guessing Game" );

      guessCount = 0; // initialize number of guesses to 0
      background = Color.LIGHT_GRAY; // set background to light gray

      prompt1JLabel = new JLabel( 
         "I have a number between 1 and 1000." ); // describe game
      prompt2JLabel = new JLabel( 
         "Can you guess my number? Enter your Guess:" ); // prompt user

      guessInputJTextField = new JTextField( 5 ); // to enter guesses
      guessInputJTextField.addActionListener( new GuessHandler( ) );
      messageJLabel = new JLabel( "Guess result appears here." );

      newGameJButton = new JButton( "New Game" ); // starts new game
      newGameJButton.addActionListener(

         new ActionListener() // anonymous inner class
         {
            public void actionPerformed( ActionEvent e )
            {
               messageJLabel.setText( "Guess Result" );
               guessInputJTextField.setText( "" ); // reset guess field
               guessInputJTextField.setEditable( true ); // allow guesses
               background = Color.LIGHT_GRAY; // reset background color
               theGame(); // start new game
               repaint(); // repaint application
            } // end method actionPerformed
         } // end anonymous inner class
      ); // end call to addActionListener

      setLayout( new FlowLayout() ); // set layout
      add( prompt1JLabel ); // add first prompt
      add( prompt2JLabel ); // add second prompt
      add( guessInputJTextField ); // add guessing textfield
      add( messageJLabel ); // add message label
      add( newGameJButton ); // add button to create new game

      theGame(); // start new game
   } // end GuessGameFrame constructor

   // choose a new random number
   public void theGame()
   {
      number = generator.nextInt( 1000 ) + 1;
   } // end method theGame

   // change background color
   public void paint( Graphics g )
   {
      super.paint( g );
      getContentPane().setBackground( background ); // set background
   } // end method paint

   // react to new guess
   public void react( int guess ) 
   {
      guessCount++; // increment guesses
      int currentDistance = 1000; // set initial distance

      // first guess
      if ( guessCount == 1 ) 
      {
         lastDistance = Math.abs( guess - number );

         if ( guess > number )
            messageJLabel.setText( "Too High. Try a lower number." );
         else
            messageJLabel.setText( "Too Low. Try a higher number." );
      } // end if
      else 
      {
         currentDistance = Math.abs( guess - number );

         // guess is too high
         if ( guess > number ) 
         {
            messageJLabel.setText( "Too High. Try a lower number." );
            background = ( currentDistance <= lastDistance ) ?
               Color.RED : Color.BLUE;
            lastDistance = currentDistance;
         } // end if
         else if ( guess < number ) // guess is too low
         {
            messageJLabel.setText( "Too Low. Try a higher number." );
            background = ( currentDistance <= lastDistance ) ?
               Color.RED : Color.BLUE;
            lastDistance = currentDistance;
         } // end else if
         else // guess is correct
         {
            messageJLabel.setText( "Correct!" );
            background = Color.LIGHT_GRAY;
            guessInputJTextField.setEditable( false );
            guessCount = 0;
         } // end else

         repaint();
      } // end else
   } // end method react

   // inner class acts on user input
   class GuessHandler implements ActionListener
   {
      public void actionPerformed( ActionEvent e )
      {
         int guess = Integer.parseInt( guessInputJTextField.getText() );
         react( guess );
      } // end method actionPerformed
   } // end inner class GuessHandler
} // end class GuessGameFrame
