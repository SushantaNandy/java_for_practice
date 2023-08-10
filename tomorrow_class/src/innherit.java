class sus{

    sus(){
        System.out.println("I am a base class constructor");
    }
    sus(int i){
        System.out.println("I am a base class overloaded constructor");
    }

}
class nan extends sus{

    nan(){

        System.out.println("I am a child class constructor");
    }
    nan(int j){
        super(j);
        System.out.println("I am a child class overloaded constructor");
    }
}

public class innherit {
    public static void main(String[] args) {
        nan n=new nan(9);
        //sus s=new sus(4);
    }
}
