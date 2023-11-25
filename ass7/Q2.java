import java.io.*;
import java.net.*;

public class Q2 {
    public static void main(String[] args) {

    String web = "time.nist.gov";

    try {
      Socket theSocket = new Socket(web, 13);
      InputStream timeStream = theSocket.getInputStream();
      StringBuffer time = new StringBuffer();
      int c;
      while ((c = timeStream.read()) != -1)
        time.append((char) c);
      String timeString = time.toString().trim();
      System.out.println("It is " + timeString + " at " + web);
    } 
    catch (UnknownHostException ex) {
      System.err.println(ex);
    } catch (IOException ex) {
      System.err.println(ex);
    }

  }

}
