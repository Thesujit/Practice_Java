import java.util.*;
public class sortedBST{
       static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = this.right = null;
            this.right = this.left= null;
        }
    }
    static class Info{
        boolean isBST;
        int size;
        int min;
        int max;

        public Info(boolean isBST, int size, int min, int max ) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
    public static int maxBST =0;

    public static Info largestBST(Node root){
        if(root == null){
            return new Infot(isBst: true, size:0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Info leftInfo = largestBST (root.left);
        Info rightrInfo = largestBST(root.right);
        int size = leftInfo.size + rightrInfo +1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightrInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max, rightrInfo.max));

        if(root.data <= leftInfo.max || root.dat >= rightrInfo.min){
            return new Info(isBST:false, size, min, max);
        }
        if(leftInfo.isBST && rightrInfo.isBST){
            maxBST= Math.max(maxBST, size);
            new Info(isBST: true, size, min, max);
        }
        return new Info(false, size, min , max);
    }
    

    public static void main(String args[]){
        Node root = new Node(data: 8);
        root.left = new Node(data: 6);
        root.left.lef new Node(data: 5);
        root.left.left.left = new Node(data: 3);

        root.right = new Node(data: 10);
        root.right.right = new Node(data: 11);
        root.right.right.right  = new Node(data: 12);


       Info info = largestBST (root);
       System.out.println("largest BST size"+maxBST);
        }}