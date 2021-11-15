import java.applet.*;
import java.awt.*;
public class Display_3_line extends Applet 
{
	int curX=0, curY=0;
	public void init() 
	{
		Font f = new Font("Arial", Font.PLAIN, 12); setFont(f);
	}
	public void paint(Graphics g)
	{ 
		FontMetrics fm = g.getFontMetrics();
		nextLine("Line 1. Line 1.1", g);
		nextLine("Line 2. Line 2.2.", g); 
		nextLine("Line 3", g);

		curX = curY = 0;
	}
	void nextLine(String s, Graphics g)
	{ 
		FontMetrics fm = g.getFontMetrics();
		curY += fm.getHeight();
		curX = 0;
		g.drawString(s, curX, curY);
		curX = fm.stringWidth(s);
	}
	void sameLine(String s, Graphics g)
	{
		FontMetrics fm = g.getFontMetrics();
		g.drawString(s, curX, curY);
		curX += fm.stringWidth(s);
	}
}
