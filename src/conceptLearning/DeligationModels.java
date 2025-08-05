package conceptLearning;

class os{
    os(){
        System.out.println("this is os constructor");
    }
    void checkOs(){
        System.out.println("os is up");
    }
}
class charger{
    charger(){
        System.out.println("this is charger constructor");
    }
    void checkCharger(){
        System.out.println("Charger is working");
    }
}
class phone{
    os s=new os();
    phone(){
        System.out.println("this is phone constructor");
    }
    void checkPhone(){
        System.out.println("the phone is working");
    }
    void checkCharger(charger c){
        System.out.println("here inside the phone class we are checking the charger");
        c.checkCharger();
    }
}
public class DeligationModels {
    public static void main(String[] args){
        phone p=new phone();
        charger c=new charger();
        p.checkPhone();
        c.checkCharger();
        p.checkCharger(c);
        p.s.checkOs();
        p=null;
//        p.checkPhone();
//        c.checkCharger();
    }
}
