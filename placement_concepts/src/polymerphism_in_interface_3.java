interface camera1{
    void takesnap();
    void recordvideo();
    default void record4k(){
        System.out.println("record in 4k");
    }
}
interface Wifi1{
    String[] takesnetwork();
    void connecttonetwork(String network);
}
class  cellPhone1{
    void callnumber(int phnnumber){
        System.out.println("calling"+phnnumber);
    }
    void pickphone(){
        System.out.println("connecting...");
    }
}
class mysmartphone1 extends cellPhone implements Wifi1,camera1{

    @Override
    public void takesnap() {
        System.out.println("taking screen shot");
    }

    @Override
    public void recordvideo() {
        System.out.println("recordinng video");
    }

    @Override
    public String[] takesnetwork() {
        String[] networks={"sushant","komal","sunita"};
        return  networks;
    }

    @Override
    public void connecttonetwork(String network) {
        System.out.println("connecting to network"+network);
    }
}
public class polymerphism_in_interface_3 {
    public static void main(String[] args) {
        //now if I do a dynamic method dispatch
        camera1 obj=new mysmartphone1();
        // I can't use the all the methods present inside mysmartphone1 but only those whose reverce i have created
        // meaning methods which are inside camer1 interface
        obj.takesnap();  // possible
        obj.record4k();  //possible
        //I can't
        //obj.takesnetwork(); //not popssible

    }
}
