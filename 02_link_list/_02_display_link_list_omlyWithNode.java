class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

public class _02_display_link_list_omlyWithNode {
    public static void display(Node head){
        // write code here
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // you dont know how many nodes in LL
    // you only access Head Node
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next =b;
        b.next =c;
        c.next =d;
        d.next =e;
        e.next = null;
        display(a);
    }
}
