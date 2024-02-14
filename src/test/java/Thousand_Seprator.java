public class Thousand_Seprator {

    public static String thousandSeparator(int n) {

        String k = Integer.toString(n);
        int stringLength = k.length();


        if (stringLength > 3) {
            char[] ch = k.toCharArray();

            StringBuffer st = new StringBuffer();

            int commaCount = stringLength / 3;

            for (int j = 0; j < commaCount; j++) {
                for (int i = 0; i < k.length() - (3 * j); i++) {
                    st.append(k.charAt(i));
                }

                st.append(".");

                for (int i = 0; i < 3; i++) {
                    st.append(k.charAt(stringLength - (3 * j) + i));
                }
                k = st.toString();
            }
/*            for (int i = 0; i < k.length() - 3; i++) {
                st.append(k.charAt(i));
            }

            st.append(".");

            for (int i = 0; i < 3; i++) {
                st.append(k.charAt(stringLength - 3 + i));
            }
            k = st.toString();*/
        }

        return k;
    }

    public static void main(String[] args) {

        int n = 1234;
        System.out.println(thousandSeparator(n));
    }
}
