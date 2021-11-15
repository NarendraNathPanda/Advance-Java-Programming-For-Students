import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JComboBoxDemo extends JApplet
implements ItemListener {
JLabel jl;
ImageIcon akash, ashish, narendra, somnath;
public void init() {
Container contentPane = getContentPane();
contentPane.setLayout(new FlowLayout());
JComboBox jc = new JComboBox();
jc.addItem("akash");
jc.addItem("ashish");
jc.addItem("narendra");
jc.addItem("somnath");
jc.addItemListener(this);
contentPane.add(jc);
jl = new JLabel(new ImageIcon("akash.jpg"));
contentPane.add(jl);
}
public void itemStateChanged(ItemEvent ie) {
String s = (String)ie.getItem();
jl.setIcon(new ImageIcon(s + ".jpg"));
}
}
