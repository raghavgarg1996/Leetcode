public class Reverse_Words_In_A_String {

    public static String reverseWords(String s) {

            String[] sr = s.split(" ");
            StringBuffer stb = new StringBuffer();

            for (int i=0; i<sr.length; i++) {
                if (!sr[sr.length-i-1].equals("")) {
                    stb.append(sr[sr.length-i-1]);
                    stb.append(" ");
                }
            }

            return stb.toString().trim();
    }

    public static void main (String[] args) {

        String s = "a good   example";
        System.out.println(reverseWords(s));
    }
}
