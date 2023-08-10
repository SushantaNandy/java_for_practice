interface sampleinterface{
    void tc1();
    void tc2();
}
interface childinterface extends sampleinterface{
    void tc3();
    void tc4();
}
class sampleclass implements childinterface{

    @Override
    public void tc1() {
        System.out.println("tc1");
    }

    @Override
    public void tc2() {
        System.out.println("tc2");
    }

    @Override
    public void tc3() {
        System.out.println("tc3");
    }

    @Override
    public void tc4() {
        System.out.println("tc4");
    }
}

public class inheritance_in_interface {
    public static void main(String[] args) {
        sampleclass obj=new sampleclass();
        obj.tc1();
        obj.tc2();
        obj.tc3();
        obj.tc4();
    }
}
