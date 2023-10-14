interface ResultCallback1{
	void onResult(double Result);
}

class Operand extends Thread{
	private ResultCallback1 callback;
	int n;
	Operand(ResultCallback1 callback,int n){
		this.callback = callback;
		this.n = n;
	}
	public void run(){
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		double ans = n*(n+1)/2;
		callback.onResult(ans);
	}
}


public class Q3 {
	public static void main(String []args) {
		int n = 5;
		ResultCallback1 callback = result -> {
            System.out.println("recieved result in the main thread :"+result);
        };
		 Operand workerThread = new Operand(callback,n);
         workerThread.start();
         try{
             workerThread.join();
         }catch(InterruptedException e){
             e.printStackTrace(); 
         }
         System.out.println("Main thread continues executing");
	}
}
