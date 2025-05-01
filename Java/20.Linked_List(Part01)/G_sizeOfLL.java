public class G_sizeOfLL{
    Node head;
    //for getting size of any list we can also wrote a loop in whic hhh we wil traverse our and create a variable in which we will go on incrementing  by one on each iteration until our last element rache
    //but there is also a simple in which we will define an attribute of in main class and using construcor of this class we will intilize it to 0
    //lets make it private so that  no one can access this from outside this class
    private int size;
        G_sizeOfLL(){
            size=0;
        }
        //lets also make a method that will print sizee of array
        void getSize(){
            System.out.println("Size of our linked list is -> "+size);
        }
    
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
            //as we add a node in list we will increment our size by 1 each time
            size++;
            //and if at any place we remove any node from linked list thenn we will decrement our size by 1 at this time
        }
    }

    public void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    
    public int getSize2(){
        int s = 0;
        if(head==null){
            return s;
        }
        Node curNode = head;
        while(curNode!=null){
            s++;
            curNode = curNode.next;
        }
        return s;
    }

    public static void main(String args[]){
        G_sizeOfLL list = new G_sizeOfLL();
        //lets print size of our list first
        list.getSize();
        //now lest add some elements in our list
        list.add(15);
        list.add(26);
        list.add(23);
        list.add(29);
        //now as we have added 4 elements in our list lets now check our list
        list.getSize();

        //we can also find size of our list by traversing our list
        System.out.print(list.getSize2());

    }
    
}