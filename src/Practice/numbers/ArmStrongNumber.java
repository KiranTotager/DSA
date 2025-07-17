package Practice.numbers;

public class ArmStrongNumber {
    // defination of armstrong number is:An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits in the number. For example, 153 is an Armstrong number because 153 = 1^3 + 5^3 + 3^3 (where 3 is the number of digits in 153)



    public static boolean isArmStrongNumber(int num){
        int digit=CountDigit.countDigit(num);
        int temp=num;
        int res=0;
        while(temp!=0){
            int rem=temp%10;
            res+=(int)Math.pow(rem,digit);
            temp/=10;
        }
        return res==num;
    }
    public static void main(String[] args){
//        int num=153;
       for(int num=0;num<=10000;num++){
           System.out.print(isArmStrongNumber(num)?"the "+num+" is armstrong number \n":"");
       }
    }

}
