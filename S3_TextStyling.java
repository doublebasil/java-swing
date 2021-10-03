import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class S3_TextStyling {
    public static void main(String [] args) {
        guiClass guiObj = new guiClass();
    }
}

public class guiClass {
    private JFrame root;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    public guiClass() {
        root = new JFrame("Text color");
        root.setLayout(new GridLayout(3,1));
        root.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
        label1 = new JLabel("<html>Default <font color='red'>Red </font><font color='blue'>Blue </font><font color='green'> Green</font></html>", JLabel.CENTER);
        label2 = new JLabel("<html><body style=\"font-size: 20px;\">This should be massive</body></html>");
        label3 = new JLabel("<html><body style=\"background-color: blue; color: white;\">This is <em>ITALICS</em></body></html>", JLabel.RIGHT);
        root.add(label1);
        root.add(label2);
        root.add(label3);
        root.setSize(200,400);
        root.setVisible(true);
    }
}