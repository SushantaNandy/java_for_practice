class runn implements Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println("I am a thread");
        }
    }
}
class susThread extends Thread {
    public susThread(Runnable r, String name) {
        super(r, name);   // this is one more constructor
    }

}

public class multithreading4 {
    public static void main(String[] args) {
        runn ru=new runn();
        susThread obj=new susThread(ru,"nandy");
        Thread th=new Thread(obj);
        th.start();
    }
}
