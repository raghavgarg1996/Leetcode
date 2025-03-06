import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Find_Missing_And_Repeated_Values {

    public static int[] findMissingAndRepeatedValues(int[][] grid) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        HashSet<Integer> hs = new HashSet<>();
        int[] arr = new int[2];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {

                hs.add(grid[i][j]);
                if (hm.containsKey(grid[i][j])) {
                    int val = hm.get(grid[i][j]);
                    hm.put(grid[i][j], ++val);
                } else {
                    hm.put(grid[i][j], 1);
                }
            }

        }

        System.out.println(hm);

        for (Map.Entry entry : hm.entrySet()) {
            if ((Integer) entry.getValue() > 1) {
                arr[0] = (Integer) entry.getKey();
            }
        }


        for (int i = 1; i <= hs.size() + 1; i++) {
            if (!hs.contains(i)) {
                arr[1] = i;
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        int[][] grid = {{1, 3}, {2, 2}};
        int[] sol = findMissingAndRepeatedValues(grid);

        for (int i = 0; i < sol.length; i++) {
            System.out.print(sol[i] + " ");
        }
    }
}
