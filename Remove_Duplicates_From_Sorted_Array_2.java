import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class Remove_Duplicates_From_Sorted_Array_2 {

    public static int removeDuplicates(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> ls = new ArrayList<>();
        int arraySize = nums.length;

        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                int val = hm.get(nums[i]);
                hm.put(nums[i], ++val);
            } else {
                hm.put(nums[i], 1);
            }
        }


        for (Map.Entry entry : hm.entrySet()) {
            int k = (int) entry.getValue();
            int val = (int) entry.getKey();
            if (k >= 2) {
                ls.add(val);
                ls.add(val);
            } else {
                ls.add(val);
            }
        }

        Collections.sort(ls);

        for (int i=0; i<ls.size(); i++) {
            nums[i] = ls.get(i);
        }

        return ls.size();
    }

    public static void main(String args[]) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = removeDuplicates(nums);
        System.out.println(k);
    }

}