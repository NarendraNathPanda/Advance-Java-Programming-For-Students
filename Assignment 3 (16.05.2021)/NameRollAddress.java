import java.applet.*;
import java.awt.*;
public class NameRollAddress extends Applet 
{
	int curX=0, curY=0;
	public void init() 
	{
		Font f = new Font("Arial", Font.PLAIN, 12); setFont(f);
	}
	public void paint(Graphics g)
	{ 
		FontMetrics fm = g.getFontMetrics();
		nextLine("Name : Narendra Nath Panda.", g);
		nextLine(" Roll_No : 10014033.", g); 
		sameLine(" Stream : Computer Science & Technology.", g); 
		nextLine("Address : Taki, West Bengal, INDIA.", g);

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
