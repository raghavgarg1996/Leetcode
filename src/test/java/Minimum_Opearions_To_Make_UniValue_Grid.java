import java.util.ArrayList;
import java.util.Arrays;

public class Minimum_Opearions_To_Make_UniValue_Grid {

    public static int minOperations(int[][] grid, int x) {

        int totalSum = 0;
        ArrayList<Integer> ls = new ArrayList<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {

                ls.add(grid[i][j]);
                totalSum = totalSum + grid[i][j];
            }
        }

        double deduceValue = (double) totalSum / ls.size();
        int[] arr = ls.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(arr);

        int p = 0;
        int r = arr.length - 1;
        int nearestValue = -1;

        while (p <= r) {
            int q = (p + r) / 2;

            if (q == deduceValue) {
                nearestValue = arr[q];
            } else {
                if (arr[q] > deduceValue) {
                    r = q - 1;
                } else {
                    p = q + 1;
                }
            }
        }

        if (nearestValue == -1) { // If target wasn't found
            if (r < 0) {
                nearestValue = arr[p]; // Target is smaller than the first element
            } else if (p >= arr.length) {
                nearestValue = arr[r]; // Target is larger than the last element
            } else {
                // Find the closest value
                nearestValue = (deduceValue - arr[r] <= arr[p] - deduceValue) ? arr[r] : arr[p];
            }
        }

        System.out.println(ls);

        int operations = 0;

        for (int i = 0; i < ls.size(); i++) {
            int ff = Math.abs(ls.get(i) - nearestValue);
            double finVal = (double) ff / x;
            if (finVal % 1 != 0) { // If there's a fraction part
                return -1;
            }

            if (finVal != 0) {
                operations = (int) (operations + finVal);
            }
        }

        return operations;
    }

    public static void main(String[] args) {

        int[][] grid = {{1, 2}, {3, 4}};
        int x = 2;
        System.out.println(minOperations(grid, x));
    }
}
