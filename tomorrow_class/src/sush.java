interface webdriver{
    public void geturl();
    public void quit();
}
class chromedriver implements webdriver{
    public void geturl(){
    }
    public void quit(){

    }
}
public class sush {
    public static void main(String[] args){
        chromedriver driver=new chromedriver();
    }
}