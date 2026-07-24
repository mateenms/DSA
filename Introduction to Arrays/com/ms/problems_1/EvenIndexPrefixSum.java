package com.ms.problems_1;

import java.util.Arrays;

public class EvenIndexPrefixSum {
    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4, 5};

        int[][] B = {
                {0, 2},
                {1, 4}
        };

        int[] result = solve(A, B);

        System.out.println(Arrays.toString(result));
    }

    private static int[] solve(int[] A, int[][] B) {

        int n = A.length;
        int q = B.length;
        int[] result = new int[B.length];

        int[] evenPrefixSum = buildEvenPrefixSum(A, n);

        // Answer Q queries

        int[] ans = ansQqueries(B, evenPrefixSum);


        return ans;

    }

    private static int[] ansQqueries(int[][] B, int[] evenPrefixSum) {

        int[] result = new int[B.length];
        for (int i = 0; i < B.length; i++) {
            int left = B[i][0];
            int right = B[i][1];

            if (left == 0) {
                result[i] = evenPrefixSum[right];
            } else {
                result[i] = evenPrefixSum[right] - evenPrefixSum[left - 1];
            }

        }
        return result;
    }

    private static int[] buildEvenPrefixSum(int[] A, int n) {
        int[] EvenPrefix = new int[n];

        EvenPrefix[0] = A[0];

        // build Even Prefix Array
        for (int i = 1; i < n; i++) {

            // check even index
            if (i % 2 == 0) {
                EvenPrefix[i] = EvenPrefix[i - 1] + A[i];
            } else { // mean its odd index dont add it in PF
                EvenPrefix[i] = EvenPrefix[i - 1];
            }
        }
        return EvenPrefix;
    }
}
