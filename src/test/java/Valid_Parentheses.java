import java.util.Stack;

public class Valid_Parentheses {

    public static boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        if (s.length() == 1) {
            return false;
        } else {
            for (int i = 0; i < s.length(); i++) {
                if ((s.charAt(i) == '(') || (s.charAt(i) == '[') || (s.charAt(i) == '{')) {
                    st.push(s.charAt(i));
                } else {
                    if (st.isEmpty()) {
                        return false;
                    }

                    char top = st.pop();

                    if ((s.charAt(i) == ')' && top != '(') ||
                            (s.charAt(i) == ']' && top != '[') ||
                            (s.charAt(i) == '}' && top != '{')) {
                        return false;
                    }
                }
            }
            return st.isEmpty();
        }
    }

    public static void main(String[] args) {

        String s = "){";
        System.out.println(isValid(s));
    }
}
