import java.io.*;

public class Q2a {
    public static void main(String[] args){
        long starttime = System.nanoTime();
        try{
            FileInputStream fin = new FileInputStream("/home/akashakp0037/CN_2141016135/ass2/akash.txt");
            BufferedInputStream fis = new BufferedInputStream(fin);
            int data = fis.read();
            while(data!=-1){
                System.out.print((char)data);
                data = fis.read();
            }
            System.out.println();
            
            fis.close();
            fin.close();
        }catch(Exception e) {
            System.out.println(e);
        } 
        long endtym = System.nanoTime();
        System.out.println(endtym-starttime);
    }
}
