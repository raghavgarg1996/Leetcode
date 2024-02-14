import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Sort_Array_By_Increasing_Frequency {

    public static int[] frequencySort(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        HashMap<Integer, Integer> sortedHashMap = new HashMap<>();
        ArrayList<Integer> ls = new ArrayList<>();
        int[] sol = {};

        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                int val = hm.get(nums[i]);
                hm.put(nums[i], ++val);
            } else {
                hm.put(nums[i], 1);
            }
        }

        System.out.println(hm);

        for (Map.Entry entry : hm.entrySet()) {
            ls.add((int) entry.getValue());
        }

        System.out.println(ls);
        Collections.sort(ls);
        System.out.println(ls);

        for (int i = 0; i < ls.size(); i++) {
            for (Map.Entry entry : hm.entrySet()) {
                int value = (int) entry.getValue();
                int k = ls.get(i);
                if (value == k) {
                    sortedHashMap.put((Integer) entry.getKey(), k);
                    System.out.println(sortedHashMap);
                }
            }
        }

        return sol;

    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 2, 3};
        int[] sol = frequencySort(nums);
    }
}
