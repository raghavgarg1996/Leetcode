public class Vowels_Of_All_Substrings_OptimizedCode {

    public static long countVowels(String word) {

        long count = 0;
        int n = word.length();

        for (int i = 0; i < n; i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count += (long) (i + 1) * (n - i);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "aba";
        System.out.println(countVowels(s));
    }
}
