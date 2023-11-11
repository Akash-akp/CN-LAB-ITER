import java.net.URI;
import java.net.URISyntaxException;

public class Q3 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java URISplitter <uri>");
            return;
        }

        String uriString = args[0];

        try {
            URI uri = new URI(uriString);

            System.out.println("Scheme: " + uri.getScheme());
            System.out.println("Host: " + uri.getHost());
            System.out.println("Port: " + uri.getPort());
            System.out.println("Path: " + uri.getPath());
            System.out.println("Query: " + uri.getQuery());
            System.out.println("Fragment: " + uri.getFragment());
        } catch (URISyntaxException e) {
            System.out.println("Invalid URI: " + e.getMessage());
        }
    }
}
