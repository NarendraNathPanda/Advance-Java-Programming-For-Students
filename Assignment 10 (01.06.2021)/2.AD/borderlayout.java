import java.awt.*;
import java.applet.*;
import java.util.*;
public class borderlayout extends Applet {
public void init() {
setLayout(new BorderLayout());
add(new Button("Narendra Nath Panda"),
BorderLayout.NORTH);
add(new Label("CST"),
BorderLayout.SOUTH);
add(new Label("20"), BorderLayout.EAST);
add(new TextField("Textarea"), BorderLayout.WEST);

String msg = "Taki " +
"North 24 PGS;\n" +
"Kuliadanga Market " +
"743456\n" ;
add(new TextArea(msg), BorderLayout.CENTER);
}
}