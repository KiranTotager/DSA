package conceptLearning;

class parent{
    int l,b,i;
    parent(int l,int b){
        this.l=l;
        this.b=b;
    }
    parent(){
        System.out.println("this is the parent class constructor");
    }
    static int k=1;
    static void print(){
        System.out.println("this is parent class static method");
    }
    void area(){
        System.out.println("this is the area of the parent class");
    }
}
class child1 extends parent{
    int h,i;
    child1(int l,int b,int h,int i,int j){
        super(l,h);
        this.h=h;
        super.i=i;
        this.i=j;
    }
    child1(){
        System.out.println("this is the child1 constructor");
    }
    void volume(){
        System.out.println("the volume of the child1 is "+l*b*h);
        System.out.println(i+" , "+i);
    }

}
class grandchild extends child1{
    void printparent1area(){
        super.area();
    }
}

public class LearnInheritance {
    public static  void main(String[] args){
        grandchild gc=new grandchild();
        gc.printparent1area();
        child1 c1=new child1(5,6,3,3,4);

    }
}
