package Practice.numbers;

public class IsNumberPalindrome {
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
        int n = 96969;
        System.out.println(isNumberPalindrome(n)?"the "+n+" is palindrome":n+" is not palindrome");
    }

}
