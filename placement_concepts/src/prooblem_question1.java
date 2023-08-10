abstract class Pen{
    abstract void write();
    abstract void refill();
}
class fountainPen extends Pen{

    @Override
    void write() {
        System.out.println("writing");
    }

    @Override
    void refill() {
        System.out.println("refill");
    }
    void changenib(){
        System.out.println("changing the nib");
    }
}
public class prooblem_question1 {
    public static void main(String[] args) {
        fountainPen obj=new fountainPen();
        obj.changenib();
    }
}
