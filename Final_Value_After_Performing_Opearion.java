public class Final_Value_After_Performing_Opearion {

    public static int finalValueAfterOperations(String[] operations) {

        int sum =0;

        for (String s : operations) {
            char[] carray = s.toCharArray();
            if (carray[0] == '-') {
                sum = sum - 1;
            } else if (carray[0] == 'X') {
                if (carray[1] == '-') {
                    sum = sum - 1;
                } else {
                    sum = sum + 1;
                }
            } else {
                sum = sum +1;
            }
        }

        return sum;
    }


    public static void main (String[] args) {
        String[] arr = {"--X","X++","X++"};
        int k = finalValueAfterOperations(arr);
        System.out.println(k);

    }
}
