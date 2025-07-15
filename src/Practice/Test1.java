package Practice;
import java.util.ArrayList;
import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        int rows=5;
//    for(int i=1;i<=rows;i++){
//        for(int j=rows+1-i;j<=5;j++){
//            System.out.print(j+"  ");
//        }
//        System.out.println();
//    }
//        double mid=Math.ceil((float)rows/2);
//        for(int i=1;i<=mid;i++){
//            for(int j=1;j<=i ;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for(int i=(int)mid-1;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//        for(int i =0;i<=rows;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }



//        for(int i=1;i<=rows;i++){
//            for(int j=65;j<=65-1+i;j++){
//                System.out.print((char)j+" ");
//            }
//            System.out.println();
//        }
//        System.out.println("*******************************8");
//        for(int i=1;i<=rows;i++){
//            for(int j=65-1+i;j>=65;j--){
//                System.out.print((char)j+" ");
//            }
//            System.out.println();
//        }
//
//        System.out.println("I***************************I");
//        for(int i=1;i<=5;i++){
//            for(int j=64+5;j>=70-i;j--){
//                System.out.print((char)j+" ");
//            }
//            System.out.println();
//        }
//
//
//        System.out.println("******************************");
//        for(int i=1;i<=rows;i++){
//            for(int j=1;j<=rows-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        System.out.println("******************************");
//        for(int i=1;i<=rows;i++){
//            for(int j=1;j<=rows-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//        System.out.println("******************************");
//        for(int i=1;i<=rows;i++){
//            for(int j=1;j<=rows-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=i;j>=1;j--){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//        System.out.println("******************************");
//        for(int i=1;i<=rows;i++){
//            for(int j=1;j<=rows-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=rows+1-i;j<=rows;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//        System.out.println("******************************");
//        for(int i=1;i<=rows;i++){
//            for(int j=1;j<=rows-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=rows;j>=rows+1-i;j--
//
//
//            ){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//        System.out.println("******************************");
//        for(int i=1;i<=rows;i++){
//            for(int j=1;j<=rows-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }




//        int rows=5;
        for(int i=1;i<=rows-1;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=rows;i>=1;i--){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            for (int j=i-1;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
System.out.println("************************************************");
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int j=rows;j>=rows+1-i;j--){
                System.out.print(j);
            }
            for(int j=rows+2-i;j<=rows;j++){
                System.out.print(j);
            }

            System.out.println();
        }
        for(int i=rows-1;i>=1;i--){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for (int j=rows;j>=rows-i+1;j--){
                System.out.print(j);
            }
            for(int j=rows-i+2;j<=rows;j++)
                System.out.print(j);

            System.out.println();
        }
        System.out.println("*********************************");

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=i-1 ;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i=rows-1;i>=1;i--){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=i-1;j>=1;j--)
                System.out.print(j);
            System.out.println();
        }
        System.out.println("**********************************");

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();

        }
        for(int i=rows-1;i>=1;i--){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int j=rows+1-i;j<=rows;j++){
                System.out.print(j);
            }
            for(int j=4;j>=rows+1-i;j--){
                System.out.print(j);
            }
            System.out.println();
        }

//
//
//        for(int i=1;i<=rows;i++){
//            for(int j=1;j<=rows-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=rows;j>=rows+1-i;j--){
//                System.out.print((char)(j+64));
//            }
//            for(int j=rows+2-i;j<=rows;j++){
//                System.out.print((char)(j+64));
//            }
//            System.out.println();
//        }
//
//        for(int i=1;i<=rows;i++){
//            for(int j=1;j<=rows-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print((char)(j+64));
//            }
//            for(int j=i-1 ;j>=1;j--){
//                System.out.print((char)(j+64));
//            }
//            System.out.println();
//        }
//        for(int i=1;i<=rows;i++){
//            for(int j=1;j<=rows-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=rows+1-i;j<=rows;j++){
//                System.out.print((char)(j+64));
//            }
//            for(int j=4;j>=rows+1-i;j--){
//                System.out.print((char)(j+64));
//            }
//            System.out.println();
//        }
//
//
//        for(int i=1;i<=rows;i++){
//            for(int j=1;j<=rows-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=i;j>=1;j--){
//                System.out.print((char)(j+64));
//            }
//            for(int j=2;j<=i;j++){
//                System.out.print((char)(j+64));
//            }
//            System.out.println();
//
//        }
    }
}
