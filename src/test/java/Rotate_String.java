public class Rotate_String {

    public static boolean rotateString(String s, String goal) {

        int maxLength = goal.length();
        int count = 0;

        if (s.length()!=goal.length()) {
            return false;
        }

        if (s.equals(goal)) {
            return true;
        }

        while ((!s.equals(goal)) && count<=maxLength) {
            StringBuffer st = new StringBuffer();

            for (int i=count; i<s.length(); i++) {
                st.append(s.charAt(i));
            }
            for (int i=0; i<count; i++) {
                st.append(s.charAt(i));
            }

            if (st.toString().equals(goal)) {
                return true;
            }
            count++;
        }
        return false;
    }

    public static void main(String[] args) {

        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rotateString(s, goal));
    }
}
