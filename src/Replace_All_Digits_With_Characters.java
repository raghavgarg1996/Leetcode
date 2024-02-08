public class Replace_All_Digits_With_Characters {

    public static String replaceDigits(String s) {

        StringBuffer st = new StringBuffer();
        char ch = 'a';
        for (int i = 0; i < s.length(); i++) {

            if (i%2==0) {
                ch = s.charAt(i);
                st.append(ch);
            } else {
                int f = Integer.parseInt(String.valueOf(s.charAt(i)));
                char c = replace(ch, f);
                st.append(c);
            }

        }
        return st.toString();
    }

    public static Character replace(Character ch, int k) {

        int asciiValue = ch;
        return (char) (asciiValue + k);
    }

    public static void main(String[] args) {

        String s = "a1b2c3d4e";
        System.out.println(replaceDigits(s));
    }
}
