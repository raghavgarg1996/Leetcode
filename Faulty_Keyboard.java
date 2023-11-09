public class Faulty_Keyboard {

    public static String finalString(String s) {

        StringBuffer st = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'i') {
                st.reverse();
            } else {
                st.append(s.charAt(i));
            }
        }
        return st.toString();
    }

    public static void main(String[] args) {

        String s = "string";
        System.out.println(finalString(s));
    }
}
