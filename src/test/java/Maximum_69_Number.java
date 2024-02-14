public class Maximum_69_Number {

    public static int maximum69Number(int num) {

        String s = Integer.toString(num);
        char[] ch = s.toCharArray();
        StringBuffer st = new StringBuffer(ch.length);
        int count = 0;

        for (int i = 0; i < ch.length; i++) {
            if ((ch[i] == '6') && (count == 0)) {
                st.append("9");
                count++;
            } else {
                st.append(ch[i]);
            }
        }

        String f = st.toString();
        return Integer.parseInt(f);

    }

    public static void main(String[] args) {

        int num = 9669;
        System.out.println(maximum69Number(num));
    }
}
