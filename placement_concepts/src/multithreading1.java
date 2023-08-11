class mythread1 extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("Thread 1 is running");
        }
    }
}

class mythread2 extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("Thread 2 is running");
        }
    }
}

public class multithreading1 {
    public static void main(String[] args) {
        mythread2 obj2 =new mythread2();
        mythread1 obj1=new mythread1();
        obj1.start();
        obj2.start();
    }
}
