import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Largest_Number {

    public static String largestNumber(int[] nums) {

        StringBuffer st = new StringBuffer();
        ArrayList<Integer> ls = new ArrayList();

        for (int i=0; i<nums.length; i++) {
            ls.add(nums[i]);
        }

        while (!ls.isEmpty()) {
            int max = maxValue(ls);
            st.append(max);
            ls.remove(max);
        }

        return st.toString();
    }

    public static int maxValue(List<Integer> ls) {
        int[] arr = new int[ls.size()];
        for (int i = 0; i < ls.size(); i++) {
            arr[i] =  ls.get(i);
        }

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


    public static void main(String[] args) {

        int[] nums = {10, 2};
        System.out.println(largestNumber(nums));
    }
}
