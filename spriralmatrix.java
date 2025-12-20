public class spriralmatrix {
    public static void sprialmatrix( int matrix [][]){
        int startrow =0;
        int endrow=0;
        int startcol = matrix.length-1;
        int  endcol = matrix.length-1;

        while ( startrow<= startcol && startcol<= endcol){

            //top 
            for (int j = startcol; j<=endcol;j++) {
                System.err.println(matrix[startrow][j]+"");
            }

            //bottom
            for ( int j= endcol-1;j>=startcol;j--){
                System.err.println(matrix[endrow][j]+"");{
                    if (startrow == endrow){
                        break;
                    }
                }
                // left
                for ( int i = endrow-1; i>= startrow+1; i--){
                    if (startcol == endcol) {
                        break;
                    }
                    System.err.println(matrix[i][startcol]+"");
                }
                startcol ++;
                startrow ++;
                endcol--;
                endrow --;
            }
        }
    }
    public static void main(String[] args) {
        int matrix [][] = {{1,2,3,4},{4,5,6,7},{8,9,10,11},{12,13,14,15}};
        sprialmatrix(matrix);
    }
}