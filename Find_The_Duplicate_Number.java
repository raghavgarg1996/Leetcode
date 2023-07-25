import java.util.HashMap;
import java.util.Map;

public class Find_The_Duplicate_Number {

    public static int findDuplicate(int[] nums) {

        int h =0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i=0; i<nums.length; i++) {

            if (hm.containsKey(nums[i])) {
                int k = hm.get(nums[i]);
                hm.put(nums[i],++k);
            } else {
                hm.put(nums[i],1);
            }
        }

        for (Map.Entry entry : hm.entrySet()) {
            int key = (int) entry.getKey();
            int val = (int) entry.getValue();

            if (val>=2) {
                h = key;
                break;
            }
        }

        return h;
    }

    public static void main (String[] args) {

        int[] nums = {2,2,2,2,2};
        System.out.println(findDuplicate(nums));
    }
}
