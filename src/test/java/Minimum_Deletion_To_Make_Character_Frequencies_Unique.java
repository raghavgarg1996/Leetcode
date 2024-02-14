import java.util.*;

public class Minimum_Deletion_To_Make_Character_Frequencies_Unique {

    public static int minDeletions(String s) {

        HashMap<Character, Integer> hm = new HashMap<>();
        HashSet<Integer> hs = new HashSet<>();
        int deletionNeeded = 0;

        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                int k = hm.get(s.charAt(i));
                hm.put(s.charAt(i), ++k);
            } else {
                hm.put(s.charAt(i), 1);
            }

            int freq = hm.get(s.charAt(i));

            while (hs.contains(freq)) {
                freq--;
                deletionNeeded++;
            }
            hs.add(freq);
        }

        return deletionNeeded;

    }

    public static void main(String[] args) {

        String s = "aab";
        System.out.println(minDeletions(s));
    }
}
