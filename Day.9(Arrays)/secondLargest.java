// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class secondLargest {
    public static void main(String[] args) {
        int arr[]={25,36,95,12,42,85,12,36};
        int loc1=0,loc2=1,first=arr[0],sec=arr[1];
        if(first<sec){
            int temp=first;
            first=sec;
            sec=temp;
            int loc=loc1;
            loc1=loc2;
            loc2=loc;
        }
        int k=2;
        while(k<arr.length){
            if(first<arr[k]){
                sec=first;
                first=arr[k];
                loc2=loc1;
                loc1=k;
            }
            else if(sec<arr[k]){
                loc2=k;
                sec=arr[k];
            }
            k++;
        }
        System.out.print("1st Lasrgest "+first+"\nat index "+loc1+"\nsecond largest "+sec+"\nat index "+loc2);
    }
}