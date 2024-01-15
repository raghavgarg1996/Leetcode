public class Greatest_Common_Divisor_Of_String {

    public static String gcdOfStrings(String str1, String str2) {

        StringBuffer stf = new StringBuffer();

        int x = 0;
        int y = 1;

        while (y<=str1.length()) {
            if (str1.charAt(x)==str1.charAt(y)) {
                 x++;
                 y++;
            } else {
                y++;
            }
        }
        return "";
    }

    public static void main(String[] args) {

        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println(gcdOfStrings(str1, str2));
    }
}
