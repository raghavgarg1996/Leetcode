import java.util.HashMap;
import java.util.Map;

public class Elements_Appearing_More_Than_25_Percent_In_Sorted_Array {

    public static int findSpecialInteger(int[] arr) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        int key = 0;

        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                int val = hm.get(arr[i]);
                hm.put(arr[i], ++val);
            } else {
                hm.put(arr[i], 1);
            }
        }

        System.out.println(hm);

        for (Map.Entry entry : hm.entrySet()) {
            int val = (int) entry.getValue();

            double k = (double) val / arr.length;
            if (k > 0.25) {
                key = (int) entry.getKey();
            }
        }

        return key;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 6, 6, 6, 6, 7, 10};
        System.out.println(findSpecialInteger(arr));
    }
}
