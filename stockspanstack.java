public class stockspanstack {
    public static void stackspan(int stock[], int span[]){
        span [0] =1;
        s.push(0);

        for(int i=1; i<stock.length; i++) {
            int currprice = stock[i];
            while(!s.isEmpty() && currprice > stock[s.peek()]) {
                s.pop();
            }
            if(s.isEmpty()) {
                span[i] = i+1;
            } else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }
    }
    public static void main (String args[] ){
        int stock[] = {100,70,60,85,100,30};
        int span[] =  new int[stock.length];
        stackspan(stock, span);
        for ( int i=0; i<span.length; i++) {
            System.out.print(span[i] + " ");
        }
    }
}