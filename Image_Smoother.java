public class Image_Smoother {

    public static int[][] imageSmoother(int[][] img) {

        int m = img.length;
        int n = img[0].length;

        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = calculateSmoother(img, i, j, m, n);
            }
        }

        return result;
    }

    public static int calculateSmoother(int[][] img, int row, int col, int m, int n) {
        int sum = 0;
        int count = 0;

        for (int i = Math.max(0, row - 1); i <= Math.min(m - 1, row + 1); i++) {
            for (int j = Math.max(0, col - 1); j <= Math.min(n - 1, col + 1); j++) {
                sum += img[i][j];
                count++;
            }
        }

        return sum / count;
    }

    public static void main(String[] args) {

        int[][] arr = new int[3][3];
        arr[0][0] = 1;
        arr[0][1] = 1;
        arr[0][2] = 1;
        arr[1][0] = 1;
        arr[1][1] = 0;
        arr[1][2] = 1;
        arr[2][0] = 1;
        arr[2][1] = 1;
        arr[2][2] = 1;

        int[][] out = imageSmoother(arr);

        for (int i = 0; i < out.length; i++) {
            for (int j = 0; j < out.length; j++) {
                System.out.print(out[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
