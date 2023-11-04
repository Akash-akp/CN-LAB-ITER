import java.io.*;

public class Q2b {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        long starttime = System.nanoTime();
        try {
            InputStream fis = new FileInputStream("/home/akashakp0037/CN_2141016135/ass2/akash.txt");
            int bytesRead;
            byte[] buffer = new byte[1024];
            while ((bytesRead = fis.read(buffer)) != -1) {
                System.out.write(buffer, 0, bytesRead);
            }
            System.out.println();
            fis.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        long endtym = System.nanoTime();
        System.out.println(endtym - starttime);
    }
}
