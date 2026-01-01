public class lastoccR{
    public static int lastoccR(int[] arr, int key, int i) {
        if ( i== arr.length) {
            return -1;
        }
        int isFound = lastoccR(arr, key, i+1) ;
        if(isFound ==-1 && arr[i] ==key){
            return i;
        }
        return isFound;
        
    }
public static void main(String[] args) {
    int arr[] = {5,6,3,5,5};
    System.out.println(lastoccR(arr, 5, 0));
}
}