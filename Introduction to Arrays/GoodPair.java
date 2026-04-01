/**
 * Problem: Good Pair
 *
 * Given an array A and an integer B,
 * check if there exists a pair (i, j) such that:
 *  - i != j
 *  - A[i] + A[j] == B
 *
 * Return:
 *  - 1 if such a pair exists
 *  - 0 otherwise
 *
 * Approach 1: Brute Force (O(n^2))
 * Approach 2: Optimized using HashSet (O(n))
 */

import java.util.HashSet;
import java.util.Set;

public class GoodPair {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        int targetSum = 4;

        int result = hasGoodPairOptimized(numbers, targetSum);
        System.out.println(result == 1 ? "Good pair exists" : "No good pair found");    }

    /**
     * Brute Force Approach
     * Time Complexity: O(n^2)
     */
    public static int hasGoodPairBruteForce(int[] numbers, int targetSum) {
        int n = numbers.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numbers[i] + numbers[j] == targetSum) {
                    return 1;
                }
            }
        }
        return 0;
    }

    /**
     * Optimized Approach using HashSet
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public static int hasGoodPairOptimized(int[] numbers, int targetSum) {
        Set<Integer> seen = new HashSet<>();

        for (int num : numbers) {
            int complement = targetSum - num;

            if (seen.contains(complement)) {
                return 1;
            }

            seen.add(num);
        }

        return 0;
    }
}