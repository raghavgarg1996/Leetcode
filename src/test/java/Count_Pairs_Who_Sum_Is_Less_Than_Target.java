import java.util.ArrayList;
import java.util.List;

public class Count_Pairs_Who_Sum_Is_Less_Than_Target {

    public static int countPairs(List<Integer> nums, int target) {

        int count = 0;

        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(j) + nums.get(i) < target) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(-1);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(1);
        int target = 2;
        System.out.println(countPairs(nums, target));
    }
}
