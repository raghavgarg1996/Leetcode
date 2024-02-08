import java.util.HashSet;
import java.util.Iterator;

public class Restore_The_Array_From_Adjacent_Pairs {

    public static int[] restoreArray(int[][] adjacentPairs) {

        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < adjacentPairs.length; i++) {
            int[] arr = new int[adjacentPairs[0][i]];
            for (int j = 0; j < arr.length; j++) {
                hs.add(arr[j]);
            }
        }

        int[] sol = new int[hs.size()];

        Iterator<Integer> iterator = hs.iterator();
        int index = 0;
        while (iterator.hasNext()) {
            sol[index++] = iterator.next();
        }

        return sol;
    }

    public static void main(String[] args) {

        int[][] adjacentPairs = {{2, 1}, {3, 4}, {3, 2}};
        int[] arr = restoreArray(adjacentPairs);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
