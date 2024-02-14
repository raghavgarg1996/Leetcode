import java.util.HashMap;

public class Maximum_Score_After_Splitting_A_String {

    public static int maxScore(String s) {

        int leftSum = 0;
        int rightSum = 0;
        int maxSum = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            String leftSubString = s.substring(0, i + 1);
            String rightSubString = s.substring(i + 1);

            rightSum = 0;
            leftSum = 0;

            for (int j = 0; j < leftSubString.length(); j++) {
                if (leftSubString.charAt(j) == '0') {
                    leftSum++;
                }
            }

            for (int j = 0; j < rightSubString.length(); j++) {
                if (rightSubString.charAt(j) == '1') {
                    rightSum++;
                }
            }

            int sum = 0;
            sum = leftSum + rightSum;

            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {

        String s = "011101";
        System.out.println(maxScore(s));

    }
}
