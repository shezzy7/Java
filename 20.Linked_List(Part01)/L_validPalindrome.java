
public class L_validPalindrome{
    Node head;
    public class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
            this.next = null;
        }
    }
    public void addFirst(int value){
        Node newNode = new Node(value);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //find middle node
    public Node findMiddle(){
        if(head==null || head.next==null){
            return null;
        }
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    //reverse 2nd half
    public Node reverseHalf(Node mid){
        Node prev = null;
        Node curr = mid;
        while(curr!=null){
            Node nextNode = curr.next;
            curr.next=prev;
            prev = curr;
            curr=nextNode;
        }
        return prev;
    }
    public boolean compare(Node head2){
        while(head2!=null){
            if(head.value!=head2.value){
                return false;
            }
            head2 = head2.next;
            head=head.next;
        }
        return true;
    }
    public static void main(String args[]){
        L_validPalindrome list = new L_validPalindrome();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(2);
        list.addFirst(2);
        list.addFirst(1);
        //for checking if a linked list is palindrom or not first we finnd midlle node of list
        Node mid = list.findMiddle();
        //then we reverse 2nd half of linked list mean from this middle node and get head of this 2nd half
        Node head2 = list.reverseHalf(mid);
        //now as we have list in parts,lets start comparing by both parts
        System.out.println(list.compare(head2));//true if palindrom else false
    }
}