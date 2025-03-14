import java.util.HashMap;
import java.util.Map;

public class Count_The_Number_Of_Good_Subarrays {

    public static long countGood(int[] nums, int k) {

        int y = 0;
        int z = 0;
        int oldPairsCount = 0;
        int newPairCount = 0;
        int countValue = k;
        int handleCase = 0;

        HashMap<Integer, Integer> hm = new HashMap<>();

        while (z < nums.length) {

            for (int i = y; i <= z; i++) {
                if (hm.containsKey(nums[i])) {
                    int val = hm.get(nums[i]);
                    hm.put(nums[i], ++val);
                } else {
                    hm.put(nums[i], 1);
                }
            }

            System.out.println(hm);

            int count = 0;

            for (Map.Entry entry : hm.entrySet()) {
                if ((int) entry.getValue() == 2) {
                    count++;
                }

                if (count == k) {
                    count = 0;
                    oldPairsCount++;
                }

                if ((int) entry.getValue() == nums.length) {
                    handleCase++;
                    break;
                }
            }
            z++;
            hm = new HashMap<>();
        }

        if (z == nums.length) {
            while (countValue == k) {
                y++;

                for (int i = y; i < z; i++) {
                    if (hm.containsKey(nums[i])) {
                        int val = hm.get(nums[i]);
                        hm.put(nums[i], ++val);
                    } else {
                        hm.put(nums[i], 1);
                    }
                }

                System.out.println(hm);
                newPairCount = oldPairsCount;

                int count = 0;

                for (Map.Entry entry : hm.entrySet()) {
                    if ((int) entry.getValue() >= k) {
                        count++;
                    }

                    if (count >= 2) {
                        newPairCount++;
                        countValue = count;
                        count = 0;
                    }

                    if (newPairCount == oldPairsCount) {
                        countValue--;
                    } else {
                        oldPairsCount = newPairCount;
                    }

                }
                hm = new HashMap<>();
            }

        }


        if (handleCase == 1) {
            return 1;
        }
        return oldPairsCount;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 1, 1};
        int k = 10;
        System.out.println(countGood(nums, k));
    }
}
