//import java.util.*;

public class linked {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    //adding data to front (before current head)
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null){//check if ll is empty
            head = tail = newNode; //create a node
            return;
        }
        newNode.next = head; //set newNode to head creating a link;
        head = newNode;
    }
    //adding data to tail(after curretn tail)
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    //printing
    public void printLL(){
        if(head==null){
            System.out.println("LL is EMPTY");
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp.next=temp;
        }
        System.out.println();
    }
    public static void main(String args[]) {
        linked ll = new linked();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.printLL();
    }
}
