import java.util.ArrayList;
import java.util.List;

public class Find_Words_Containing_Character {

    public static List<Integer> findWordsContaining(String[] words, char x) {

        ArrayList<Integer> ls = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == x) {
                    if (!ls.contains(i)) {
                        ls.add(i);
                    }
                }
            }
        }

        return ls;
    }

    public static void main(String[] args) {

        String[] words = {"leet", "code"};
        Character x = 'e';

        List<Integer> ls = findWordsContaining(words, x);
        System.out.println(ls);
    }
}
