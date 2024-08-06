public class Capitalize_The_Title {

    public static String capitalizeTitle(String title) {

        String ss = title.toLowerCase();

        String[] titleArray = ss.split(" ");
        String op = "";

        for (String s : titleArray) {
            if (s.length() > 2) {
                op = op + (char) (s.charAt(0) - 32) + s.substring(1) + " ";
            } else {
                op = op + s + " ";
            }
        }
        return op.trim();
    }

    public static void main(String[] args) {

        String s = "capiTalIze tHe titLe";
        System.out.println(capitalizeTitle(s));
    }
}
