import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sort_Array_By_Increasing_Frequency {

    public static int[] frequencySort(int[] nums) {
        // Step 1: Count frequency
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        // Step 2: Sort entries by frequency (ascending), and by value (descending) if frequencies are same
        List<Map.Entry<Integer, Integer>> sortedEntries = hm.entrySet()
                .stream()
                .sorted((a, b) -> a.getValue().equals(b.getValue()) ? b.getKey() - a.getKey() : a.getValue() - b.getValue())
                .collect(Collectors.toList());

        // Step 3: Extract keys based on sorted order
        List<Integer> sortedList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : sortedEntries) {
            for (int i = 0; i < entry.getValue(); i++) {
                sortedList.add(entry.getKey());
            }
        }

        // Step 4: Convert List<Integer> to int[]
        return sortedList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {

        int[] nums = {2, 3, 1, 3, 2};
        int[] sol = frequencySort(nums);

        for (int i = 0; i < sol.length; i++) {
            System.out.print(sol[i] + " ");
        }
    }
}
