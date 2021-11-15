import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.awt.TextArea.*;
public class TextPassword extends Applet implements ActionListener
{
    TextField name, pass;
    public void init()
    {
    String letter = "my name is Narendra Nath Panda\n"+
        " i am a good person's , \n" +
         " i am student in KPC ";
            
         TextArea textDetails;
         {
            textDetails = new TextArea(letter, 10, 45);
            add(textDetails);
        }
    }
    {
        Label namep = new Label("Name: ", Label.RIGHT);
        Label passp = new Label("Password: ", Label.RIGHT); 
        name = new TextField(12);
        pass = new TextField(8);
        pass.setEchoChar('@');
        add(namep);
        add(name);
        add(passp);
        add(pass);
        // register to receive action events
        name.addActionListener(this);
        pass.addActionListener(this);
    }
    // User pressed Enter.
    public void actionPerformed(ActionEvent ae)
    {
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString("Name: " + name.getText(), 6, 60);
        g.drawString("Selected text in name: "+
        name.getSelectedText(), 6, 80);
        g.drawString("Password: " + pass.getText(), 6, 100);
    } 

}
