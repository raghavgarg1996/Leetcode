public class Count_Asterisks {

    public static int countAsterisks(String s) {

        int slashCount = 0;
        int astrikCount = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '|') {
                slashCount++;
            }

            if ((slashCount % 2 == 0) && (s.charAt(i) == '*')) {
                astrikCount++;
            }
        }

        return astrikCount;
    }

    public static void main(String[] args) {

        String s = "l|*e*et|c**o|*de|";
        System.out.println(countAsterisks(s));
    }
}
