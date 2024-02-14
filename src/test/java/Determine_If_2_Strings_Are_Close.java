import java.util.*;

public class Determine_If_2_Strings_Are_Close {

    public static boolean closeStrings(String word1, String word2) {

        HashMap<Character, Integer> hm = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();


        for (int i = 0; i < word1.length(); i++) {
            if (hm.containsKey(word1.charAt(i))) {
                int val = hm.get(word1.charAt(i));
                hm.put(word1.charAt(i), ++val);
            } else {
                hm.put(word1.charAt(i), 1);
            }
        }

        for (int i = 0; i < word2.length(); i++) {
            if (hm2.containsKey(word2.charAt(i))) {
                int val = hm2.get(word2.charAt(i));
                hm2.put(word2.charAt(i), ++val);
            } else {
                hm2.put(word2.charAt(i), 1);
            }
        }


        List<Integer> ls = new ArrayList<>();
        List<Integer> ls2 = new ArrayList<>();


        for (Map.Entry entry : hm.entrySet()) {
            ls.add((Integer) entry.getValue());
        }

        for (Map.Entry entry : hm2.entrySet()) {
            ls2.add((Integer) entry.getValue());
        }

        Collections.sort(ls);
        Collections.sort(ls2);

        for (int i=0; i<ls.size(); i++) {
            if (ls.get(i)!=ls2.get(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String word1 = "cabbba";
        String word2 = "abbccc";

        System.out.println(closeStrings(word1, word2));
    }
}
