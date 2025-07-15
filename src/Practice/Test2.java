package Practice;

public class Test2 {
    public static void main(String[]  args){
        int rows=7;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows;j++){
                System.out.print((i==1 || j==1 || i==rows || j==rows || (i==(rows/2)+1 && j<=rows/2+1) || (j==(rows/2)+1 && i<=rows/2+1) ||(i>rows/2 && i==j))?"* ":"  ");
            }
            System.out.println();
        }
        System.out.println("*********************************");
        for(int i=0;i<=5;i++){
            for(int j=0;j<=6;j++){
                System.out.print((((j%3)==0 && i==1) || ((j%3)!=0 && i==0) || (i-2==j) ||(j+i==8))?"* ":"  ");
                if(i==2 && j==1){
                    System.out.print("r");
                } else if (i==2 && j==2){
                    System.out.print("c");
                }else if (i==2 && j==3){
                    System.out.print("b");
                }
            }
            System.out.println();
        }

        for(int i=5;i>=0;i--){
            for(int j=0;j<=6;j++){
                System.out.print((((j%3)==0 && i==1) || ((j%3)!=0 && i==0) || (i-2==j) ||(j+i==8))?"* ":"  ");
                if(i==2 && j==1){
                    System.out.print("r");
                } else if (i==2 && j==2){
                    System.out.print("c");
                }else if (i==2 && j==3){
                    System.out.print("b");
                }
            }
            System.out.println();
        }
    }


}
