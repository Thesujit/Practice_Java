public class dimeteroftreeopt {
    static class Node{
        int data;
        Node left,right

        public Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }
    public static int height (Node root){
        if(root ==null){
            return 0;
        }
        int lh = height ( root.left);
        int rh  = height(root.right);
        return Math.max(lh, rh)+1;
    }

    static class Info{
        int diam; 
        int ht;

        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static Info diameter(){
        if(root == null){
            return new Info (0,0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.rigth);

        int diam= Math.max(Math.max(leftInfo, rightInfo.diam),leftInfo.ht+rightInfo.ht +1);
        int ht= Math.max(leftInfo.ht, rightInfo.ht)+1;

        return new Info(diam, ht)
    }
}