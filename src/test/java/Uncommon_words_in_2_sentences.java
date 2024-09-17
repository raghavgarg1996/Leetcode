import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Uncommon_words_in_2_sentences {

    public static String[] uncommonFromSentences(String s1, String s2) {

        HashMap<String, Integer> hm = new HashMap<>();

        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");
        ArrayList<String> ls = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            if (hm.containsKey(arr1[i])) {
                int val = hm.get(arr1[i]);
                hm.put(arr1[i], ++val);
            } else {
                hm.put(arr1[i], 1);
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            if (hm.containsKey(arr2[i])) {
                int val = hm.get(arr2[i]);
                hm.put(arr2[i], ++val);
            } else {
                hm.put(arr2[i], 1);
            }
        }

        for (Map.Entry entry : hm.entrySet()) {
            int value = (int) entry.getValue();
            if (value == 1) {
                String key = (String) entry.getKey();
                ls.add(key);
            }
        }
        return ls.toArray(new String[0]);
    }

    public static void main(String[] args) {

        String s1 = "apple apple";
        String s2 = "banana";

        String[] arr = uncommonFromSentences(s1, s2);
        System.out.println(Arrays.toString(arr));
    }
}
