import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JComboBoxDemo extends JApplet
implements ItemListener {
JLabel jl;
ImageIcon moinul, nadim, narendra, Sachin;
public void init() {
Container contentPane = getContentPane();
contentPane.setLayout(new FlowLayout());
JComboBox jc = new JComboBox();
jc.addItem("moinul");
jc.addItem("nadim");
jc.addItem("narendra");
jc.addItem("Sachin");
jc.addItemListener(this);
contentPane.add(jc);
jl = new JLabel(new ImageIcon("moinul.jpg"));
contentPane.add(jl);
}
public void itemStateChanged(ItemEvent ie) {
String s = (String)ie.getItem();
jl.setIcon(new ImageIcon(s + ".jpg"));
}
}