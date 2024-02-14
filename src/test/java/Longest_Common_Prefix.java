public class Longest_Common_Prefix {

    public static String longestCommonPrefix(String[] strs) {

        String k = strs[0];
        StringBuffer st;

        for (int i = 1; i < strs.length; i++) {
            String val = strs[i];

            int count = 0;
            int valCount = 0;

            st = new StringBuffer();
            if (k.length() > val.length()) {
                int j = 0;

                while (j < val.length()) {
                    if (k.charAt(j) == val.charAt(j)) {
                        st.append(val.charAt(j));
                        count++;
                    }
                    valCount++;
                    j++;

                    if (count != valCount) {
                        break;
                    }
                }

            } else {
                int j = 0;
                while (j < k.length()) {
                    if (k.charAt(j) == val.charAt(j)) {
                        st.append(k.charAt(j));
                        count++;
                    }
                    valCount++;
                    j++;

                    if (count != valCount) {
                        break;
                    }
                }
            }
            k = st.toString();
        }
        return k;
    }


    public static void main(String[] args) {

        String[] arr = {"baab", "bacb", "b", "cbc"};
        System.out.println(longestCommonPrefix(arr));
    }
}
