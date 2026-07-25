package com.ms.carryforward;

public class ClosestMinMaxElementArray {

    public static void main(String[] args) {

        int[] arr = {15, 7, 2, -1, 4, 2, 3};

        int result = minMaxLen(arr);
        System.out.println(result);
    }

    private static int minMaxLen(int[] arr) {


        int n = arr.length;

        int maxI = -1, minI = -1;


        // find min max element
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }


        // iterate array

        int ans = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == min) {
                minI = i;
                if (maxI != -1) {
                    ans = Math.min(ans, maxI - i + 1);
                }
            } else if (arr[i] == max) {
                maxI = i;
                if (minI != -1) {
                    ans = Math.min(ans, minI - i + 1);
                }
            }
        }

        return ans;
    }
}
