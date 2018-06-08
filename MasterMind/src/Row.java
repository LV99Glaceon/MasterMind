import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

//import Game.HerstelknopHandler;


public class Row extends JPanel {
	  private JButton Field1, Field2, Field3, Field4;
	  private JTextField tekstvak;
	  
	  int Field1Colour;
	  int Field2Colour;
	  int Field3Colour;
	  int Field4Colour;
	  int y = 50; 
	  
	public Row() {

			setLayout(null);
		    Field1 = new JButton( "" );
		    Field1.setBounds(150,y,50,50);
		    Field1.setBackground(Color.GRAY);
		    Field1.addActionListener( new ColourChange1() );
		    
		    Field2 = new JButton( "" );
		    Field2.setBounds(300,y,50,50);
		    Field2.setBackground(Color.GRAY);
		    Field2.addActionListener( new ColourChange2() );
		    
		    Field3 = new JButton( "" );
		    Field3.setBounds(450,y,50,50);
		    Field3.setBackground(Color.GRAY);
		    Field3.addActionListener( new ColourChange3() );
		    
		    Field4 = new JButton( "" );
		    Field4.setBounds(600,y,50,50);
		    Field4.setBackground(Color.GRAY);
		    Field4.addActionListener( new ColourChange4() );

		    	
		    
		    add(Field1);
		    add(Field2);
		    add(Field3);
		    add(Field4);

		  }
		  
		  class ColourChange1 implements ActionListener {
		    public void actionPerformed( ActionEvent e ) {
		      Field1Colour++;
		      
		     if (Field1Colour >= 5) {
		    	 Field1Colour=0;
		     }
		     if (Field1Colour == 0) {
		    	 Field1.setBackground(Color.GRAY);
		     }
		     else if (Field1Colour == 1) {
		    	 Field1.setBackground(Color.BLUE);
		     }
		     else if (Field1Colour == 2) {
		    	 Field1.setBackground(Color.GREEN);
		     }
		     else if (Field1Colour == 3) {
		    	 Field1.setBackground(Color.YELLOW);
		     }
		     else if (Field1Colour == 4) {
		    	 Field1.setBackground(Color.RED);
		     }
		    }
		  }
		  
		  class ColourChange2 implements ActionListener {
			    public void actionPerformed( ActionEvent e ) {
			      Field2Colour++;
			      
			     if (Field2Colour >= 5) {
			    	 Field2Colour=0;
			     }
			     if (Field2Colour == 0) {
			    	 Field2.setBackground(Color.GRAY);
			     }
			     else if (Field2Colour == 1) {
			    	 Field2.setBackground(Color.BLUE);
			     }
			     else if (Field2Colour == 2) {
			    	 Field2.setBackground(Color.GREEN);
			     }
			     else if (Field2Colour == 3) {
			    	 Field2.setBackground(Color.YELLOW);
			     }
			     else if (Field2Colour == 4) {
			    	 Field2.setBackground(Color.RED);
			     }
			    }
			  }
		  class ColourChange3 implements ActionListener {
			    public void actionPerformed( ActionEvent e ) {
			      Field3Colour++;
			      
			     if (Field3Colour >= 5) {
			    	 Field3Colour=0;
			     }
			     if (Field3Colour == 0) {
			    	 Field3.setBackground(Color.GRAY);
			     }
			     else if (Field3Colour == 1) {
			    	 Field3.setBackground(Color.BLUE);
			     }
			     else if (Field3Colour == 2) {
			    	 Field3.setBackground(Color.GREEN);
			     }
			     else if (Field3Colour == 3) {
			    	 Field3.setBackground(Color.YELLOW);
			     }
			     else if (Field3Colour == 4) {
			    	 Field3.setBackground(Color.RED);
			     }
			    }
			  }
		  class ColourChange4 implements ActionListener {
			    public void actionPerformed( ActionEvent e ) {
			      Field4Colour++;
			      
			     if (Field4Colour >= 5) {
			    	 Field4Colour=0;
			     }
			     if (Field4Colour == 0) {
			    	 Field4.setBackground(Color.GRAY);
			     }
			     else if (Field4Colour == 1) {
			    	 Field4.setBackground(Color.BLUE);
			     }
			     else if (Field4Colour == 2) {
			    	 Field4.setBackground(Color.GREEN);
			     }
			     else if (Field4Colour == 3) {
			    	 Field4.setBackground(Color.YELLOW);
			     }
			     else if (Field4Colour == 4) {
			    	 Field4.setBackground(Color.RED);
			     }
			    }
			  }
}