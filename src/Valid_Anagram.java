import java.util.HashMap;

public class Valid_Anagram {

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();

        boolean k = false;
        if (s.length() == t.length()) {
            for (int i = 0; i < s.length(); i++) {
                if (hm.containsKey(s.charAt(i))) {
                    int val = hm.get(s.charAt(i));
                    hm.put(s.charAt(i), ++val);
                } else {
                    hm.put(s.charAt(i), 1);
                }
            }

            for (int i = 0; i < t.length(); i++) {
                if (hm.containsKey(t.charAt(i))) {
                    int val = hm.get(t.charAt(i));
                    if (val == 1) {
                        hm.remove(t.charAt(i));
                    } else {
                        hm.put(t.charAt(i), --val);

                    }
                }
            }

            if (hm.size() == 0) {
                k = true;
            }

        }

        return k;
    }

    public static void main(String[] args) {

        String s = "ab";
        String t = "ba";
        System.out.println(isAnagram(s, t));
    }
}
