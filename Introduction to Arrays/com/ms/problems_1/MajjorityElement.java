package com.ms.problems_1;

public class MajjorityElement {

    public static void main(String[] args) {


        int[] numbers = {2, 1, 2, 3, 2, 1, 2, 2, 2, 1, 2, 2, 3};


        int candidate = findCandidate(numbers);
        System.out.println("Candidate is " + candidate);

        if (isMajority(numbers, candidate)) {
            System.out.println("Majority Element = " + candidate);
        } else {
            System.out.println("No Majority Element");
        }

    }

    private static boolean isMajority(int[] numbers, int candidate) {

        int freq = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == candidate) {
                freq++;
            }
        }

        return freq > numbers.length / 2;
    }

    private static int findCandidate(int[] numbers) {

        int candidate = numbers[0];
        int count = 1;

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] == candidate)
                count++;
            else
                count--;

            if (count == 0) {
                candidate = numbers[i];
                count = 1;
            }
        }
        return candidate;
    }
}
