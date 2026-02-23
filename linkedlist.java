public class linkedlist {

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
    public static int size;

    // ADD FIRST
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // ADD LAST
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // PRINT LIST
    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // ADD IN MIDDLE
    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;

        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // REMOVE FIRST
    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }

        int val = head.data;

        if (size == 1) {
            head = tail = null;
        } else {
            head = head.next;
        }

        size--;
        return val;
    }

    // REMOVE LAST
    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public void reverse(){
        Node prev = null;
        Node curr= tail= head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void deletenthfromEnd ( int n) {
        // calculate size
        int sz= 0;
        Node temp  = head;
        while(temp != null){
            temp= temp.next;
            sz++;
        }
        if ( n == sz) {
            head= head.next; //removeFirst
            return;
        }
        //sz-n
        int i =1;
        int iToFind =sz-n;
        Node prev = head;
        while(i<iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
     }

     //Check if LL is a palindrome
     public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        
        while(fast != null || fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
     }
     public boolean checkPalindrome() {
        if ( head == null || head.next == null) {
            return true;
        }
        //find middle
        Node mid = findMid(head);

        //Reverse 2nd half
        Node curr= mid;
        Node prev= null;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev= curr;
            curr= next;
        }
        Node right = prev;
        Node left = head;
        //check if equal
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right= right.next;
        }
        return true;
     }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2, 3);

        ll.print();
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();

        System.out.println("Size = " + size);
        ll.reverse();
        System.out.println();
        ll.print();

        ll.deletenthfromEnd(3);
        ll.print();

        System.out.println(ll.checkPalindrome());
    }
}
