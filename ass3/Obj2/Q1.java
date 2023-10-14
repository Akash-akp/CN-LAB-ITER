interface ResultCallback{
    void onResult(String result);
}

class WorkerThread extends Thread{
    private ResultCallback Callback;
    public WorkerThread(ResultCallback callback){
        this.Callback = callback;
    }
    public void run(){
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        String result = "Thread result data";
        Callback.onResult(result);
    }
}

public class Q1 {
    
}
