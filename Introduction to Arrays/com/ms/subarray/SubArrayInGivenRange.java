package com.ms.subarray;

import java.util.ArrayList;
import java.util.List;

public class SubArrayInGivenRange {
    public static void main(String[] args) {


        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int B = 2, C = 5;

        // return sub array with give rang

        int[] result = subArrayGivenRange(numbers, B, C);

        for (Integer i : result) {
            System.out.print("Sub array " +i+" ");
        }

    }

    private static int[] subArrayGivenRange(int[] numbers, int b, int c) {

        List<Integer> list = new ArrayList<>();

        int n = numbers.length;

        for (int i = b; i <= c; i++) {
            list.add(numbers[i]);
        }
        int[] result = new int[list.size()];
        int k = 0;
        for (Integer i : list) {
            result[k] = i;
            k++;
        }
        return result;
    }
}
