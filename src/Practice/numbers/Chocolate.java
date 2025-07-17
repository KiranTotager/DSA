package Practice.numbers;

public class Chocolate {
    public static boolean isNumberPalindrome(int num){
        int res=0;
        int temp=num;
        while(num>0){
            int rem=num%10;
            res=(res*10)+rem;
            num/=10;
        }
//        System.out.println(res);
        return (res==temp);
    }
    public static void main(String[] args){
        int rows=8;
        int k=1;
//        for(int i=0;i<rows;i++){
//            int j=0;
//            while (j<i){
//                if(isNumberPalindrome(k)){
//                    System.out.print(k+" ");
//                    k++;
//                    j++;
//                }
//                else{
//                    k++;
//                }
//            }
//            System.out.println();
//        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<=i;){
                if(isNumberPalindrome(k)){
                    System.out.print(k+" ");
                    j++;
                }
                k++;
            }
            System.out.println();
        }
    }
}
