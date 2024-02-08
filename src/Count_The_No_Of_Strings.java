import java.util.HashMap;

public class Count_The_No_Of_Strings {

    public static int countConsistentStrings(String allowed, String[] words) {

        HashMap<Character, Integer> hm;
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            String k = words[i];
            hm = new HashMap<>();

            for (int j = 0; j < k.length(); j++) {
                if (hm.containsKey(k.charAt(j))) {
                    int val = hm.get(k.charAt(j));
                    hm.put(k.charAt(j), ++val);
                } else {
                    hm.put(k.charAt(j), 1);
                }
            }

            for (int j = 0; j < allowed.length(); j++) {
                if (hm.containsKey(allowed.charAt(j))) {
                    hm.remove(allowed.charAt(j));
                }
            }

            if (hm.isEmpty()) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};
        System.out.println(countConsistentStrings(allowed, words));
    }
}
