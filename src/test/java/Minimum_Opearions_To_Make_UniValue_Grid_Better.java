import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Minimum_Opearions_To_Make_UniValue_Grid_Better {

    public static int minOperations(int[][] grid, int x) {

        List<Integer> list = new ArrayList<>();

        // Flatten the grid into a single list
        for (int[] row : grid) {
            for (int num : row) {
                list.add(num);
            }
        }

        // Sort the list to find the median
        Collections.sort(list);

        // Find the median
        int median = list.get(list.size() / 2);

        int operations = 0;

        // Calculate the number of operations
        for (int num : list) {
            int diff = Math.abs(num - median);

            // Check if transformation is possible
            if (diff % x != 0) {
                return -1;
            }

            operations += diff / x;
        }

        return operations;
    }

    public static void main(String[] args) {

        int[][] grid = {{1, 2}, {3, 4}};
        int x = 2;
        System.out.println(minOperations(grid, x));
    }
}
