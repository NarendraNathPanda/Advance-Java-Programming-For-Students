/* Q1.Write a Java Program to print your name within a Rectangle box */
import java.applet.*;
import java.awt.*;
public class polygonName extends Applet
{
  
    public void paint(Graphics g)
    {
      g.setColor(Color.red);

	int wid = 300;
	int len = 150;
	//Draw a rectangle

	g.drawRect(100,175,wid,len);

	g.setColor(Color.green);
	String s = "Narendra Nath Panda";
	g.drawString(s,150,250);
    }
}
