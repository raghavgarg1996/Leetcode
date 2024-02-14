import java.util.Stack;

public class Astreoid_Coliision_Complete_Sol {

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            if (stack.isEmpty() || asteroid > 0) {
                stack.push(asteroid);
            } else {
                while (true) {
                    int top = stack.peek();
                    if (top < 0) {
                        stack.push(asteroid);
                        break;
                    } else if (top == -asteroid) {
                        stack.pop();
                        break;
                    } else if (top > -asteroid) {
                        break;
                    } else {
                        stack.pop();
                        if (stack.isEmpty()) {
                            stack.push(asteroid);
                            break;
                        }
                    }
                }
            }
        }

        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }

    public static void printArr(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {-2, -1, 1, 2};
        int[] out = asteroidCollision(arr);
        printArr(out);
    }
}
