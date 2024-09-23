public class fast_exponention{
    public static void main(String args[]){

        int number=3;
        int power=4;
        int answer=1;
        while(power>0){
            if((power&1)!=0){
                answer=answer*number;
            }
            number=number*number;
            power=power>>1;
        }
        System.out.print(answer);3^4=3*3*3*3=81
    }
}