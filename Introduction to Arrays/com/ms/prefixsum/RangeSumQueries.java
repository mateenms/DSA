package com.ms.prefixsum;

public class RangeSumQueries {
    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4, 5};
        int[][] B = {{1, 2}, {3, 4}};

        long[] res = rangSumQueries(A, B);
        printArray(res);

    }

    public static long[] rangeSum(int[] A, int[][] B) {

        int n = A.length;
        int m = B.length;

        long[] res = new long[m];
        long[] PF = new long[n];
        PF[0] = A[0];
        for (int i = 1; i < n; i++) {
            PF[i] = PF[i - 1] + A[i];
        }

        for (int i = 0; i < m; i++) {

            int s = B[i][0];
            int e = B[i][1];

            if (s == 0)
                res[i] = PF[e];
            else
                res[i] = PF[e] - PF[s - 1];
        }
        return res;
    }


    public static long[] rangSumQueries(int[] A, int[][] B) {
        long[] PF = new long[A.length];
        long[] result = new long[B.length];


        // create PF array

        for (int i = 1; i < A.length; i++) {
            PF[i] = PF[i - 1] + A[i];
        }

        // read Q queires

        for (int i = 0; i < B.length; i++) {
            int L = B[i][0];
            int R = B[i][1];

            if (L == 0) {
                result[i] = PF[R];
            } else {
                result[i] = PF[R] - PF[L - 1];
            }
        }
        return result;
    }

    public static void printArray(long[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
