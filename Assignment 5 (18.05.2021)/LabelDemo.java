import java.awt.*;
import java.applet.*;
public class LabelDemo extends Applet
{
    public void init() 
    {
        Label one = new Label("Narendra Nath Panda");
        Label two = new Label("Kingston Polytechnic College");
        Label three = new Label("Taki");
        // add labels to applet window
        add(one);
        add(two);
        add(three);
}
}
