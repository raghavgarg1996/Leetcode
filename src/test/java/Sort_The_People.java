import java.util.Arrays;
import java.util.HashMap;

public class Sort_The_People {

    public static String[] sortPeople(String[] names, int[] heights) {

        HashMap<Integer, String> hm = new HashMap<>();
        String[] arr = new String[names.length];
        String[] finalOutput = new String[names.length];

        for (int i = 0; i < heights.length; i++) {
            hm.put(heights[i], names[i]);
        }

        Arrays.sort(heights);

        for (int i = 0; i < heights.length; i++) {
            arr[i] = hm.get(heights[i]);
        }

        for (int i = 0; i < heights.length; i++) {
            finalOutput[i] = arr[arr.length - i - 1];
        }

        return finalOutput;
    }

    public static void main(String[] args) {

        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};
        String[] ans = sortPeople(names, heights);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
