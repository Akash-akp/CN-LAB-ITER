import java.net.InetAddress;
import java.util.*;
public class Q1 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			String web = sc.nextLine();
			String Address = InetAddress.getByName(web).toString();
			System.out.println(Address);
		}catch(Exception e) {
			System.out.println("Error");
		}
		
	}
}