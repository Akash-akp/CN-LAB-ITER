import java.net.*;
import java.io.*;
public class Q1 {
    public static void main(String [] args){
        String web = "google.com";
        try{
            Socket s = new Socket(web,80);
            System.out.println("Local Address : "+s.getLocalAddress());
            System.out.println("Local Port : "+s.getLocalPort());
            System.out.println("Port : "+s.getPort());
            s.close();
        }catch(Exception e){
            
        }
    }
}
