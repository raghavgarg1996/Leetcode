public class Find_The_Index_Of_The_First_Occurence_In_A_String {

    public static int strStr(String haystack, String needle) {

        int x = 0;
        int y = 0;
        int startPos = -1;
        int endPos = 0;

        if (haystack.length()<needle.length()) {
            return startPos;
        }

        while (y<haystack.length()) {
            if (needle.charAt(x)==haystack.charAt(y)) {
                x++;
                y++;
                if (x==needle.length()) {
                    endPos =y;
                    startPos = endPos - needle.length();
                    break;
                }
            } else {
                x=0;
                y = endPos +1;
                endPos = y;
            }
        }

        return startPos;
    }

    public static void main(String[] args) {

        String haystack = "mississippi";
        String needle = "issip";

        System.out.println(strStr(haystack, needle));
    }
}
