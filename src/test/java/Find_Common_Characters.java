import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Find_Common_Characters {

    public static List<String> commonChars(String[] words) {

        HashMap<Character, Integer> hm = new HashMap<>();
        List<String> ls = null;

        for (int i = 0; i < words.length; i++) {
            String s = words[0];

            for (int j = 0; j < s.length(); j++) {
                if (hm.containsKey(s.charAt(j))) {
                    int val = hm.get(s.charAt(j));
                    hm.put(s.charAt(j), ++val);
                } else {
                    hm.put(s.charAt(j), 1);
                }
            }

            String str = words[i];
            if (str != s) {
                for (Map.Entry entry : hm.entrySet()) {
                    for (int j=0; j<str.length(); j++) {
                        if (entry.getKey().equals(str.charAt(j))) {

                        }
                    }
                }
            }


        }
        return ls;
    }

    public static void main(String[] args) {

        String[] words = {"bella", "label", "roller"};
        List<String> ls = commonChars(words);
        System.out.println(ls);
    }
}
