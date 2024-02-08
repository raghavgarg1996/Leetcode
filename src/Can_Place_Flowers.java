public class Can_Place_Flowers {

    // Partial code - passes 100 cases few cases pending
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        int count = 0;
        int x = 0;
        int y = 1;

        while (y < flowerbed.length - 1) {
            if ((flowerbed[x] != flowerbed[y]) && (flowerbed[x + 1] == flowerbed[y + 1])) {
                count++;
                x++;
                y++;
            } else {
                x++;
                y++;
            }
        }

        if (count >= n) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 2;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }
}
