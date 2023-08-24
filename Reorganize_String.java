import java.util.Stack;
import java.util.function.ToDoubleBiFunction;

public class Reorganize_String {

    public static String reorganizeString(String s) {

        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        String out = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!st1.isEmpty()) {
                char p = st1.peek();
                if (ch == p) {
                    st2.push(s.charAt(i));
                } else {
                    st1.push(s.charAt(i));
                }
            } else {
                st1.push(s.charAt(i));
            }
        }

        if (!st2.isEmpty()) {
            for (int i = 0; i < st2.size(); i++) {
                char ch = st1.peek();
                char p = st2.get(st2.size() - i - 1);
                if (ch == p) {
                    return "";
                } else {
                    st1.push(p);
                }
            }
        }

        return st1.toString().replace("[", "").replace("]", "").replace(", ", "");
    }

    public static void main(String[] args) {
        // Todo: Partial solution - failing on case s="vvvlo"
        String s = "aaab";
        System.out.println(reorganizeString(s));
    }
}
