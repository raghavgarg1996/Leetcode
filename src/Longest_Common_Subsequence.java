import java.util.HashMap;

public class Longest_Common_Subsequence {

    public static int longestCommonSubsequence(String text1, String text2) {

        HashMap<Character, Integer> hm = new HashMap<>();
        int count = 0;

        for (int i = 0; i < text1.length(); i++) {
            if (hm.containsKey(text1.charAt(i))) {
                int val = hm.get(text1.charAt(i));
                hm.put(text1.charAt(i), ++val);
            } else {
                hm.put(text1.charAt(i), 1);
            }
        }

        for (int i = 0; i < text2.length(); i++) {
            if (hm.containsKey(text2.charAt(i))) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String text1 = "abcde";
        String text2 = "ace";
        System.out.println(longestCommonSubsequence(text1, text2));
    }
}
