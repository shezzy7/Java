
public class p_numToStr{
    public static void convert(int n){
        if(n==0){
            return;
        }
        convert(n/10);
        int ls = n%10;
        switch(ls){
            case 0:
                System.out.print("zero ");
                break;
            case 1:
                System.out.print("One ");
                break;
            case 2:
                System.out.print("Two ");
                break;
            case 3:
                System.out.print("Three ");
                break;
            case 4:
                System.out.print("Four ");
                break;
            case 5:
                System.out.print("Five ");
                break;
            case 6:
                System.out.print("Six ");
                break;
            case 7:
                System.out.print("Seven ");
                break;
            case 8:
                System.out.print("Eight ");
                break;
            case 9:
                System.out.print("Nine ");
                break;
        }

    }
    public static void main(String args[]){

        // We are given a number (eg-2019) ,  we have to convert it to string like "two zero one nine".Solve it recursively.
        convert(1947);
        
    }
}