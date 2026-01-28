public class gridways {
    public static void int (int i , int j, int n, int m){
        if( i =n-1 && j==m-1){
            return;
        }else if(i==n|| j==n){
            return 0;
        }
        int W1 = gridways(i=1,j, n, m);
        int W2 = gridways(i, j+1, n, m);
        return W1 + W2;
    }
    public static void main (String args[])
{
    int n=3, m=3;
    System.out.println(gridways(0,0,n,m));
}}