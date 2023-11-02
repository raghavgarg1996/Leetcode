import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Three_SumCloset {

    public static int threeSumClosest(int[] nums, int target) {

        HashMap<Integer, ArrayList> hm = new HashMap<>();
        ArrayList<Integer> ls;
        Arrays.sort(nums);

        for (int i = 0; i <= nums.length - 3; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j <= k) {
                ls = new ArrayList<>();
                int current_Sum = nums[i];
                current_Sum = current_Sum + nums[j];
                current_Sum = current_Sum + nums[k];
                ls.add(nums[i]);
                ls.add(nums[j]);
                ls.add(nums[k]);
                hm.put(current_Sum, ls);

                if (current_Sum == target) {
                    j++;
                    k--;
                } else if (current_Sum > target) {
                    k--;
                } else {
                    j++;
                }
            }
        }

        System.out.println(hm);

        int minVal = nums[nums.length - 1];
        int keyVal = nums[0];
        for (Map.Entry entry : hm.entrySet()) {
            int key = (int) entry.getKey();
            int closeVal = target - key;
            if ((minVal >= closeVal) && (key > keyVal)) {
                minVal = closeVal;
                keyVal = key;
            }
        }

        return keyVal;
    }

    public static void main(String[] args) {

        int[] nums = {1,1,-1};
        int target = 2;
        System.out.println(threeSumClosest(nums, target));
    }
}
