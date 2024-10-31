public class binToDec{
    public static void main(String args[]){
        int n = 4;
        int pow = 0;
        int res=0;
        String bin = Integer.toBinaryString(n);
        String bin2 = "";
        while(n>0){
            int rem = n%2;
            bin2+=rem;
            n/=2;
        }
        System.out.println(bin);
        System.out.println(bin2);
        while(n>0){
            int rem = n%10;
            int curr = rem*(int)Math.pow(2,pow);
            res+=curr;
            n/=10;
            pow++;
        }
        System.out.println(res);
    }
}