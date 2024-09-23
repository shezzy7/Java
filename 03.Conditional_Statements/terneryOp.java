public class terneryOp {
    public static void main(String arg[]){

        //ternery operator works like if else statment in whiche we we define a 
        //variable initialing it with some condition followed by two statements
        //if condition is true then first first statement will be assigned to variable
        //else second value will be stored in variable
        // syntax->  dataType variableName = condition? statement1:statement2;
        int num = (5>3)?3:5;//here condition will be checked if true then 3 will be 
        //assigned to num else 5 will be assigned
        System.out.println(num);
        String str = (4%2==0)? "Even":"Odd";
        System.out.println(str);
    }
}
