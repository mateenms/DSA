package com.ms.prefixsum;

public class EquilibriumIndex {
    public static void main(String[] args) {

        int[] A = {-7, 1, 5, 2, -4, 3, 0};

        int result = findEquliIndex(A);
        System.out.println(result == 1 ? "Equillibrium Index" : " No Equli index");
    }

    private static int findEquliIndex(int[] A) {


        int equIndex = -1;

        // find PF Array

        for (int i = 1; i < A.length; i++) {
            A[i] = A[i - 1] + A[i];
        }

        // find left sum and right sum and their sum equal

        for (int i = 0; i < A.length; i++) {

            int leftSum = 0;
            int rightSum = 0;
            int n = A.length;
            if (i != 0) {
                leftSum = A[i - 1];
            }
            if (i != n - 1) {
                rightSum = A[n - 1] - A[i];
            }
            if (leftSum == rightSum) {
                equIndex = i;
                break;
            }
        }
        return equIndex;
    }
}
