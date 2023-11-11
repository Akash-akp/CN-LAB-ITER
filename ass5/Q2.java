import java.net.*;
import java.util.*;
import java.io.*;
public class Q2 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        try{
            String web1 = sc.nextLine();
			String Address1 = InetAddress.getByName(web1).toString();
            String web2 = sc.nextLine();
			String Address2 = InetAddress.getByName(web2).toString();
            if(Address1.equals(Address2)){
                System.out.println("2 sites are equal");
            }else{
                System.out.println("2 sites are not equal");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
