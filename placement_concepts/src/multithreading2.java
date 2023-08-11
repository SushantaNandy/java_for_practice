class myrunnable1 implements Runnable{

    @Override
    public void run() {
        while (true) {
            System.out.println("I am thread 1");
        }
    }
}

class myrunnable2 implements Runnable{

    @Override
    public void run() {
        while (true) {
            System.out.println("I am thread 2");
        }
    }
}


public class multithreading2 {
    public static void main(String[] args) {
        myrunnable1 obj1=new myrunnable1();
        Thread t1=new Thread(obj1);// since we can't directly implement the start methods that';s why
        myrunnable2 obj2=new myrunnable2();
        Thread t2=new Thread(obj2);
        // obj1.start();    ----------> we can't directly impletments start method here.
        t1.start();
        t2.start();
    }
}

//Thread lyfecycle
//1. New ----> Instance of thread created which is not yet started by invoking start() method.
//2. Runnable---> After invocating of start() and before it is selected to be run by the scheduler.
//3. Running---> After thread schedule has selected it.
//4. Non-Runnable--->Thread alive, not eleigible to run.
//5. Terminated---> run() method has existed.
