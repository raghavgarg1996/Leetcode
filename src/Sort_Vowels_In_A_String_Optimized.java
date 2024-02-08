import java.util.*;

public class Sort_Vowels_In_A_String_Optimized {

    public static String sortVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        List<Integer> indices = new ArrayList<>();
        HashSet<Character> hs = new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'));

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (hs.contains(c)) {
                vowels.add(c);
                indices.add(i);
            }
        }

        Collections.sort(vowels);

        StringBuilder sortedString = new StringBuilder(s);
        for (int i = 0; i < vowels.size(); i++) {
            sortedString.setCharAt(indices.get(i), vowels.get(i));
        }

        return sortedString.toString();
    }

    public static void main(String[] args) {
        String s = "aAAAAAAAAaAAAAaaAaaAAaaaaAaaAAAAaAAaaaaaAaaaaAAAaAAAaaaAaaaAaaAaAaaAaaAaAaaaaAaAaaAaAaAAaAaAAaaaAaAaaaAaAaaAAAaAAAaAaAaaaAaaaAAaaAaaaaaAAaaaaaaaAAaaaAaaaaaaAAaaAaAaaaAaaAaaaaAAAaaaaAaaAaAaaaAAaAAAaaAaAAa";
        System.out.println(sortVowels(s));
    }
}
