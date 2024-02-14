import java.util.ArrayList;
import java.util.List;

public class Categorize_Box_According_To_Criteria {

    public static String categorizeBox(int length, int width, int height, int mass) {

        List<String> ls = new ArrayList<>();
        String sol = "";
        long vol = (long) length * width * height;

        if ((length >= 10000) || (width >= 10000) || (height >= 10000) || (mass >= 10000) || (vol >= 1000000000)) {
            ls.add("Bulky");
        }
        if (mass >= 100) {
            ls.add("Heavy");
        }
        if (ls.contains("Bulky") && (ls.contains("Heavy"))) {
            sol = "Both";
        } else if (!ls.contains("Bulky") && (!ls.contains("Heavy"))) {
            sol = "Neither";
        } else if (ls.contains("Bulky") && (!ls.contains("Heavy"))) {
            sol = "Bulky";
        } else if (!ls.contains("Bulky") && (ls.contains("Heavy"))) {
            sol = "Heavy";
        }

        return sol;
    }

    public static void main(String[] args) {

        int length = 2909;
        int width = 3968;
        int height = 3272;
        int mass = 727;
        System.out.println(categorizeBox(length, width, height, mass));
    }
}
