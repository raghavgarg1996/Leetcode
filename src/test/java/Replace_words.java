import java.util.ArrayList;
import java.util.List;

public class Replace_words {

    public static String replaceWords(List<String> dictionary, String sentence) {

        int wordLength = dictionary.get(0).length();
        StringBuffer st = new StringBuffer();
        String[] sentenceArray = sentence.split(" ");

        for (int i = 0; i < sentenceArray.length; i++) {

            String word = sentenceArray[i];

            for (int j = 0; j < Math.min(wordLength, word.length()); j++) {
                st.append(word.charAt(j));
            }
            st.append(" ");
        }

        return st.toString().trim();
    }

    public static void main(String[] args) {

        List<String> dictionary = new ArrayList<>();
        dictionary.add("cat");
        dictionary.add("bat");
        dictionary.add("rat");

        String sentence = "the cattle was rattled by the battery";
        System.out.println(replaceWords(dictionary, sentence));
    }
}
