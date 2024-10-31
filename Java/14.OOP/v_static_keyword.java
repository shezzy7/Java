public class v_static_keyword{
    public static void main(String args[]){
        School s1 = new School();
        s1.institute="KIMS";
        s1.name="Jawad";
        //lets print it
        System.out.println("S1's institute : "+s1.institute);
        System.out.println("S1's name : "+s1.name);
        //now if we creat another object print its institute name then KIMS will be printed.This is bcz institute is declared as static.;
        School s2 = new School();
        System.out.println("S2's institute : "+s2.institute);
        //If we want to print name for object s2 then error will be generated this is bcz name is not a static variable
        //And also if we change the valu of innstitute through s2 the its valu will be changed for all the objects 
        s2.institute="KIPS";
        //lets print it
        System.out.println("S1's institute : "+s1.institute);
        System.out.println("S2's institute : "+s2.institute);
        //So its is static variable

        s1.avg(75,85,96);
        s2.avg(100,50,100);

    }
}
//Static keyword in java is used to share the ssame variable or method of a given class.We can declare variables and methods in classes using static keyword with them.This is different from simple variable such that if we initialize it some value then this value will be same for all the objects of this class and if any of the objects cahnges the value of this variable then its value will be changes for all the objects.
//Like variable we also make our functions static.How can be static function can be benefacial for us?Lets try to understand it.Let we have cread a class in this we have declared a method with gets marks of diffrent sunbjects of student of return the avg of marks every time.Now if declare 100 objects of the same class and called thid function for all the 100 students then for each object new memory will be created for this function and it will increase the space complexity of programm but if we make this method as static then no new function will be created for each .The same function will be performing the task
//We can also create static blocks and static nested classes
class School{
    String name;
    int age;

    static String institute;

    static int avg(int math,int phy,int chem){
        return (math+phy+chem)/3;
    }
  

} 
//So this the the reason that we declare our main functions as static 