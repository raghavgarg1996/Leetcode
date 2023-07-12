public class Find_The_Maximum_Achievable_No {

    public static int theMaximumAchievableX(int num, int t) {


        int sum =num+t;

        for (int i=0; i<t; i++) {
            sum = sum + 1;
        }

        return sum;
    }

    public static void main (String args[]) {
        int num = 3;
        int t =2;

        System.out.println(theMaximumAchievableX(num, t));
    }
}
