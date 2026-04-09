public class maxchainpair{
    public static void main(String args[]) {
        int paris[] = {{5,24},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(pairs, Commprator.comparingDouble(o ->o[1]));

        int chainLen =1;
        int chainEnd = pairs[0][1];//last selected pair end 

        for(int i=1; i<pairs.length; i++){
            if(paris[i][0] > chainEnd) {
                chainLen ++;
                chainEnd = pairs[i][1];
            }
        }

        System.out.println("max length of chain = "+ chainLen);
    }
}