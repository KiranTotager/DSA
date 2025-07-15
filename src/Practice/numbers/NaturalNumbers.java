package Practice.numbers;

import java.util.Scanner;

public class NaturalNumbers {
    private static void printFactors(int n){
        for(int i=1;i<=n;i++){
//            if(i%2!=0){
//                System.out.print(i+" ");
//            }
//            else{
//                System.out.println(i);
//            }
//            System.out.println(mul+" * "+i+" = "+(mul*i));
            System.out.print(n%i==0?i+" ":"");
        }
    }
    public static void main (String[] args){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
        int  n=10;
//        int mul=3;
        printFactors(n);

    }
}
