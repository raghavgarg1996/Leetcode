import java.util.HashMap;

public class Repeated_SubString_Pattern {

    public static boolean repeatedSubstringPattern(String s) {

        int i = 0;
        int j = 0;
        HashMap<String, Integer> hm = new HashMap<>();
        StringBuffer st;
        StringBuffer st2 = new StringBuffer();
        boolean k = false;
        int count = 0;
        String saved = "";

        while (j <= s.length()) {

            st = new StringBuffer(s.substring(i, j));

            if (hm.containsKey(st.toString())) {
                int val = hm.get(st.toString());
                if ((val == 1) && (count == 0)) {
                    st2.append(st);
                    st2.append(st);
                    count++;
                    saved = st.toString();
                } else {
                    if (st.toString().equals(saved)) {
                        st2.append(st);
                    }
                }

            }

            if (j == s.length()) {
                break;
            }

            if ((s.charAt(i) == s.charAt(j)) && st.length() != 0) {
                hm.put(s.substring(i, j), 1);
                i++;
            } else {
                j++;
            }
        }

        if (st2.length() == s.length()) {
            k = true;
        }
        return k;
    }

    public static void main(String[] args) {

        String s = "ababba";
        System.out.println(repeatedSubstringPattern(s));
    }
}
