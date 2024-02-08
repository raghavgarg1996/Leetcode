import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Count_Common_Words_With_One_Occurence {

    public static int countWords(String[] words1, String[] words2) {

        HashMap<String, Integer> hm = new HashMap<>();
        HashMap<String, Integer> hm2 = new HashMap<>();
        ArrayList<String> ls = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < words1.length; i++) {
            if (hm.containsKey(words1[i])) {
                int val = hm.get(words1[i]);
                hm.put(words1[i], ++val);
            } else {
                hm.put(words1[i], 1);
            }
        }

        System.out.println(hm);

        for (int i = 0; i < words2.length; i++) {
            if (hm2.containsKey(words2[i])) {
                int val = hm2.get(words2[i]);
                hm2.put(words2[i], ++val);
            } else {
                hm2.put(words2[i], 1);
            }
        }

        System.out.println(hm2);

        for (Map.Entry entry : hm.entrySet()) {
            if ((int) entry.getValue() == 1) {
                ls.add((String) entry.getKey());
            }
        }

        System.out.println(ls);

        for (Map.Entry entry : hm2.entrySet()) {
            int value = (int) entry.getValue();
            String key = (String) entry.getKey();

            if ((value == 1) && (ls.contains(key))) {
                count++;
            }
        }

        return count;

        /*        for (int i = 0; i < words2.length; i++) {
            if (hm.containsKey(words2[i])) {
                int value = hm.get(words2[i]);
                if (value == 1)  {
                    hm.remove(words2[i]);
                    count++;
                } else {
                    hm.put(words2[i], --value);
                }
            } else {
                hm2.put(words2[i], 1);
            }
        }*/

    }

    public static void main(String[] args) {

        String[] words1 = {"a", "ab"};
        String[] words2 = {"a", "a", "a", "ab"};

        System.out.println(countWords(words1, words2));
    }
}
