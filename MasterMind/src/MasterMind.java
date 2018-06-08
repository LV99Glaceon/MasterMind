import javax.swing.*;

public class MasterMind extends JFrame {

	  public static void main( String[] args ) {
	    JFrame frame = new MasterMind();
	    frame.setSize( 400, 200 );
	    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	    frame.setTitle( "MasterMind" );
	    JPanel paneel = new Game();
	    frame.setContentPane( paneel );
	    frame.setVisible( true );
	  }
	}