import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class CheakBoxStatus extends Applet implements ItemListener
{
	String msg = "";
	Checkbox C,Cpp,java;
	public void init()
	{
		C = new Checkbox("C", null, true);
		Cpp = new Checkbox("C++");
		java = new Checkbox("java");
		add(C);
		add(Cpp);
		add(java);
		C.addItemListener(this);
		Cpp.addItemListener(this);
		java.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	// Display current state of the check boxes.
	public void paint(Graphics g)
	{
		msg = "Current state: ";
		g.drawString(msg, 6, 80);
		msg = " C: " + C.getState();
		g.drawString(msg, 6, 100);
		msg = " C++: " + Cpp.getState();
		g.drawString(msg, 6, 120);
		msg = " java: " + java.getState();
		g.drawString(msg, 6, 140);
	}
}
