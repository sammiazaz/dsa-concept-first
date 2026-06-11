class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class _02_insert_at_last {
    Node head;
    Node tail;
    int size;

    void addLast(int val){
        if(size == 0){
            Node temp = new Node(val);
            temp.data = val;
            temp.next = null;
            head = tail = temp;
            size++;
        }else{
            Node temp = new Node(val);
            temp.data = val;
            temp.next = null;
            tail.next = temp;
            tail = temp;
            size++;

        }
    }
    public static void main(String[] args) {
        

        // Create nodes
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        // Link nodes
        head.next = second;
        second.next = third;

        // Print linked list
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");


        _02_insert_at_last list = new _02_insert_at_last();
        list.addLast(100);
    }
}

