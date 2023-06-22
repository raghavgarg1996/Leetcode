public class Find_The_Index_Of_The_First_Occurence_In_A_String {

    // Partial solution - successfully completeled 29 cases, below case failed
    public static int strStr(String haystack, String needle) {

        int x = 0;
        int y = 0;
        int startPos = -1;
        int endPos = 0;
        int count =0;

        if (haystack.length()<needle.length()) {
            return startPos;
        }

        while (y<haystack.length()) {
            if (needle.charAt(x)==haystack.charAt(y)) {
                x++;
                y++;
                count++;
                if (count==needle.length()) {
                    endPos =y;
                    startPos = endPos - needle.length();
                    break;
                }
            } else {
                x=0;
                if (needle.charAt(x)==haystack.charAt(y)) {
                    x++;
                    y++;
                    count++;
                    if (count==needle.length()) {
                        endPos =y;
                        startPos = endPos - needle.length();
                        break;
                    }
                } else {
                    y++;
                }
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
