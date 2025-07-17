package Practice.numbers;

public class DeseriumNumber {
//    defination: Disarium Number
//
//    Given a number "n", The task is to find if it is Disarium or not. A number
//    is called Disarium if sum of its digits powered with their respective positions is equal
//    to the number itself.
//
//    Examples:
//
//    Input: n = 135
//    Output: Yes
//    Explanation: 1^1 + 3^2 + 5^3 = 135
//    Therefore, 135 is a Disarium number

//
//    Input: n = 80
//    Output: No
//    Explanation: 8^1 + 0^2 = 8

    public static int countDigit(int num){
        int count=0;
        while(num!=0){
            num/=10;
            count++;
        }
//        System.out.println(count);
        return count;
    }

    public static boolean isDeseriumNumber(int num){
        int temp=num;
        int res=0;
        int digits=countDigit(num);
        while(num!=0){
            res+=(int)Math.pow((num%10),digits);
            digits--;
//            System.out.println(num);
            num/=10;

        }
        return temp==res;
    }
    public static void main(String[] args){

       for(int num=0;num<10000;num++){
           System.out.print((isDeseriumNumber(num))?num+" is deserium number \n":"");
       }
    }
}
