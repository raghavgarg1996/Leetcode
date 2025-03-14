import java.util.ArrayList;

public class Vowels_Of_All_Substrings {

    public static long countVowels(String word) {

        ArrayList<String> ls = new ArrayList<>();
        long count = 0;

        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                ls.add(word.substring(i, j));
            }
        }


        for (int i = 0; i < ls.size(); i++) {
            String val = ls.get(i);

            for (int j = 0; j < val.length(); j++) {
                if (val.charAt(j) == 'a' || val.charAt(j) == 'e' || val.charAt(j) == 'i' || val.charAt(j) == 'o' || val.charAt(j) == 'u') {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        String s = "aba";
        System.out.println(countVowels(s));
    }
}
