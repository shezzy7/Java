public class d_practice_Q1{
    public static String[] mergSort(String str[],int si,int ei){
        if(si==ei){
            String a[]={str[si]};
            return a;
        }

        int mid = si + (ei-si)/2;
        String left[]=mergSort(str,si,mid);
        String right[] = mergSort(str,mid+1,ei);
        String res[]=merge(left,right);
        return res;
    }
    //
    public static String[] merge(String left[],String right[]){
        int n=left.length;
        int m = right.length;
        String res[] = new String[n+m];
        int i=0,j=0,idx=0;
        while(i<n && j<m){
            if(left[i].compareTo(right[j])<0){
                res[idx]=left[i];
                i++;
            }
            else{
                res[idx]=left[j];
                j++;
            }
            idx++;
        }
        while(i<n){
            res[idx]=res[i];
            i++;
            idx++;
        }
        while(j<m){
            res[idx]=res[j];
            idx++;
            j++;
        }
        return res;
    }
    public static void main(){
        String str[]={"sun" , "mars" , "earth" , "mercury"};
        String a[] = mergSort(str,0,str.length-1);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}