import java.util.Stack;

public class BackSpace_String_Compare {

    public static boolean backspaceCompare(String s, String t) {

        Stack<Character> st = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(s.charAt(i));
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#') {
                if (!st2.isEmpty()) {
                    st2.pop();
                }
            } else {
                st2.push(t.charAt(i));
            }
        }

        if (st.equals(st2)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        String s = "a##c";
        String t = "#a#c";

        System.out.println(backspaceCompare(s, t));
    }
}
