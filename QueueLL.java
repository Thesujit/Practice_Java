public class Queue{
    Static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.data = null;
        }
    }
    Static class Queue {
        Static Node head = null;
        Static Node tail  = null;

        public static boolean isEmpty() {
            return head == null & tail == null;
        }
        //add
        public static void add(int data ) {
            Node new Node = new Node (data);
            if(head == null) {
                head = tail = new Node;
                return ;
            }
            tail.next= new Node;
        }
        //remove
        public static int remove(){
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            int front = head.data;
            //single element
            if(tail == head){
                tail = head = null;
            }else {
                head = head.next;
            }
            return front;
        }
        //peek
        public static int peek(){
            if(isEmpty()) {
                System.our.println("empty quue");
                return -1;
            }
            return head.data;
        }
    }
    public static void main (String args[]){
        Queue q = new Queue ();
        q.add(1);
        q.add(2);
        q.add(3);

        While(!q.isEmpty()) {
            System.our.println(q.peek())
            q.remove();
        }
    }
}