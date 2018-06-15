import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

//import Game.HerstelknopHandler;


public class Row extends JPanel {
	  private JButton Field1, Field2, Field3, Field4,Submit,Checker1,Checker2,Checker3,Checker4;
	  private JTextField tekstvak;
	  int Field1Colour;
	  int Field2Colour;
	  int Field3Colour;
	  int Field4Colour;
	  int Field1Value;
	  int Field2Value;
	  int Field3Value;
	  int Field4Value;
	  int Code1; 
	  int Code2;
	  int Code3; 
	  int Code4; 
	  int y = 50; 
	  static boolean victory = true; 
	public Row() {

			setLayout(null);
		    Field1 = new JButton();
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

		    Submit = new JButton("Submit");
		    Submit.addActionListener( new Submit() );
		    Submit.setBounds(700,y,100,40);
		    
		    Checker1 = new JButton("");
		    Checker1.setBounds(800,y,25,25);
		    Checker1.setBackground(Color.GRAY);
		    
		    Checker3 = new JButton("");
		    Checker3.setBounds(825,y,25,25);
		    Checker3.setBackground(Color.GRAY);
		    
		    Checker2 = new JButton("");
		    Checker2.setBounds(800,y+25,25,25);
		    Checker2.setBackground(Color.GRAY);
		    
		    Checker4 = new JButton("");
		    Checker4.setBounds(825,y+25,25,25);
		    Checker4.setBackground(Color.GRAY);
		    
		    add(Field1);
		    add(Field2);
		    add(Field3);
		    add(Field4);
		    add(Submit);
		    add(Checker1);
		    add(Checker2);
		    add(Checker3);
		    add(Checker4);
		  }
		  
			class ResetHandler implements ActionListener {
				public void actionPerformed (ActionEvent e) {
				
				}
			}
	
		  class ColourChange1 implements ActionListener {
		    public void actionPerformed( ActionEvent e ) {
		      Field1Colour++;
		      
		     if (Field1Colour >= 5) {
		    	 Field1Colour=0;
		    	 Field1Value=0;
		     }
		     if (Field1Colour == 0) {
		    	 Field1.setBackground(Color.GRAY);
		     }
		     else if (Field1Colour == 1) {
		    	 Field1.setBackground(Color.BLUE);
		    	 Field1Value=1; 
		     }
		     else if (Field1Colour == 2) {
		    	 Field1.setBackground(Color.GREEN);
		    	 Field1Value=2;
		     }
		     else if (Field1Colour == 3) {
		    	 Field1.setBackground(Color.YELLOW);
		    	 Field1Value=3;
		     }
		     else if (Field1Colour == 4) {
		    	 Field1.setBackground(Color.RED);
		    	 Field1Value=4;
		     }
		    }
		  }
		  
		  class ColourChange2 implements ActionListener {
			    public void actionPerformed( ActionEvent e ) {
			      Field2Colour++;
			      
			     if (Field2Colour >= 5) {
			    	 Field2Colour=0;
			    	 Field2Value=0;
			     }
			     if (Field2Colour == 0) {
			    	 Field2.setBackground(Color.GRAY);
			     }
			     else if (Field2Colour == 1) {
			    	 Field2.setBackground(Color.BLUE);
			    	 Field2Value=1;
			     }
			     else if (Field2Colour == 2) {
			    	 Field2.setBackground(Color.GREEN);
			    	 Field2Value=2;
			     }
			     else if (Field2Colour == 3) {
			    	 Field2.setBackground(Color.YELLOW);
			    	 Field2Value=3;
			     }
			     else if (Field2Colour == 4) {
			    	 Field2.setBackground(Color.RED);
			    	 Field2Value=4;
			     }
			    }
			  }
		  class ColourChange3 implements ActionListener {
			    public void actionPerformed( ActionEvent e ) {
			      Field3Colour++;
			      
			     if (Field3Colour >= 5) {
			    	 Field3Colour=0;
			    	 Field3Value=0;
			     }
			     if (Field3Colour == 0) {
			    	 Field3.setBackground(Color.GRAY);
			     }
			     else if (Field3Colour == 1) {
			    	 Field3.setBackground(Color.BLUE);
			    	 Field3Value=1;
			     }
			     else if (Field3Colour == 2) {
			    	 Field3.setBackground(Color.GREEN);
			    	 Field3Value=2;
			     }
			     else if (Field3Colour == 3) {
			    	 Field3.setBackground(Color.YELLOW);
			    	 Field3Value=3;
			     }
			     else if (Field3Colour == 4) {
			    	 Field3.setBackground(Color.RED);
			    	 Field3Value=4;
			     }
			    }
			  }
		  class ColourChange4 implements ActionListener {
			    public void actionPerformed( ActionEvent e ) {
			      Field4Colour++;
			      
			     if (Field4Colour >= 5) {
			    	 Field4Colour=0;
			    	 Field4Value=0;
			     }
			     if (Field4Colour == 0) {
			    	 Field4.setBackground(Color.GRAY);
			     }
			     else if (Field4Colour == 1) {
			    	 Field4.setBackground(Color.BLUE);
			    	 Field4Value=1;
			     }
			     else if (Field4Colour == 2) {
			    	 Field4.setBackground(Color.GREEN);
			    	 Field4Value=2;
			     }
			     else if (Field4Colour == 3) {
			    	 Field4.setBackground(Color.YELLOW);
			    	 Field4Value=3;
			     }
			     else if (Field4Colour == 4) {
			    	 Field4.setBackground(Color.RED);
			    	 Field4Value=4;
			     }
			    }
			  }
		  class Submit implements ActionListener{
			  public void actionPerformed (ActionEvent e) {
				Submit.setVisible(false);  
				GameState.turnCount++;
				GameState.checkGameState();
				System.out.print(""+ GameState.turnCount);
				if (Field1Value == Code1 && Field2Value == Code2 && Field3Value == Code3 && Field4Value == Code4) {
				System.out.println("Code gekraakt!!");
				victory = true; 
				GameState.checkVictory();
				}
				if (Field1Value == Code1) {
					Checker1.setBackground(Color.BLACK); //invert Black and White
				}
				else if (Field1Value == Code2) {
					Checker1.setBackground(Color.WHITE);
				}
				else if (Field1Value == Code3) {
					Checker1.setBackground(Color.WHITE);
				}
				else if (Field1Value == Code4) {
					Checker1.setBackground(Color.WHITE);
				}
				if (Field2Value == Code2) {
					Checker2.setBackground(Color.BLACK);
				}
				else if (Field2Value == Code1) {
					Checker2.setBackground(Color.WHITE);
				}
				else if (Field2Value == Code3) {
					Checker2.setBackground(Color.WHITE);
				}
				else if (Field2Value == Code4) {
					Checker2.setBackground(Color.WHITE);
				}
				if (Field3Value == Code3) {
					Checker3.setBackground(Color.BLACK);
				}
				else if (Field3Value == Code2) {
					Checker3.setBackground(Color.WHITE);
				}
				else if (Field3Value == Code3) {
					Checker3.setBackground(Color.WHITE);
				}
				else if (Field3Value == Code4) {
					Checker3.setBackground(Color.WHITE);
				}
				if (Field4Value == Code4) {
					Checker4.setBackground(Color.BLACK);
				}
				else if (Field4Value == Code2) {
					Checker4.setBackground(Color.WHITE);
				}
				else if (Field4Value == Code3) {
					Checker4.setBackground(Color.WHITE);
				}
				else if (Field4Value == Code1) {
					Checker4.setBackground(Color.WHITE);
				}
			  }
		  }
}