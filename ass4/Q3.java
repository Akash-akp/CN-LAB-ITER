import java.net.*;
public class Q3 {
    public static void main(String[]args){
        try {
			InetAddress address = InetAddress.getByName("2409:4878:4379:0384:3874:9348:3048:3984");
            if(address instanceof Inet4Address){
                System.out.println("IPv4");
            }else if(address instanceof Inet6Address){
                System.out.println("IPv6");
            }
		}catch(Exception e) {
			System.out.println("Error");
		}
    }
}
