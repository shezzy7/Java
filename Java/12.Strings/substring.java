public class substring{
    public static void main(String args[]){
        //print a substring  from a given string in which starting index and ending index is given
        String str = "shezzy's world";
        int si = 9;
        int ei = str.length();//ending index itself will not be included
        String subStr = ""; 
        for(int i=si;i<ei;i++){
            subStr += str.charAt(i);
        }
        System.out.println(subStr);

        //there is also a built in function for getting substring in java
        // syntax -> stringName.substring(startingIndex,endingIndex);
        String subStr2 = str.substring(si,ei);
        System.out.println(subStr2);
        //so  by this method we can aslo get substring of any given string
        String res = "CALICOUNH";
        String mainS= "CALICOUNH";

        String temp = "LAL";
        int count=1;
        for(int i =0;i<temp.length();i++){
            char ch = res.charAt(i);
            if(mainS.contains(ch)){
                int idx = res.indexOf(ch);
                
                if(idx!=-1){
                    res = res.substring(0, idx) + res.substring(idx+1,res.length());
                }
                else{
                    res = res+"CALICOUN";
                }

            }
            else{
                System.out.println(-1);
                break;
            }
        }

    }
}