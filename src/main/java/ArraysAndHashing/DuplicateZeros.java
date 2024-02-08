package ArraysAndHashing;

public class DuplicateZeros {

    //TODO: Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
    // Note that elements beyond the length of the original array are not written.
    // Do the above modifications to the input array in place and do not return anything.
    // example
    // Input: arr = [1,0,2,3,0,4,5,0]  1 0 0 2 3 0 0 4 5 0 0
    // Output: [1,0,0,2,3,0,0,4]
    // Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
    public static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 && (i + 1) < arr.length) {
                for (int j = arr.length - 1; j >= i + 1; j--) {
                    arr[j] = arr[j-1];
                }
                arr[i + 1] = 0;
                i++;
            }
        }
    }
}

