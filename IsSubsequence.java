public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {

      // Two pointer solution
        boolean sol = false;
        int count =0;
        int x=0;
        int y=0;

        if (s.length()==0) {
            return true;
        }
        while (y<=t.length()-1) {
            if ((count!=s.length())&&(s.charAt(x)==t.charAt(y))) {
                x++;
                y++;
                count++;
            } else {
                y++;
            }
        }

        if (count==s.length()) {
            return true;
        }
        return sol;
    }

    public static void main(String[] args) {

        String s = "b";
        String t = "abc";
        boolean k = isSubsequence(s,t);
        System.out.println(k);
    }
}
