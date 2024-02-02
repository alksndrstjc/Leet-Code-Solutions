package TwoPointers;

public class ContainerWithMostWater {

    //TODO: You are given an integer array height of length n.
    // There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
    // Find two lines that together with the x-axis form a container, such that the container contains the most water.
    // Return the maximum amount of water a container can store.
    // Notice that you may not slant the container.
    public static int maxArea(int[] height) {

        //init two pointers left and right
        // check the heights at the left and right and pick the lower or equal one
        // calculate the smaller height with the distance between the pointers
        // distance between the pointers is len and with each pointer move it is
        // find the biggest area
        int maxArea = 0;

        int left = 0;
        int right = height.length - 1;
        int distance = height.length - 1;

        while (left < right) {
            int currentArea;
            if (height[left] <= height[right]) {
                currentArea = height[left] * distance;
                left++;
            } else {
                currentArea = height[right] * distance;
                right--;
            }
            distance--;

            if (maxArea < currentArea) maxArea = currentArea;
        }

        return maxArea;
    }
}
