package com.ms.carryforward;

public class PairAG {

    public static void main(String[] args) {

        char[] arr = {'a', 'g', 'a', 'g', 'f', 'a', 'g'};
        int result = countAGPair(arr);
        System.out.println(result + " Pairs are preset ");

    }

    public static int countAGPair(char[] arr) {
        int ans = 0, count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 'g') {
                count++;
            }
            if (arr[i] == 'a') {
                ans = ans + count;
            }
        }
        return ans;
    }
}