

public class removeduplicate {
    public static void  removeduplicate (String str, int idx, StringBuilder newStr, boolean mapL[] ) {
        if ( idx ==str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if (mapL[currChar-'a'] ==true) {
            removeduplicate(str, idx+1, newStr, mapL);
        }else {
            mapL[currChar-'a'] = true;
            newStr.append(currChar);
            removeduplicate(str, idx+1, newStr, mapL);
        }
    }
    public static void main(String[] args) {
        String str = "aappnnacollege";
        removeduplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
}