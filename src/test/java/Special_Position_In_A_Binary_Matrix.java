public class Special_Position_In_A_Binary_Matrix {

    public static int numSpecial(int[][] mat) {
        int rowCount = mat.length; // Number of rows in the matrix
        int colCount = mat[0].length; // Number of columns in the matrix
        int[] rowSum = new int[rowCount]; // Array to store sum of elements in each row
        int[] colSum = new int[colCount]; // Array to store sum of elements in each column
        int count = 0; // Counter for special positions

        // Calculating rowSum and colSum
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                // For each element in the matrix, add its value to respective rowSum and colSum
                rowSum[i] += mat[i][j]; // Summing elements in the current row
                colSum[j] += mat[i][j]; // Summing elements in the current column
            }
        }

        // Checking for special positions
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                // Check if the current element is 1 and if its row and column sum is 1
                if (mat[i][j] == 1 && rowSum[i] == 1 && colSum[j] == 1) {
                    count++; // Increment count for each special position found
                }
            }
        }

        return count; // Return the count of special positions
    }


    public static void main(String[] args) {

        int[][] mat = new int[3][2];
        mat[0][0] = 0;
        mat[0][1] = 0;
        //  mat[0][2] = 0;
        mat[1][0] = 0;
        mat[1][1] = 0;
        //    mat[1][2] = 0;
        mat[2][0] = 1;
        mat[2][1] = 0;
        //     mat[2][2] = 1;

        System.out.println(numSpecial(mat));
    }
}
