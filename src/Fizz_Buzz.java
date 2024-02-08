import java.util.*;

public class Fizz_Buzz {

    public static List<String> fizzBuzz(int n) {

        List<String> ls = new ArrayList<>();
        for (int i = 1; i <= n; i++) {

            if ((i % 3 == 0) && (i % 5 != 0)) {
                ls.add("Fizz");
            } else if ((i % 5 == 0) && (i % 3 != 0)) {
                ls.add("Buzz");
            } else if ((i % 5 == 0) && (i % 3 == 0)) {
                ls.add("FizzBuzz");
            } else {
                ls.add(String.valueOf(i));
            }
        }
        return ls;
    }

    public static void main(String[] args) {

        int n = 5;
        List<String> ls = fizzBuzz(n);
        System.out.println(ls);
    }
}
