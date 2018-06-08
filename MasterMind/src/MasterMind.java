import java.awt.GridLayout;

import javax.swing.*;

public class MasterMind extends JFrame {

	  public static void main( String[] args ) {

	    JFrame frame = new MasterMind();
	    frame.setSize( 1000,800 );
	    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	    frame.setTitle( "MasterMind" );
	    for ( int r=0; r < 7; r++) {
		    frame.add( new Row() );
	      
	    }
	    frame.setLayout(new GridLayout(0,1,0,0) );
	    frame.setVisible( true );
	 	  }
	}