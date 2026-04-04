public class MaxMinElementInArray {

    /*
     * ============================================================
     * 🧠 PROBLEM THEORY (INSIDE CODE)
     * ============================================================
     *
     * Given:
     * - An integer array A of size N
     *
     * Task:
     * - Find the SUM of:
     *      1. Maximum element
     *      2. Minimum element
     *
     * Example:
     * A = [-2, 1, -4, 5, 3]
     * Max = 5, Min = -4 → Sum = 1
     *
     * ------------------------------------------------------------
     * 💡 APPROACH
     * ------------------------------------------------------------
     * - Traverse the array once
     * - Keep track of:
     *      max → largest element seen so far
     *      min → smallest element seen so far
     *
     * - Update values while iterating
     *
     * ------------------------------------------------------------
     * ⚡ WHY THIS APPROACH?
     * ------------------------------------------------------------
     * - Single traversal → efficient
     * - No extra space required
     *
     * ------------------------------------------------------------
     * ⏱ COMPLEXITY
     * ------------------------------------------------------------
     * Time Complexity  : O(N)
     * Space Complexity : O(1)
     *
     * ============================================================
     */

    /**
     * Function to find sum of maximum and minimum element
     */
    public static int findMaxMinSum(int[] arr) {

        // ✅ Edge Case Handling
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null.");
            return 0;
        }

        // Step 1: Initialize max and min with first element
        int max = arr[0];
        int min = arr[0];

        // Step 2: Traverse array and update max & min
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                // else-if avoids extra comparison
                min = arr[i];
            }
        }

        // Step 3: Return sum of max and min
        return max + min;
    }

    /**
     * Utility function to print array
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
        int[] arr1 = {-2, 1, -4, 5, 3};

        System.out.println("Array 1:");
        printArray(arr1);

        int result1 = findMaxMinSum(arr1);
        System.out.println("Sum of Max + Min: " + result1);

        // 🔹 Test Case 2
        int[] arr2 = {1, 3, 4, 1};

        System.out.println("\nArray 2:");
        printArray(arr2);

        int result2 = findMaxMinSum(arr2);
        System.out.println("Sum of Max + Min: " + result2);
    }
}