public class Assignment {
    public static void main(String arg[]){
        //Q1
        //holow rectangle
        for(int i=1;i<=4;i++){
            for(int k=1;k<=5;k++){
                if(i==1 || k==1 || i==4 || k==5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            
            System.out.println();
            
        }
        System.out.println();

        //Q2
        //Inverted and rotated half pyramid
        for(int i=1;i<=4;i++){
            for(int j = 4; j >i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //Q3
        //inverted half pyramid with numbers
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        //Q4
        //floyd's triangle patteren
        int no=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(no+" ");
                no++;
            }
            System.out.println();
        }
    }
}
