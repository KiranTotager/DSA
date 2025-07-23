package Practice.numbers;

public class LCM {
    public static int lcm(int a,int b){
        int max=(a>b)?a:b;
        for(int i=max;i<=(a*b);i++){
            if(i%a==0 && i%b==0)
                return i;
        }
        return 0;
    }
    public static void main(String[] args){
        int a=5,b=7;
        System.out.println("the lcm of "+a+" and "+b+" is :"+lcm(a,b));
    }
}
