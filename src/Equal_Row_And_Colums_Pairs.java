public class Equal_Row_And_Colums_Pairs {

    public static int equalPairs(int[][] grid) {

        int i = 0;
        int sol = 0;
        int[] arr = new int[grid.length];

        while (i < grid.length) {
            int j = 0;
            while (j < grid.length) {
                arr[j] = grid[i][j];
                j++;
            }


            for (int k = 0; k < grid.length; k++) {
                int count = 0;
                for (int l = 0; l < grid.length; l++) {
                    if (arr[l] == grid[l][k]) {
                        count++;
                    }
                }

                if (count % grid.length == 0) {
                    sol = sol + count / grid.length;
                }
            }
            i++;
        }


        return sol;
    }

    public static void main(String[] args) {

        int[][] grid = {{3, 2,1}, {1, 7, 6}, {2, 7, 7}};
        int k = equalPairs(grid);
        System.out.println(k);
    }
}
