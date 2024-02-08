public class Find_the_Distance_Between_Two_Arrays {

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

        int valCount = 0;

        for (int i = 0; i < arr1.length; i++) {
            int k = arr1[i];
            int count = 0;
            for (int j = 0; j < arr2.length; j++) {
                if (Math.abs(k - arr2[j]) > d) {
                    count++;
                }
            }
            if (count == arr2.length) {
                valCount++;
            }
        }
        return valCount;
    }

    public static void main(String[] args) {

        int[] arr1 = {4, 5, 8};
        int[] arr2 = {10, 9, 1, 8};
        int d = 2;

        System.out.println(findTheDistanceValue(arr1, arr2, d));
    }
}
