package Practice.numbers;

public class PalindromeNumbersTill10000 {
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
    public static void main(String[] args) {
//        int n = 96969;
        for(int n=0;n<=10000;n++){
            System.out.print(isNumberPalindrome(n)?"the "+n+" is palindrome \n":"");

        }
    }
}
