import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
import java.util.*;
import java.io.*;
public class Q1 {
    public static void main(String []args) throws Exception{
        System.out.println("Enter the url:");
        Scanner sc = new Scanner(System.in);
        String website = sc.nextLine();
        URL u = new URI(website).toURL();
        BufferedReader in = new BufferedReader(
            new InputStreamReader(u.openStream())
        );
        BufferedWriter writer = new BufferedWriter(new FileWriter("Download.html"));
        String readLine;
        System.out.println("WebPage Content:");
		while((readLine=in.readLine())!=null){
            System.out.println(readLine);
            writer.write(readLine);
            writer.newLine();
        }
        in.close();
        System.out.println("\nobjects:");
        Object o = u.getContent();
        System.out.println(o.getClass().getName());

    }
}
