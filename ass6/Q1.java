import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class Q1 {
    public static void main(String[]args) throws IOException {
        String website = "https://www.india.gov.in/";
        URL u = new URL(website);
        CookieManager c = new CookieManager();
        CookieHandler.setDefault(c);
        try {
            if (u.getAuthority().toLowerCase().endsWith(".gov")) {
                c.setCookiePolicy(CookiePolicy.ACCEPT_NONE);
            } else {
                c.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
            }
            BufferedReader in = new BufferedReader(new InputStreamReader(u.openStream()));
            String readLine;
            System.out.println("WebPage Content:");
            while ((readLine = in.readLine()) != null) {
//                System.out.println(readLine);
            }
            in.close();
            CookieStore cookieStore = c.getCookieStore();
            List<HttpCookie> cookies = cookieStore.getCookies();
            int cookieIdx = 0;
            for(HttpCookie ck:cookies) {
            	System.out.println("cookie:"+ ++cookieIdx);
            	System.out.println("Cookies name:"+ck.getName());
            	System.out.println("Domain: "+ck.getDomain());
            	System.out.println("Is secured:"+ck.getSecure());
            	System.out.println("Cookie value: "+ck.getValue());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
