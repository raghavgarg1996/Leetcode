public class Reverse_Integer {
    public static int reverse(int x) {

        boolean f = true;
        if(x<0)
        {
            x = Math.abs(x);
            f = false;
        }
        if(x<0)
            return 0;
        StringBuilder sb = new StringBuilder(Long.toString(x));
        sb.reverse();
        long val = 0L;
        if(f)
            val = Long.parseLong(sb.toString());
        else
            val = Long.parseLong("-"+sb.toString());
        if(val<-Math.pow(2,31) || val>Math.pow(2,31)-1)
            return 0;
        return (int)val;
    }
    public static void main(String[] args) {
        int k = 123;
        int output = reverse(k);
        System.out.println(output);
    }
}
