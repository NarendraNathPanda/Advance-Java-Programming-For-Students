import java.awt.*;
import java.applet.*;
import java.util.*;
public class BorderLayoutDemo1 extends Applet
{
    public void init()
    {
        setLayout(new BorderLayout());
        add(new TextField ("I am Narendra", 20), BorderLayout.EAST);
        add(new Button("CST"), BorderLayout.EAST);
    }
}