import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class flowlayout extends Applet {
public void init() {
setLayout(new FlowLayout(FlowLayout.RIGHT));
add(new TextField("Text fild"));
add(new Button("Button"));
}
}