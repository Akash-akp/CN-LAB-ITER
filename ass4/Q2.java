import java.net.InetAddress;
import java.util.*;
public class Q2 {
    public static void main(String[] args){
        try {
			InetAddress a = InetAddress.getLocalHost();
            System.out.println(a);
		}catch(Exception e) {
			System.out.println("Error");
		}
    }
}
