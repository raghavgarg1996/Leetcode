public class Valid_Pallindrome {

    public static boolean isPalindrome(String s) {

        boolean val = false;
        StringBuffer stb = new StringBuffer(s.length());
        for (int i=0; i<s.length(); i++) {
            int k = s.charAt(i);
            if (((65<=k)&&(k<=90))||((97<=k)&&(k<=122))||(48<=k)&&(k<=57)) {
                stb.append(s.charAt(i));
            }
        }

        String f = stb.toString().toLowerCase();
        String reverse = stb.reverse().toString().toLowerCase();
        if (f.equals(reverse)) {
            val = true;
        }
        return val;
    }

    public static void main(String[] args) {

        String s = "0P";
        boolean k = isPalindrome(s);
        System.out.println(k);
    }
}
