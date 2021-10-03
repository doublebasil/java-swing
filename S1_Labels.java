import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class S1_Labels {
	public static void main(String [] args) {
        guiClass guiObj = new guiClass();
	}
}

public class guiClass {
	private JFrame mainFrame;
	private JLabel label1;
	private JLabel label2;

	// Constructor
	public guiClass() {
		mainFrame = new JFrame("Swing!");
		mainFrame.setSize(400,400);
		mainFrame.setLayout(new GridLayout(2,1)); // Height by Width
		
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});

		label1 = new JLabel("", JLabel.CENTER);
		label1.setText("This is the first label");

		label2 = new JLabel("", JLabel.CENTER);
		label2.setText("Second label is here");

		mainFrame.add(label1);
		mainFrame.add(label2);
		mainFrame.setVisible(true);
	}
}