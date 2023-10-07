public class Q2{
    public static void main(String[] args){
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.setPriority(1);
        t2.setPriority(9);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        t1.start();
        t2.start();
        // try{Thread.sleep(10);}catch(Exception e){}
    }
}
class Hi implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Hi");
            // try{Thread.sleep(500);}
            // catch(Exception e){};
        }
    }
}
class Hello implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Hello");
            // try{Thread.sleep(500);}
            // catch(Exception e){};
        }
    }
}