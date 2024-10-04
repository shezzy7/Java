
public class c_subsets{
    public static void subsets(String str , String res,int i){ //time complexity(n*n^2) , space complexity(n)
        // base case
        if(i==str.length()){
            if(res.length()==0){

                System.out.println("' '");
            }
            else{
                System.out.println(res);
            }
            return;
        }
        // Each chracter can make a choice first is that he can choose to be a part of that subset for this we will add it to this subset and make a call for next character
        subsets(str,res+str.charAt(i),i+1);
        // Second step where this character can make a choice of not to be a part of this subset and we will be not add it to this subset while making a call for next character.Actually this step is a step of backtracking
        subsets(str,res,i+1);
    }

    public static void main(String args[]){
        String str = "abc";
        subsets(str,"",0);
    }
}