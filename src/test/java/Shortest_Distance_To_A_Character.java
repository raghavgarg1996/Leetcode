import java.util.*;

public class Shortest_Distance_To_A_Character {

    public static int[] shortestToChar(String s, char c) {

        List<Integer> ls = new ArrayList<>();
        List<Integer> valueArray;
        List<List<Integer>> allArray = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                ls.add(i);
            }
        }

        for (int i = 0; i < ls.size(); i++) {
            int k = ls.get(i);

            valueArray = new ArrayList<>();
            for (int j = 0; j < s.length(); j++) {
                int val = Math.abs(j - k);
                valueArray.add(val);
            }
            allArray.add(valueArray);
        }

        List<Integer> minValues = new ArrayList<>();
        for (int i = 0; i < allArray.get(0).size(); i++) {
            int min = allArray.get(0).get(i);
            for (List<Integer> list : allArray) {
                min = Math.min(min, list.get(i));
            }
            minValues.add(min);
        }

        int[] arr = new int[minValues.size()];

        for (int i = 0; i < minValues.size(); i++) {
            arr[i] = minValues.get(i);
        }

        return arr;
    }

    public static void main(String[] args) {

        String s = "loveleetcode";
        char c = 'e';

        int[] arr = shortestToChar(s, c);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
