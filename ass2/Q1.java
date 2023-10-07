import java.io.*;
public class Q1 {

	public static void main(String[] args) throws FileNotFoundException,IOException{
		try {
			FileInputStream fis = new FileInputStream("/home/akashakp0037/CN_2141016135/ass1/akash.txt");
			int data = fis.read();
			
			while(data!=-1) {
				System.out.print((char)data);
				// if((char)data==' ') {
				// 	System.out.println();
				// }
				data = fis.read();
			}
            System.out.println();
			
//			int data1 = fis.read();
//			int data2 = fis.read();
//			int data3 = fis.read();
			
//			System.out.println("data1 : "+data1+" "+(char)data1);
//			System.out.println("data2 : "+data2+" "+(char)data2);
//			System.out.println("data3 : "+data3+" "+(char)data3);
			fis.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}