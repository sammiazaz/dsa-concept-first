class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class _03_AddAtFirst {

    // Function to add node at first
    static Node addFirst(Node head, int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;

        return head;
    }

    public static void main(String[] args) {

        // Create nodes
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        // Link nodes
        head.next = second;
        second.next = third;

        // Add at first using function
        head = addFirst(head, 5);

        // Print linked list
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}