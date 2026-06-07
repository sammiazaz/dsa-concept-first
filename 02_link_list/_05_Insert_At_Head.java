class Node{
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class _05_Insert_At_Head {

    public Node addAtHead(Node head, int val){
        Node temp = new Node(val);
        temp.next = head;
        return temp;
        
        
    }
    public static void main(String[] args) {
        // create node
        Node head = new Node(5);
        Node second = new Node(6);
        Node third = new Node(7);

        // link nodes
        head.next = second;
        second.next = third;

        // insert at head
        
        
        // print node
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
