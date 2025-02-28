public class Two_Sum_II_Input_Array_Is_Sorted {

    public static int[] twoSum(int[] numbers, int target) {

        int[] arr = new int[2];

        int x = 0;
        int y = numbers.length - 1;

        while (x < y) {
            int sum = numbers[x] + numbers[y];
            if (sum == target) {
                arr[0] = x + 1;
                arr[1] = y + 1;
                break;
            } else if (sum > target) {
                y--;
            } else {
                x++;
            }
        }
        return arr;
    }


    public static void main(String[] args) {

        int[] arr = {2, 3, 4};
        int target = 6;

        int[] sol = twoSum(arr, target);

        for (int i = 0; i < sol.length; i++) {
            System.out.println(sol[i]);
        }
    }
}
