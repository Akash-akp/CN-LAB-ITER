import java.net.NetworkInterface;
import java.util.Collections;
import java.util.List;

public class Q4a {
    public static void main(String[] args) {
        try {
            List<NetworkInterface> networkInterfaces = Collections.list(NetworkInterface.getNetworkInterfaces());

            for (NetworkInterface networkInterface : networkInterfaces) {
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

