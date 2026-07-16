package com.ms.carryforward;

public class LeadersInArray {
    public static void main(String[] args) {

        int[] arr = {15, -1, 7, 2, 5, 4, 2, 3};

        int result = countLeaders(arr);
        System.out.println(result);
    }

    public static int countLeaders(int[] arr) {
        int ans = 1;
        int n = arr.length;
        int max = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                ans++;
                max = arr[i];

            }
        }
        return ans;
    }
}
