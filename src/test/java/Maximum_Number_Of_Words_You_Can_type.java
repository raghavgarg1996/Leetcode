public class Maximum_Number_Of_Words_You_Can_type {

    public static int canBeTypedWords(String text, String brokenLetters) {
        String[] stext = text.split(" ");

        for (int i = 0; i < stext.length; i++) {

            int stringsize = brokenLetters.length();

            for (int j = 0; j < stringsize; j++) {

//                if (stext[i].contains(brokenLetters.charAt(j)) ) {
//
//                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {

        String text = "hello world";
        String brokenLetters = "ad";

        System.out.println(canBeTypedWords(text, brokenLetters));
    }
}
