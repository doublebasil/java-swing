import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class S4_ButtonFunctions {
    public static void main(String [] args) {
        guiClass guiObj = new guiClass();
    }
}

public class guiClass {
    private JFrame groot;
    private JLabel glabel;
    private JButton gbutton;
    public guiClass() {
        groot = new JFrame("Functional Buttons!");
        groot.setLayout(new GridLayout(2,1));        // Height by Width
        groot.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        glabel = new JLabel("This is a label");
        gbutton = new JButton("I am a button");

        groot.add(glabel);
        groot.add(gbutton);
        groot.setSize(200, 200);
        groot.setVisible(true);
    }
}
