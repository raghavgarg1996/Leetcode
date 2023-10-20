import java.util.Stack;

public class Asteroid_Collision {

    public static int[] asteroidCollision(int[] asteroids) {

        int[] arrRev = new int[asteroids.length];

        for (int i = 0; i < asteroids.length; i++) {
            arrRev[asteroids.length - i - 1] = asteroids[i];
        }

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arrRev.length; i++) {

            int k = arrRev[i];

            if (!st.isEmpty()) {
                int val = st.peek();
                if ((val > 0) && (k > 0)) {
                    st.push(k);
                } else if ((val > 0) && (k < 0)) {
                    int p = Math.abs(k);
                    if (p > val) {
                        st.pop();
                        st.push(k);
                    } else if (p == val) {
                        st.pop();
                    }
                } else if ((val < 0) && (k > 0)) {
                    int hg = Math.abs(val);
                    if (hg < k) {
                        st.pop();
                        st.push(k);
                    } else if (hg == k) {
                        st.pop();
                    }
                } else {
                    st.push(k);
                }

            } else {
                st.push(k);
            }
        }

        int stackSize = st.size();

        int[] finalarr = new int[stackSize];

        for (int i = 0; i < stackSize; i++) {
            finalarr[i] = st.pop();
        }
        return finalarr;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 10, -5};
        int[] out = asteroidCollision(arr);
        printArr(out);

    }

}
