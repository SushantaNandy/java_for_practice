//muti threading
class f implements Runnable{

    @Override
    public void run() {
        int i=1;
        while (i<5){

            i++;
        }
    }
}
class g implements Runnable{

    @Override
    public void run() {
        int i=1;
        while (i<5){

            i++;
        }
    }
}
public class fvfbng {

    public static void main(String[] args) {
    f obj=new f();
   Thread th1=new Thread(obj);
    g obj1=new g();
        Thread th2=new Thread(obj1);
    th1.start(); th2.start();

    }
}