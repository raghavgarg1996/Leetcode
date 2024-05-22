public class Find_The_Town_Judge {

    public static int findJudge(int n, int[][] trust) {

        int value = 0;
        int count = 0;
        int b = 0;

        for (int i = 0; i < trust.length; i++) {

            int[] f = new int[]{trust[i][1]};

            b = f[0];

            if (count == 0) {
                value = b;
            }

            if (value == b) {
                count++;
            }
        }

        if (count == n - 1) {
            return b;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

        int n = 2;
        int[] k = {1, 3};
        int[] l = {2, 3};
        int[] m = {3, 1};
        int[][] trust = new int[][]{k, l, m};
        System.out.println(findJudge(n, trust));
    }
}
