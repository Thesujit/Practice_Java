public class nextgrtele {
    public static void main(String[] args) {
        int arr[]={6,5,8,1,0};
        Stack<Integer>S = new Stack<>();
        int nextgreater[] = new int [arr.length];

        for(int i = arr.lenth -1; i>=0; i--) {
            // 1 while
            while(!S.isEmpty() && arr[S.peek()]<= arr[i]) {
                S.pop();
            }
            // 2 if else
             if (S.isEmpty()) {
                nextgreater[i] = -1;
             }else {
                nextgreater[i] = arr[S.peek()];
             }
             //3 push in stack
             S.push(i);
             for(int i =0; i<nextgreater.length; i++) {
                System.out.print(nextgreater[i] +  " ");
             }
             System.out.println();
        }
    }
}