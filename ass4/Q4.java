import java.net.NetworkInterface;
import java.util.Enumeration;

public class Q4 {
    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();

            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterface = networkInterfaces.nextElement();
                System.out.println("Interface Name: " + networkInterface.getName());
                System.out.println("Display Name: " + networkInterface.getDisplayName());

                byte[] macAddress = networkInterface.getHardwareAddress();
                if (macAddress != null) {
                    System.out.print("MAC Address: ");
                    for (int i = 0; i < macAddress.length; i++) {
                        System.out.format("%02X%s", macAddress[i], (i < macAddress.length - 1) ? ":" : "");
                    }
                    System.out.println();
                }

                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
