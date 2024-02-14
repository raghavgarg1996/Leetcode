import java.util.Stack;

public class Remove_Stars_From_A_String {

    public static String removeStars(String s) {

        Stack<Character> st = new Stack<>();

        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i)=='*') {
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }

        return st.toString().replace(", ","").replace("[","").replace("]","");
    }

    public static void main (String[] args) {
        String s = "erase*****";
        System.out.println(removeStars(s));
    }
}
