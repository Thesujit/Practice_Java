public class reversestrstack {
     Stack <Character> st = new Stack<>();
     int idx =0;
     while(idx < str.length()){
        st.push(str.charAt(idx));
        idx++;
     }
     StringBuilder result = new StringBuilder();
     while(!s.isEmpty()) {
        char curr = s.pop();
        result.append(curr);
     }
     return result.toString();

    public static void main(String[] args) {
        String str= "abc";
        String result = reverseString(str);
        System.out.println(result);
    }
}