import java.util.Stack;

public class Remove_All_Adjacent_Duplicates_In_String {

    public static String removeDuplicates(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (!st.isEmpty()) {
                char ch = st.peek();
                if (s.charAt(i) == ch) {
                    st.pop();
                } else {
                    st.push(s.charAt(i));
                }
            } else {
                st.push(s.charAt(i));
            }
        }
        return st.toString().replace("[","").replace("]","").replace(", ","");
    }

    public static void main(String[] args) {

        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }
}
