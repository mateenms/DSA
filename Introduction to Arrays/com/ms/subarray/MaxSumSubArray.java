package com.ms.subarray;

//You are given an integer array C of size A. Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum.
//But the sum must not exceed B.
public class MaxSumSubArray {
    public static void main(String[] args) {
        int A = 5;
        int B = 12;
        int[] numbers = {2, 1, 3, 4, 5};
        int result = maxSumSubArr(A, B, numbers);
        System.out.println(result);


    }

    private static int maxSumSubArr(int A, int B, int[] numbers) {

        int n = numbers.length;
        int maxSum = 0;
        for (int s = 0; s < n; s++) {

            int sum = 0;
            for (int e = s; e < n; e++) {
                sum += numbers[e];
                if (sum <= B) {
                    maxSum = Math.max(maxSum, sum);
                }
            }
        }
        return maxSum;
    }
}
