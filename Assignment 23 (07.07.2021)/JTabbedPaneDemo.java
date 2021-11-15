import javax.swing.*;
public class JTabbedPaneDemo extends JApplet
{
    public void init() 
    {
        JTabbedPane jtp = new JTabbedPane();
        jtp.addTab("Cities", new CitiesPanel());
        jtp.addTab("Colors", new ColorsPanel());
        jtp.addTab("Flavors", new FlavorsPanel());
        getContentPane().add(jtp);
    }
}
class CitiesPanel extends JPanel
{
    public CitiesPanel() 
    {
        JButton b1 = new JButton("Kolkata");
        add(b1);
        JButton b2 = new JButton("Delhi");
        add(b2);
        JButton b3 = new JButton("Mumbai");
        add(b3);
        JButton b4 = new JButton("Bangalore");
        add(b4);
    }
}
class ColorsPanel extends JPanel 
{
    public ColorsPanel() 
    {
        JCheckBox cb1 = new JCheckBox("Red");
        add(cb1);
        JCheckBox cb2 = new JCheckBox("Green");
        add(cb2);
        JCheckBox cb3 = new JCheckBox("Blue");
        add(cb3);
    }
}   
class FlavorsPanel extends JPanel 
{
    public FlavorsPanel() 
    {
        JComboBox jcb = new JComboBox();
        jcb.addItem("Chocolate");
        jcb.addItem("Biryani");
        jcb.addItem("chipes");
        add(jcb);
    }
}