import java.net.*;
import java.util.*;
import java.io.*;
public class Q2 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        try{
            String web1 = sc.nextLine();
            String web2 = sc.nextLine();
			URL u1 = new URL(web1);
            URL u2 = new URL(web2);
            if(u1.equals(u2)){
                System.out.println("2 sites are equal");
            }else{
                System.out.println("2 sites are not equal");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
