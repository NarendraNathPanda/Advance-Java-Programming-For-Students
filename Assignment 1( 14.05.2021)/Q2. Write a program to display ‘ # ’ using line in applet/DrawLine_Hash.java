import java.applet.Applet;
import java.awt.Graphics;
public class DrawLine_Hash extends Applet
{
 public void paint(Graphics g)
 {
 	//draw vertical line
 	g.drawLine(70,50,190,50);
 	g.drawLine(40,120,160,120);

	 //draw horizontal line
 	g.drawLine(50,140,100,30);
 	g.drawLine(130,140,180,30);
 }
}