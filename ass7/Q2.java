import java.io.*;
import java.net.*;

public class Q2 {
    public static void main(String[] args) {

    String web = "time.nist.gov";

    try {
      Socket s = new Socket(web, 13);
      InputStream timeStream = s.getInputStream();
      int c;
      System.out.println("Time is ");
      while ((c = timeStream.read()) != -1)
        System.out.print((char) c);
      System.out.println();
    } 
    catch (Exception e) {
      System.err.println(e);
    }

  }

}
