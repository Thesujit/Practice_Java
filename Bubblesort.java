public class Bubblesort {
    public static void Bubblesort ( int arr []){
        for ( int turns =0; turns<arr.length-1;turns++) {
            for ( int j=0; j<arr.length-1-turns; j++) {
                if (arr [j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
     public static void printarr(int arr[]) {
        for ( int i =0; i<arr.length; i++) {
            System.out.print(arr[i]+"");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr [] = {5,4,2,1,3};
        printarr(arr);
    }
}