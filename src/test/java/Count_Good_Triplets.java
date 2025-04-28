public class Count_Good_Triplets {


    public static int countGoodTriplets(int[] arr, int a, int b, int c) {

        //   Arrays.sort(arr);

        //   System.out.println(String.format(Arrays.toString(arr)));
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if ((Math.abs(arr[i] - arr[j]) <= a) && (Math.abs(arr[j] - arr[k]) <= b) && (Math.abs(arr[i] - arr[k]) <= c)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[] arr = {3, 0, 1, 1, 9, 7};
        int a = 7;
        int b = 2;
        int c = 3;

        System.out.println(countGoodTriplets(arr, a, b, c));
    }
}
