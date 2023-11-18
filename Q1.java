import java.io.*;
import java.net.*;
public class Q1 {
    public static void main(String[]args){
        String website = "";
        URL u = new URL(website);
        CookieManager c = new CookieManager(u);
        if(website.substring(website.length()-3,website.length()).equals("gov")){
            c.setCookiePolicy(CookiePolicy.ACCEPT_NONE);
        }else{
            c.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
        }
        CookieHandler h = new CookieHandler() {
            
        };
    }
}
