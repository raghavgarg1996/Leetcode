public class LargestEvenNumber {

    public static String largestEven(String s) {

        int stringLength = 0;
        int sLength = s.length();

        while (stringLength<sLength) {
            if (s.charAt(s.length()-1)!=('2')) {
                s = s.substring(0,(s.length()-1));
            }
            stringLength++;
        }

        if ((s.length()==1)&&(s.charAt(0)!='2')) {
            return "";
        }

        return s;
    }

    public static void main(String[] args) {

        String s = "1111";
        System.out.println(largestEven(s));
    }
}
