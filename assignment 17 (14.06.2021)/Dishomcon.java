import java.io.*;
import java.net.*;
import java.util.*;
public class Dishomcon {
public static void main(String args[]) {
for (int j=0; j < args.length; j++) {
try {
URL rl = new URL(args[0]);
URLConnection obj = rl.openConnection( );
System.out.println("Content-length: " +
obj.getContentLength( ));
System.out.println("Content-type: " +
obj.getContentType( ));
System.out.println("Last modified: " + new
Date(obj.getLastModified( )));
}
catch (MalformedURLException ex) {
System.err.println(args[j] +
" is not a URL I understand");
}
catch (IOException erobj) {
System.err.println(erobj);
}
System.out.println( );
}
}
}