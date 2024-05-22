public class Score_Of_A_String {

    public static int scoreOfString(String s) {

        int k = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            k = k + Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        return k;
    }

    public static void main(String[] args) {

        String s = "hello";
        System.out.println(scoreOfString(s));
    }
}
