import java.util.*;

public class Majority_Element {

    public static int majorityElement(int[] nums) {

        int ele = nums.length / 2;
        int sol = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                int k = hm.get(nums[i]);
                hm.put(nums[i],++k);
            } else {
                hm.put(nums[i],1);
            }
        }

        System.out.println(hm);
        for (Map.Entry entry : hm.entrySet()) {
            int key = (int) entry.getKey();
            int val = (int) entry.getValue();

            if (val>=ele) {
                sol = key;
                ele = val;
            }
        }

        return sol;
    }

    public static void main(String[] args) {

        int[] nums = {-1,1,1,1,2,1};
        int k = majorityElement(nums);
        System.out.println(k);
    }
}
