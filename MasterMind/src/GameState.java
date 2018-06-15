import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class GameState extends MasterMind {

	public static int turnCount = 1;

	public GameState() {

		JButton Reset = new JButton("reset");
		Reset.setBounds(450, 100, 40, 40);
		Reset.addActionListener(new ResetHandler());
		MasterMind.frame.add(Reset);
	}

	public static void checkGameState() {
		if (turnCount == 8)
		{
			System.out.println("you failed to crack the code");
			JDialog d = new JDialog(frame, "You Failed to Crack the Code", true);
			d.setBounds(400, 400, 400, 100);
			d.setLocationRelativeTo(frame);
			d.setVisible(true);
		}
	}
	}

class ResetHandler implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JFrame frame = MasterMind.frame;
		frame.setVisible(false);
		frame.dispose();
		MasterMind newMasterMind = new MasterMind();
		String[] args = new String[0];
		newMasterMind.main(args);
	}
}
