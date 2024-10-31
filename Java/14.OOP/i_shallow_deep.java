public class i_shallow_deep{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.marks[0]=100;
        s1.marks[1]=75;
        s1.marks[2]=150;

        //We want to create another object s2 of Student class and and  want to copy s1 in s2 object using copy constrcutor
        Student s2 = new Student(s1);

        //lets print the data of s1

        System.out.println("s1 data");
        s1.display();

        //lets print the data of s2
        System.out.println("s2 data");
        s2.display();

        //data of both objects will be same as we have copied s1 into s2
        //if later in the code we make any changes in s1 data then this change will be also applied on s2 data? lets see
        s1.name = "shezzy";
        s1.age = 20;
        s1.marks[0]=65;
        //lets check where it have done modifications
        // data of s1
        System.out.println("s1 data");
        s1.display();

        // data of s2
        System.out.println("s2 data");
        s2.display();
        //in the output we will see that as we modify data of s1 then the array data of the s2 is also effected by it and changed according to s1 but other simple variables were not moodified.
        //What if we modify s2 object,will it make changes to the s1 object data?lets try
        s2.name="Shahzad";
        s2.age=19;
        s2.marks[2]=106;
        //now lets print both objects
         // data of s1
         System.out.println("s1 data");
         s1.display();
 
         // data of s2
         System.out.println("s2 data");
         s2.display();
         //here we will also see that it does effected the simple variables like name and age but it changes the values of array of marks in s1 also.

         //So this is basically what when we copy a onbject in another object through this method then for arrays no space is allocated for second object it just have the reference to values of object 1, mean if we make any changes to  array data through any object then it will be reflected in both objects .This is the concept of 'shallow copy'.


         //Then to overcome this problem we copy attributes an object to another object using a concept known as 'Deep Copy'.
         //lets do this on same objects 


    }
}

class Student{
    String name;
    int age;
    int marks[];

    Student(){
        marks = new int[3];
        name  = "Malang";
        age = 21;
    }

    //shallow copy constructor
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.age = s1.age;
    //     this.marks = s1.marks;
    // }

    //we have commented the above shallow copy constructor to make it a deep copy constuctor
    //Deep copy Constructor
        Student(Student s1){
            marks=new int[3];
            this.name=s1.name;
            this.age=s1.age;
            //we will copy the elements of array using loop
            for(int i=0;i<marks.length;i++){
                this.marks[i]=s1.marks[i];
            }
            //this will assign some other memory to array for object s2 and changes made in s1 or s2's array would not affect other
        }




    //display contents
    void display(){
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
        System.out.print("Marks : ");
        for(int i=0;i<3;i++){
            System.out.print(this.marks[i]+" ");
        }
        System.out.println();

    }




}