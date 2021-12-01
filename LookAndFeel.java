import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class S2_Style {
    public static void main(String [] args) {
        guiClass guiObjClassic = new guiClass();
    }
}

public class guiClass {
    // Initialise variables
    private JFrame root;
    private JButton button;
    private JLabel label;
    // Constructor
    public guiClass() {
        root = new JFrame("Stylish");
        // Change the style
        try {
            // UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");     // Looks to be default
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
        }
        catch (UnsupportedLookAndFeelException e) {System.out.println("UnsupportedLookAndFeelException");}
        catch (ClassNotFoundException e) {System.out.println("ClassNotFoundException");}
        catch (InstantiationException e) {System.out.println("InstantiationException");}
        catch (IllegalAccessException e) {System.out.println("IllegalAccessException");}

        root.setLayout(new GridLayout(2,1));        // Height by Width
        root.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});

        button = new JButton("Button");
        label = new JLabel("Label");
        root.add(button);
        root.add(label);
        root.setSize(200, 200);
        root.setVisible(true);
    }
}
