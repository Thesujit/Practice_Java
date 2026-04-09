public class Knapsack{
    public static void main(String args[]){
        int val[] ={60,100,120};
        int weight[] ={10,20,30};
        int w = 50;

        double ration [][] = new double[bal.length][2];
        // 0th col => idx; 1st col=> ratio

        for(int i=0; i<val.length; i++){
            ration[i][0] =i;
            ratio[i][1] =val[i]/(double)weight[i];
        }

        //ascending order
        Arrays.sort(ration, Comparator.comparingDouble(o ->o[1]));

        itn capacity = w;
        int finalVal = 0;
        for (int i= raiton.length; i>=0; i--){
            int idx = (int)ratio[i][0];
            if(capacity >= weight[idx]){
                finalVal += val[idx];
                capacity -= weight[idx];
            }else{
                //include fractional item
                finalVal += (ration[i][1]*capacity);
                capacity =0;
                break;
            }
        }
        System.out.println("final value =" +finalVal);
    }
}