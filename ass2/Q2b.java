import java.io.*;
public class Q1 {

	public static void main(String[] args) throws FileNotFoundException,IOException{
        long starttime = System.nanoTime();
		try {
			InputStream fis = new FileInputStream("/home/akashakp0037/CN_2141016135/ass1/akash.txt");
			int byteRead;
            byte[] buffer = new byte[1024];
			while((byteRead = fis.read(buffer)) != -1) {
				System.out.print((char)byteRead);
			    byteRead = fis.read();
			}
            System.out.println();
			fis.close();
		}catch(Exception e) {
			System.out.println(e);
		}
        long endtym = System.nanoTime();
        System.out.println(endtym-starttime);
	}

}