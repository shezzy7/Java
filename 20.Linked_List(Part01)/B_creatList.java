public class B_creatList{

    //for creatinng a Linked List we create an object of main class in main function and create a Node class as sub-class of main class.In this node class we declare atributes which specify type of data in linked list.
    Node head;
    class Node{
        //let store integer type data in our linked list
        int data;
        //for storing adresses of nodes we need to define a attribute of this node type
        Node next;//It is a recursive attribute(attribute of a class which is of this class type.Usually it is used when we have to store addresses of next elements in linked list,tree,graph etc)

        //lets make a constructor which will add element in list
        Node(int data){
            this.data=data;
            //also setting its next element's adress as null
            this.next=null;
        }
    } 
    
    public void add(int data){
        //we will create an object of node type whic store this comping value inn it and then we will point our head to this element as we are fetching our elements by head
        Node newNode = new Node(data);
        //as head and this newNode are are same type Node so we can assign thie newnode to head
        head = newNode;
    }
    public void print(){//we are not making this function static bcz this specific just for a class we can't call without using an object.
    
        //for fetching value of any Node of linkedList we write nodeName.data 
        System.out.print(head.data);
    }
    public static void main(String args[]){
        //lets create an object of mainClass type
        B_creatList list = new B_creatList();
        //with the help of this main class's object we can insert elements in list

        //lets add an element in list
        list.add(5);
        //lets print our list 
        list.print();

    }
}