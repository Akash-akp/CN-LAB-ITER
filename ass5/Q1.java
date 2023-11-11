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
        String readLine;
		try {
			FileOutputStream fis = new FileOutputStream("/home/akashakp0037/CN_2141016135/ass5/akash.html");
            while((readLine = in.readLine())!=null){
                fis.write(readLine);
            }
            in.close();
			fis.close();
		}catch(Exception e) {
			System.out.println(e);
		}
    }
}
