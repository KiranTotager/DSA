package Practice;

public class PatternsWithThirdVariable {
    public static void main(String args[]){
        int k=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+++" ");
            }
            System.out.println();
        }
        System.out.println("**********************************");
        for(int i=1;i<=5;i++){
            k=1;
            for(int j=1;j<=i;j++){
                System.out.print(k+++" ");
            }
            System.out.println();
        }
        System.out.println("**********************************");

        for(int i=1;i<=5;i++){
            k=5;
            for(int j=1;j<=i;j++){
                System.out.print(k--+" ");
            }
            System.out.println();
        }

        System.out.println("**********************************");
        for(int i=1;i<=5;i++){
            k=5+1-i;
            for(int j=1;j<=i;j++){
                System.out.print(k+++" ");
            }
            System.out.println();
        }
        System.out.println("**********************************");
        boolean flag=false;
        k=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
//                if(flag){
//                    System.out.print("1 ");
//                }else {
//                    System.out.print("0 ");
//                }
//                System.out.print(flag?"1 ":"0 ");
//                flag=!flag;
                System.out.print((
                        k+1)%2+" ");
                k++;
            }
            System.out.println();
        }

        for(int i=1;i<=5;i++){
            k=i;
            for(int j=1;j<=i;j++){
                System.out.print(k+++" ");
            }
            System.out.println();
        }

        System.out.println("*********************************");
        k=1;
        for(int i=1;i<5;i++){
            for(int j=1;j<=i;j++){
//                if(k==5)
//                    k=0;
//                System.out.print(k+++" ");
                System.out.print((k++%5)+" ");
//                k++;
            }
            System.out.println();
        }


        k=1;
        flag=true;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(flag?(char)(k+64)+" ":(char)(k+96)+" ");
                k++;
                flag=!flag;
            }
            System.out.println();
        }

        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print((i==1 || i==5 || j==1 || j==5)?"* ":"  ");
            }
            System.out.println();
        }
    }

}



