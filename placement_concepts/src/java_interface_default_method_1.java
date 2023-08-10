interface camera{
    void takesnap();
    void recordvideo();
    default void record4k(){
        System.out.println("record in 4k");
    }
    //note:- an interface can have a static and default methods. Default methods enable us to add new functionality to
    // existing interface.
    // classes implemeting the interface need not implement the efault methods.
    //
}
interface Wifi{
    String[] takesnetwork();
    void connecttonetwork(String network);
}
class  cellPhone{
    void callnumber(int phnnumber){
        System.out.println("calling"+phnnumber);
    }
    void pickphone(){
        System.out.println("connecting...");
    }
}
class mysmartphone extends cellPhone implements Wifi,camera{

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
public class java_interface_default_method_1 {
    public static void main(String[] args) {
        mysmartphone obj=new mysmartphone();
         String[] networks=obj.takesnetwork();
        for (String str:networks
             ) {
            System.out.println(str);

        }
    }
}
