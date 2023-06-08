public class Count_Negative_Number_In_Sorted_Matrix {

    public static int countNegatives(int[][] grid) {

        int count =0;
        int m = grid.length;
        int n = grid[0].length;
        for (int i=0; i< m; i++) {
            for (int j=0; j<n; j++) {
                if (grid[i][j]<0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] grid = {{5,1,0}, {-5,-5,-5}};
        int output = countNegatives(grid);
        System.out.println(output);
    }
}
