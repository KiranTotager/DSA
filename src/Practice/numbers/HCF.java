package Practice.numbers;

public class HCF {
    public static int hcf(int a,int b){
        int hcf=1;
        for(int i=1;i<=((a<b)?a:b);i++){
            if(a%i==0 && b%i==0)
                hcf=i;
        }
        return hcf;
    }
    public static void main(String[] args){
        int a=8,b=12;
        System.out.println("the hcf of "+a+" and "+b+" is :"+hcf(a,b));
    }
}
