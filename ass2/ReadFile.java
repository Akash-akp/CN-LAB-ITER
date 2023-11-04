import java.io.*;
public class ReadFile{
    public static void main(String []args){
        try{
            FileInputStream f = new FileInputStream("/home/akashakp0037/CN_2141016135/ass2/akash.txt");
            int i = f.read();
            while((i=f.read())!=-1){
                System.out.print((char)i+" ");
            }
            System.out.println();
            f.close();
        }catch(Exception e){
            System.out.println(e);
        }

    }
}