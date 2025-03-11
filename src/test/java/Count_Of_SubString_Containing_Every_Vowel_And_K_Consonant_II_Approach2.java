import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Count_Of_SubString_Containing_Every_Vowel_And_K_Consonant_II_Approach2 {

    public static long countOfSubstrings(String word, int k) {
        Set<String> uniqueSubstrings = getAllUniqueSubstrings(word);

        HashSet<Character> hs = new HashSet<>();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');

        HashSet<Character> hs2 = new HashSet<>(hs);


        Iterator<String> iterator = uniqueSubstrings.iterator();
        while (iterator.hasNext()) {
            String newString = iterator.next();
            if (newString.length() == (5 + k)) {
                for (int j = 0; j < newString.length(); j++) {
                    if (hs.contains(newString.charAt(j))) {
                        hs.remove(newString.charAt(j));
                        if (hs.isEmpty() && k == 0) {
                            System.out.println(newString);
                        }
                        if (hs.isEmpty() && !hs2.contains(newString.charAt(j))) {
                            hs = new HashSet<>(hs2);
                            System.out.println(newString);
                        }
                    }
                }
            }
        }

        return 2;
    }

    public static Set<String> getAllUniqueSubstrings(String s) {
        Set<String> uniqueSubstrings = new HashSet<>();
        // Outer loop for the starting index of substring
        for (int i = 0; i < s.length(); i++) {
            // Inner loop for the ending index of substring
            for (int j = i + 1; j <= s.length(); j++) {
                // Add the substring from i to j-1 to the set
                uniqueSubstrings.add(s.substring(i, j));
            }
        }
        return uniqueSubstrings;
    }

    public static void main(String[] args) {

        String word = "ieaouqqieaouqq";
        int k = 1;
        System.out.println(countOfSubstrings(word, k));
    }
}
