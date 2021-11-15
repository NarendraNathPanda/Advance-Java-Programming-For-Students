import java.awt.*;
import javax.swing.*;

public class JLabelDemo extends JApplet{
public void init(){
// Get Content Pane
Container contentPane = getContentPane();
// Create an icon
ImageIcon ii = new ImageIcon("india-flag.gif");
// Create a Label
JLabel J1 = new JLabel("India", ii, JLabel.CENTER);
// Add Label to the Content Pane
contentPane.add(J1);
}
}
