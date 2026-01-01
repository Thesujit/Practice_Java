public class firstR {
    public static int firstR(int arr[], int key, int i){
if ( i == arr.length) {
    return -1;
}
if (arr[i] ==key) {
    return i;
    }
    return firstR(arr, key, i+1);
}
public static void main(String[] args) {
    int arr[]={2,1,4,5,6,3,};
    System.out.println(firstR(arr,5,0));
    }
}