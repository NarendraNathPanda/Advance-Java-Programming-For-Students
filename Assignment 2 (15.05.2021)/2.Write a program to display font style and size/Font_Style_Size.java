import java.awt.*;    
import java.applet.*;    
    
public class Font_Style_Size extends Applet    
{    
  Font f1,f2,f3;      
  public void  init()    
  { 
    f1 = new Font("Arial",Font.PLAIN,25);
    f2 = new Font("Arial",Font.ITALIC,30);     
    f3 = new Font("Arial",Font.BOLD,35);    
  }            
  public void  paint(Graphics g)    
  {    
    g.drawString("Narendra Nath Panda",50,50);    
    
    g.setFont(f1);     
    g.drawString("Narendra Nath Panda",50,80);    
    
    g.setFont(f2);     
    g.drawString("Narendra Nath Panda",50,110);    
    
    g.setFont(f3);     
    g.drawString("Narendra Nath Panda",50,140);    
  }    
}    
