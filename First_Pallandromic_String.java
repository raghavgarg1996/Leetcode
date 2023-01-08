public class First_Pallandromic_String {
    public static String firstPalindrome(String[] words) {

        String sol = "";
        String revString = "";
        for (String k : words) {
            StringBuilder st = new StringBuilder(k);
            revString = st.reverse().toString();
            if (k.equals(revString)) {
                sol = k;
                break;
            }
        }
        return sol;
    }

    public static void main(String[] args) {

        String[] words = {"def","ghi"};
        String palindromic = firstPalindrome(words);
        System.out.println(palindromic);
    }

}
