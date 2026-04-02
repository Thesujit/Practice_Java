public class Stack2Queue{
    Static class Stack {
        Static Queue <Integer> q1 = new Linkedlist<>();
        Static Queue <Integer> q2 = new Linkedlist<>();

        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }
        public static void push(int data) {
            if(!q1.isEmpty()) {
                q1.add(data);
            }else{
                q2.add(data);
            }
        }
        public static int pop() {
            if(isEmpty()) {
                System.out.println("empty stack");
                return -1;
            }
            int top = -1;
            //case 1
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top = q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(add);
                }else{
                    //case 2
                    while(!q2.isEmpty()) {
                        top = q2.remove();
                        if(q2.isEmpty()){
                            break;
                        }
                        q1.add(top);
                    }
                }
                return top ;
            }
        }
        public static void main(String args[]){
            Stack S = new Stack();
            S.push(1);
            S.push(2);
            S.push(3);

            while(!S.isEmpty()){
                System.out.println(s.peek());
                S.pop();
            }
        }
    }
}