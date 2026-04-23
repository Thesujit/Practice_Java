public class mirrorbst {
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
    public static Node createMirro(Node root){
        if(root == null){
            return null;
        }
        Node leftMirrot = createMirro(root.left);
        NOde rightMirro = createMirro(root.right);

        root.left  = rightMirro;
        root.right = leftMirrot;
        return root;
    }

    public static void preordr(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String args[]){
        Node root = new Node(data : 8);
        root.left = new Node(data: 5);
        root.right =  new Node(data: 10);
        root.left.left = new Node(data: 3);
        root.left.right = new Node(data: 6);
        root.right.right = new Node(data: 11);

        root = createMirro(root);
        preorder(root);
    }
}