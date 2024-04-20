public class compare{
    public static void main(String args[]){
        //if we want to compare to strings then the best practice is that we should use equals function
        //syntax -> string1.equals(string2);
        //we can also use == but it will not work all cases especially when we are comparing strings initialize with new keyword
        String s1 = "Shezzy";
        String s2 = "Shezzy";
        String s3 = new String("Shezzy");
        if(s1 == s2){//these are equall bcz s1 and s2 is pointing to same string 
            System.out.println("S1 and S2 are equals");
        }
        else{
            System.out.println("S1 and S2 are unequals");
        }

        if(s1==s3){//this will show unequality, bcz s3 is pointing to a new string
            System.out.println("S1 and S3 are equals");
        }
        else{
            System.out.println("S1 and S3 are unequals");
        }
        if(s1.equals(s3)){//equals see their content,as their content is same so these are equall
            System.out.println("S1 and S3 equals");
        }
        else{
            System.out.println("S1 and S3 are unequals");
        }
    }
}