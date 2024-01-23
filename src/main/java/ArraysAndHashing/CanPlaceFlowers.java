package ArraysAndHashing;


//TODO You have a long flowerbed in which some of the plots are planted, and some are not.
// However, flowers cannot be planted in adjacent plots.
// Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n,
// return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
// example
// Input: flowerbed = [1,0,0,0,1], n = 1
// Output: true
public class CanPlaceFlowers {

    // iterate through the flower bed
    // if the element at i is 0
    // get left element
    // get right element
    // if left and right element are 0 put 1 at i element
    // repeat till you reach end
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length == 0) return false;
        for (int i = 0; i < flowerbed.length; i++) {

            if (n == 0) return true;

            if (flowerbed[i] == 0) {
                int left = 0;
                int right = 0;
                if (i == 0) {
                    left = 0;
                    if (i == flowerbed.length - 1) {
                        right = 0;
                    } else {
                        right = flowerbed[i + 1];
                    }
                } else if (i == flowerbed.length - 1) {
                    right = 0;
                    if (i == 0) {
                        left = 0;
                    } else {
                        left = flowerbed[i - 1];
                    }
                } else {
                    left = flowerbed[i - 1];
                    right = flowerbed[i + 1];
                }

                if (left == 0 && right == 0) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }
        return n == 0;
    }
}
