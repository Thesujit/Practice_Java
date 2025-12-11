public class Largest_In_Array {
    public static int largestnum (int numbers []) {
        int largestnum = Integer.MIN_VALUE;
        int smallertnum = Integer.MAX_VALUE;

        for (int i =0;i<= numbers.length; i++){
            if (largestnum < numbers [i]){
                largestnum = numbers[i];
            }

            if (smallertnum> numbers [i]){
                smallertnum = numbers[i];
            }
        }
         System.out.println("Smallest value is :" +smallertnum);
        return  largestnum;
    } 

public static void main(String[] args) {
    int numbers [] = {1,2,3,4,5,6};
    System.err.println("largest value is : "+largestnum(numbers));
}
}