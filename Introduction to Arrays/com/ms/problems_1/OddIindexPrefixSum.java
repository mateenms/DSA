package com.ms.problems_1;

import java.util.Arrays;

public class OddIindexPrefixSum {

    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4, 5};

        int[][] B = {
                {0, 2},
                {1, 4}
        };

        int[] result = oddIndexPrefixSum(A, B);

        System.out.println(Arrays.toString(result));
    }

    private static int[] oddIndexPrefixSum(int[] A, int[][] B) {


        int n = A.length;
        int q = B.length;

        // build OddPrefix Array

        int[] OddPrefix = buildOddPrefixArray(A, n);

        // Answer Q Queries

        return ansQueries(B, q, OddPrefix);

    }

    private static int[] ansQueries(int[][] B, int q, int[] OddPrefix) {
        int[] result = new int[q];

        for (int i = 0; i < q; i++) {
            int left = B[i][0];
            int right = B[i][1];

            if (left == 0)
                result[i] = OddPrefix[right];
            else
                result[i] = OddPrefix[right] - OddPrefix[left - 1];
        }
        return result;
    }

    private static int[] buildOddPrefixArray(int[] A, int n) {
        int[] OddPF = new int[n];

        OddPF[0] = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                OddPF[i] = OddPF[i - 1] + A[i];
            } else {
                OddPF[i] = OddPF[i - 1];
            }
        }
        return OddPF;
    }
}
