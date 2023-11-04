public class Ex4 {
    public static void main(String[]args){
        Hello obj1 = new Hello();
        obj1.start();
    }
}
class Hello extends Thread{
    public void run(){
        System.out.println("New Thread");
    }
}