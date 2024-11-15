import java.util.PriorityQueue;

public class C_ObjectComp {
            //What if we are asked to add objects of a class in Priority Queue , then how we will add them in our Priority Queue.Mean how we will compare one object with other to set its priority for adding it into PQ.
            //For example we have a class Student , which contains attributes name,rank.We have to create objects of this class and add them in priority queue.We want that the object with highest value of rank should be at front of queue and al others respectively.Then how can we compare rank of a student with all others to set its priority.
            //For this purpose we use an interface named Comparable.And this interface contains a method compareTo which is used for comparing objects on the basis of given attribute.
            //Syntax -> public class className implements Comparable<className>{body}
            static class Student implements Comparable<Student>{
                String name;
                int rank;
                public Student(String name , int rank){
                    this.name = name;
                    this.rank = rank;
                }

                //Now for comparing objects our Comparable interface contains a method compareTo which compares objects.As this method is of parent interface Compareable , so for using it in its child class Student we have to orride it (Overriding : Using methods of parent class in child class is called overriding)
                //Synatx -> @Override public dataTypeOfAttributeOnWhoseBaseWeWantToCompare compareTo(className obj){return this.comparingAtr-obj.comparingAtr}

                //here we want to compare objects on the basis of their ranks
                @Override
                public int compareTo(Student S2){
                    return this.rank-S2.rank;
                    //Basically here we are comaing a object with other.Here their ranks difference can be 0 or a positive value or a negative value.
                    //If first objects ranks is greater then second then it will return a positive value for example S1.rank = 10 and S2.rank= 5 . Then it will return a postive value 10-5=5.
                    //If it returns a negative value then it means that first is smaller then second.for example S1.rank = 5 and S2.rank= 10 . Then it will return a postive value 5-10=-5.
                    //If both are equall then thier differece will be returned 0.
                    //In java it is a built in functionality that if this method returns a positive value then it means that its priority is lower then S2.And vice versa.
                }
            }
            
        
    public static void main(String[] args) {
        
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("A" , 5));
        pq.add(new Student("B" , 3));
        pq.add(new Student("C" , 7));
        pq.add(new Student("D" , 4));

        //now lets print all of these
        while(!pq.isEmpty()){
            Student obj = pq.remove();
            System.out.println(obj.name+" -> "+obj.rank);
        }
    }
}
