package com.ms.problems_1;

public class SpecialIndex {
    public static void main(String[] args) {
        int[] numbers = {4, 3, 2, 7, 6, -2};
        int count = isSpecialIndex(numbers);
        if (count > 0) {
            System.out.println("Special Index found and count is " + count);
        } else {
            System.out.println("Special Index not found");
        }
    }

    private static int isSpecialIndex(int[] numbers) {

        // create Even and Odd Prefix Array

        int n = numbers.length;
        int[] PFEven = new int[n];

        PFEven[0] = numbers[0];

        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                PFEven[i] = PFEven[i - 1] + numbers[i];
            } else {
                PFEven[i] = PFEven[i - 1];
            }
        }
        int[] PFOdd = new int[n];

        PFOdd[0] = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                PFOdd[i] = PFOdd[i - 1] + numbers[i];
            } else {
                PFOdd[i] = PFOdd[i - 1];
            }
        }


        // check special index

        int count = 0;
        for (int i = 0; i < n; i++) {
            int X;
            int Y;
            if (i == 0) {
                X = 0;
                Y = 0;
            } else {
                X = PFOdd[i - 1];
                Y = PFEven[i - 1];
            }
            int Z = PFOdd[n - 1] - PFOdd[i];
            int W = PFEven[n - 1] - PFEven[i];

            if ((X + W) == (Z + Y)) {
                count++;
            }
        }
        return count;
    }
}
