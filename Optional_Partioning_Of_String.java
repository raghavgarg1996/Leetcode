import java.util.Stack;

public class Optional_Partioning_Of_String {

    public static int partitionString(String s) {

        int count=0;
        Stack<Character> st = new Stack<>();
        for (int i=0; i<s.length(); i++) {
            if (!st.contains(s.charAt(i))) {
                st.push(s.charAt(i));
            } else {
                st.clear();
                st.push(s.charAt(i));
                count++;
            }
        }

        if (!st.isEmpty()) {
            count++;
        }

        return count;
    }
    public static void main(String[] args) {
        String s = "abacaba";
        int k = partitionString(s);
        System.out.println(k);
    }
}
