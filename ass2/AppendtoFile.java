import java.io.*;
public class AppendtoFile {
    public static void main(String []args){
        String fileName = "/home/akashakp0037/CN_2141016135/ass2/akash.txt";
        String TexttoAppend = "This text to Append";
        try{
            FileWriter writer = new FileWriter(fileName,true);
            writer.write(TexttoAppend);
            System.out.println("String append to file");
            writer.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
