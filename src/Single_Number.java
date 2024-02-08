import java.util.*;
public class Single_Number {
    public static int[] singleNumber(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> ls = new ArrayList<>();
        int[] arr = new int[2];

        for (int i=0 ;i<nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                int k = hm.get(nums[i]);
                hm.put(nums[i], ++k);
            } else {
                hm.put(nums[i], 1);
            }
        }

        for (Map.Entry entry : hm.entrySet()) {
            int f = (int) entry.getValue();
            if (f==1) {
                ls.add((int) entry.getKey());
            }
        }

        for (int i=0; i<ls.size(); i++) {
            arr[i] = ls.get(i);
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,3,2,5};
        int[] out = singleNumber(arr);

        for (int i=0; i<out.length; i++) {
            System.out.println(out[i]);
        }
    }
}
