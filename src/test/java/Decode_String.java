public class Decode_String {

    public static String decodeString(String s) {

        String[] k = s.split("]");
        StringBuffer st = new StringBuffer();

        for (int i = 0; i < k.length; i++) {
            String srt = k[i].replace("[","");
            int val = Integer.parseInt(String.valueOf(srt.charAt(0)));
            for (int j = 0; j < val; j++) {
                st.append(srt.substring(1, srt.length()));
            }
        }


        return st.toString();
    }

    public static void main(String[] args) {

        String s = "3[a2[c]]";
        System.out.println(decodeString(s));
    }
}
