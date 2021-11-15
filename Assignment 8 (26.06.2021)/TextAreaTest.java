import java.awt.*;
import java.applet.*;

/*
<APPLET Code="TextAreaTest" Width=500 Height=200>
</APPLET>
*/

public class TextAreaTest extends Applet
{
	String letter = "my name is Narendra Nath Panda\n"+
        " i am a good person's , \n" +
         " i am student in KPC ";
            
         TextArea textDetails;
		 public void init()
         {
            textDetails = new TextArea(letter, 10, 45);
            add(textDetails);
        }
}
