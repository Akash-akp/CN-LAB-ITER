import java.util.*;
import java.io.*;
import java.net.*;

public class Q2 {
	public static void main(String[]args) {
		String website = "https://www.google.com";
		try {
			URL u = new URI(website).toURL();
			URLConnection uc = u.openConnection();
			String contentType = uc.getContentType();
			int Start = contentType.indexOf("charset=");
			String encoding = contentType.substring(Start+8);
			InputStreamReader in = new InputStreamReader(uc.getInputStream(),encoding);
			int c;
			while((c=in.read())!=-1) {
				System.out.print((char)c);
			}
			in.close();
		}catch(Exception e) {
			System.out.println();
		}
		
	}
}