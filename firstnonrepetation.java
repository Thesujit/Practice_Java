public class firstnonrepetation{
    public Static void printNonRepeating(String str){
        int freq[] = new int [26];
        Queue<Character>q = new Linkedlist<>();

        for (int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            q.add(ch);
            freq[ch-'a'] ++;

            while(!q.isEmpty() && freq [q.peek()-'a']>i )
            {
                q.remove();
            }
            if(q.isEmpty()){
                System.out.println(-1+" ");
            }else{
                System.out.print(q.peek()+" ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        String str = "aabccxb";
        printNonRepeating(str);
    }
}