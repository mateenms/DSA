package com.ms.prefixsum;

public class PrefixSum {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        printArray(arr);

        int[] prefixSum = new int[n];

        System.out.println();
        for (int i = 0; i < n; i++) {
            if (i == 0)
                prefixSum[0] = arr[0];
            else
                prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        printArray(prefixSum);

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
