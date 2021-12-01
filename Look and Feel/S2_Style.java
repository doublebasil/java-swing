// For linux this actually makes it look worse
// Some weird inconsitency depeding on which is guiCLass is called first

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class S2_Style {
    public static void main(String [] args) {
        guiClass guiObjClassic = new guiClass(false);
        guiClass guiObjStyled = new guiClass(true);
    }
}

public class guiClass {
    // Setup contents
    private JFrame guiRoot;
    private JLabel label;
    private JButton button;
    // Constructor
    public guiClass(boolean changeStyle) {
        // Create main window
        if (changeStyle) {
            guiRoot = new JFrame("Stylish!");
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            }
            catch (UnsupportedLookAndFeelException e) {}
            catch (ClassNotFoundException e) {}
            catch (InstantiationException e) {}
            catch (IllegalAccessException e) {}
        }
        else {
            guiRoot = new JFrame("Classic!");
        }
        guiRoot.setLayout(new GridLayout(1, 2));        // Height by Width
        guiRoot.setSize(400,400);
        guiRoot.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
        // Create buttons and labels
        label = new JLabel("Hello!", JLabel.CENTER);
        button = new JButton("I'm a button");
        // Add to main window
        guiRoot.add(label);
        guiRoot.add(button);
        guiRoot.setVisible(true);
    }
}
