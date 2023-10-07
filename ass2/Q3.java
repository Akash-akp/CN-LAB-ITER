import java.io.*;
public class Q3 {
    public static void main(String [] args) throws Exception {
        File a = new File("/home/akashakp0037/CN_2141016135/ass1/akash.txt");
        File b = new File("/home/akashakp0037/CN_2141016135/ass1/akash1.txt");
        copy(a,b);
    }

    public static void copy(File a,File b) throws Exception{
        try{
            FileInputStream file1 = new FileInputStream(a);
            FileInputStream file2 = new FileInputStream(b);
            int i;
            while((i = file1.read())!=-1){
                file2.write(i);
            }
        }catch(Exception e){
            System.out.println();
        }
    }
}
