class Node {
    int val;
    Node next;
}

public class _01_basic_ {
public static void main(String[] args) {
        // these  are nodes which contains value,
        //  but we not assign any address,
        //  and they are not linked to each other 
        Node a =  new Node(); a.val = 10;
        Node b =  new Node(); b.val = 20;
        Node c =  new Node(); c.val = 30;
        Node d =  new Node(); d.val = 40;
        Node e =  new Node(); e.val = 50;
        
        
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        System.out.println(a); // a = Node@1dbd16a6

        System.out.println(a.next); // Node@7ad041f3
        System.out.println(b);      // Node@7ad041f3

        System.out.println(b.next); //Node@251a69d7
        System.out.println(c);      //Node@251a69d7
    }
}