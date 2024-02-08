import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Word_Break {

    public static boolean wordBreak(String s, List<String> wordDict) {
        if (s.length() == 0) {
            return true;
        }


        for (int i = 0; i < wordDict.size(); i++) {
            String word = wordDict.get(i);
            if (s.startsWith(word)) {
                String remainder = s.substring(word.length());
                if (wordBreak(remainder, wordDict)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        List<String> ls = new ArrayList<>();
        ls.add("leet");
        ls.add("code");
        System.out.println(wordBreak(s, ls));
    }
}
