import java.util.*;

public class String_Matching_In_An_Array {

    public static List<String> stringMatching(String[] words) {

        List<String> ls;
        HashSet<String> hs = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            String k = words[i];

            for (int j = 0; j < words.length; j++) {
                if (words[j].contains(k) && (j != i)) {
                    hs.add(words[i]);
                }
            }
        }

        ls = new ArrayList<>(hs);
        return ls;
    }

    public static void main(String[] args) {

        String[] words = {"mass", "as", "hero", "superhero"};
        List<String> ls = stringMatching(words);
        System.out.println(ls);
    }
}
