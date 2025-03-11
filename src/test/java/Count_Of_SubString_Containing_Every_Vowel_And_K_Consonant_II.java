import java.util.HashSet;

public class Count_Of_SubString_Containing_Every_Vowel_And_K_Consonant_II {

    public static long countOfSubstrings(String word, int k) {

        HashSet<Character> hs1 = new HashSet<>();
        hs1.add('a');
        hs1.add('e');
        hs1.add('i');
        hs1.add('o');
        hs1.add('u');
        int x = 0;
        int y = 0;
        HashSet<Character> hs2 = new HashSet<>(hs1);
        long count = 0;
        int val = 0;

        while (y < word.length()) {
            if (hs2.contains(word.charAt(y))) {
                hs2.remove(word.charAt(y));
                y++;

                val = y - x;

                if ((val == (hs1.size() + k)) && (hs2.isEmpty())) {
                    count++;
                }
            } else {
                if (hs2.isEmpty() && (hs1.size() < word.length()) && (val == hs1.size() + k)) {
                    hs2 = new HashSet<>(hs1);
                    count++;
                } else {
                    if (hs1.contains(word.charAt(y))) {
                        x = y;
                        y++;
                    } else {
                        y++;
                    }

                    val = y - x;

//                    if ((val == (hs1.size() + k)) && (hs2.isEmpty())) {
//                        count++;
//                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        String word = "ieaouqqieaouqq";
        int k = 1;
        System.out.println(countOfSubstrings(word, k));
    }
}
