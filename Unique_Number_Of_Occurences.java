import java.util.*;

public class Unique_Number_Of_Occurences {

    public static boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        List<Integer> ls = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                int val = hm.get(arr[i]);
                hm.put(arr[i], ++val);
            } else {
                hm.put(arr[i], 1);
            }
        }

        for (Map.Entry entry : hm.entrySet()) {
            ls.add((int) entry.getValue());
        }

        int listSize = ls.size();
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < ls.size(); i++) {
            hs.add(ls.get(i));
        }

        if (hs.size() == listSize) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 1, 1, 3};
        System.out.println(uniqueOccurrences(arr));
    }
}
