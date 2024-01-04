import java.util.HashMap;
import java.util.Map;

public class Minimum_Number_Of_Opearions_To_Make_Array_Empty {

    public static int minOperations(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        int output = 0;
        int pending = 0;

        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                int val = hm.get(nums[i]);
                hm.put(nums[i], ++val);
            } else {
                hm.put(nums[i], 1);
            }
        }

        for (Map.Entry entry : hm.entrySet()) {
            int value = (int) entry.getValue();
            if (value == 1) {
                output = -1;
                break;
            } else {
                int quotient = 0;
                int remainder = 0;

                if ((value % 3 != 0) && (value != 2)) {
                    quotient = value / 3;
                    remainder = (value % 3);
                    if (remainder == 2) {
                        value = (value % 3) + 2;
                    } else {
                        value = (value % 3) + 3;
                    }
                    output = output + quotient - 1;
                } else {
                    pending = value / 3;
                    output = output + pending;
                }

                if ((value % 2 == 0) && (value % 3 != 0)) {
                    pending = value / 2;
                    output = output + pending;
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {

        int[] nums = {3, 14, 3, 14, 3, 14, 14, 3, 3, 14, 14, 14, 3, 14, 14, 3, 14, 14, 14, 3};
        System.out.println(minOperations(nums));
    }
}
