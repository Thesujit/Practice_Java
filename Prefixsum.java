public class Prefixsum {
    public static void maxSum (int numbers []) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int Prefixsum[] = new int [numbers.length];

        Prefixsum[0] = numbers[0];
        for ( int i = 1; i < Prefixsum.length; i++){
            Prefixsum[i] = Prefixsum [i-1]+ numbers[i];
        }

        for ( int i =0; i<numbers.length; i++){
            int start =i;
            for ( int j =i; j<numbers.length; j++){
                int end = j;
                
                currSum = start ==0 ? Prefixsum[end]:Prefixsum[end] -Prefixsum[start-1];

                if (maxSum<currSum){
                    maxSum= currSum;
                }
            }
        }
        System.err.println("max sum =" + maxSum);
    }

    public static void main(String[] args) {
        int numbers [] = {1,2,-3,4,5,6};
        maxSum(numbers);
    }
}