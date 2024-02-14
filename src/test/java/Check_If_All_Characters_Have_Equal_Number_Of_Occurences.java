import java.util.HashMap;
import java.util.Map;

public class Check_If_All_Characters_Have_Equal_Number_Of_Occurences {

    public static boolean areOccurrencesEqual(String s) {

        HashMap<Character, Integer> hm = new HashMap<>();
        int characterCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                int val = hm.get(s.charAt(i));
                hm.put(s.charAt(i), ++val);
            } else {
                hm.put(s.charAt(i), 1);
            }
        }

        characterCount = hm.get(s.charAt(0));

        for (Map.Entry entry : hm.entrySet()) {
            if ((int) entry.getValue() != characterCount) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String s = "abacbc";
        System.out.println(areOccurrencesEqual(s));
    }
}
