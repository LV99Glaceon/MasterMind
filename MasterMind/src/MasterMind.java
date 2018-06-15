import java.awt.GridLayout;

import javax.swing.*;

public class MasterMind extends JFrame {

	public static JFrame frame;
	public static GameState Gamestate;
	  public static void main( String[] args ) {

	    frame = new MasterMind();
	    frame.setSize( 1000,800 );
	    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	    frame.setTitle( "MasterMind" );
	    int Code1 = (int) (4 * Math.random()) + 1;
	    int Code2 = (int) (4 * Math.random()) + 1;
	    int Code3 = (int) (4 * Math.random()) + 1;
	    int Code4 = (int) (4 * Math.random()) + 1;
	    System.out.println("" + Code1+" " + Code2 +" " + Code3+ " " + Code4 );
	    for ( int r=0; r < 7; r++) {
	    	Row row = new Row();
	        row.Code1=Code1;
	        row.Code2=Code2;
	        row.Code3=Code3;
	        row.Code4=Code4;
		    frame.add( row);
	    }
	    Gamestate = new GameState();
	    frame.setLayout(new GridLayout(0,1,0,0) );
	    frame.setVisible( true );
	 	  }
	}