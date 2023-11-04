import java.io.*;
public class Q1 {

	public static void main(String[] args) throws FileNotFoundException,IOException{
		try {
			FileInputStream fis = new FileInputStream("/home/akashakp0037/CN_2141016135/ass2/akash.txt");
			int data = fis.read();
			
			while(data!=-1) {
				System.out.print((char)data);
				data = fis.read();
			}
            System.out.println();
			fis.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}