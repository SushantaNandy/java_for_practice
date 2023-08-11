//below are the commonly used constructors in thread class

class thr extends Thread{
    public thr(String name){   // this is one of them known as Thread(String name)
        super(name);
    }
    @Override
    public void run(){
          System.out.println("I am a thread");
    }
}


public class multithreading3 {
    public static void main(String[] args) {
        thr obj=new thr("Sushanta");
        thr obj1=new thr("nandy");
        obj.run();
        obj1.run();
        System.out.println("Id of the thread is "+obj.getId());  // We can view the id and name of the thread running
        System.out.println("Nmae of the thread is "+obj.getName());

        System.out.println("Namae of the  2 nd thread is "+obj1.getName());
    }
}
