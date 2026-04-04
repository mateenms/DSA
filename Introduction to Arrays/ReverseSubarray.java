
    /*
     * ============================================================
     * 🧠 PROBLEM THEORY (INSIDE CODE)
     * ============================================================
     *
     * Given:
     * - An integer array arr[]
     * - Two indices start (B) and end (C)
     *
     * Task:
     * - Reverse the elements of the array within range [start, end]
     *
     * Example:
     * arr = [1, 2, 3, 4], start = 2, end = 3
     * Output → [1, 2, 4, 3]
     *
     * ------------------------------------------------------------
     * 💡 APPROACH (Two Pointer Technique)
     * ------------------------------------------------------------
     * - Use two pointers:
     *      left  → start
     *      right → end
     *
     * - Swap elements at left and right
     * - Move pointers inward:
     *      left++
     *      right--
     *
     * - Stop when left >= right
     *
     * ------------------------------------------------------------
     * ⚡ WHY THIS APPROACH?
     * ------------------------------------------------------------
     * - In-place reversal (no extra space required)
     * - Efficient and simple
     *
     * ------------------------------------------------------------
     * ⏱ COMPLEXITY
     * ------------------------------------------------------------
     * Time Complexity  : O(end - start)
     * Space Complexity : O(1)
     *
     * ============================================================
     */


public class ReverseSubarray {


    /**
     * Function to reverse subarray from index start to end
     */
    public static int[] reverseSubarray(int[] arr, int start, int end) {

        // ✅ Edge Case Check (Important in interviews)
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null.");
            return arr;
        }

        if (start < 0 || end >= arr.length || start > end) {
            System.out.println("Invalid range provided.");
            return arr;
        }

        // 🔁 Two-pointer logic to reverse subarray
        while (start < end) {

            // Swap arr[start] and arr[end]
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move pointers toward center
            start++;
            end--;
        }

        return arr;
    }

    /**
     * Utility method to print array
     */
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    /**
     * 🚀 Main Method (Execution starts here)
     */
    public static void main(String[] args) {

        // 🔹 Test Case 1
        int[] arr1 = {1, 2, 3, 4};
        int start1 = 2;
        int end1 = 3;

        System.out.println("Original Array 1:");
        printArray(arr1);

        reverseSubarray(arr1, start1, end1);

        System.out.println("After Reversing [" + start1 + ", " + end1 + "]:");
        printArray(arr1);

        // 🔹 Test Case 2
        int[] arr2 = {2, 5, 6};
        int start2 = 0;
        int end2 = 2;

        System.out.println("\nOriginal Array 2:");
        printArray(arr2);

        reverseSubarray(arr2, start2, end2);

        System.out.println("After Reversing [" + start2 + ", " + end2 + "]:");
        printArray(arr2);
    }
}