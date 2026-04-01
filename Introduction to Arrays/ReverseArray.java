import java.util.ArrayList;
import java.util.List;

/**
 * Problem: Reverse the Array
 *
 * Description:
 * Given a read-only array (List) of integers, return a new array
 * that contains the elements in reverse order.
 *
 * Constraints:
 * 1 <= A.size() <= 10000
 * 1 <= A[i] <= 10000
 *
 * Example:
 * Input:  [1, 2, 3, 2, 1]
 * Output: [1, 2, 3, 2, 1]
 *
 * Input:  [1, 1, 10]
 * Output: [10, 1, 1]
 *
 * Approach 1: Two Pointer (Start & End) with Swapping
 * - Create a copy of the input (since original is read-only)
 * - Swap elements from both ends moving toward center
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

public class ReverseArray {

    public static void main(String[] args) {
        List<Integer> input = List.of(1, 2, 3, 4, 5);

        System.out.println("original  Array: " + input);

        ArrayList<Integer> reversed = reverseUsingTwoPointers(input);

        System.out.println("Reversed Array: " + reversed);
    }

    /**
     * Reverses array using two-pointer approach
     *
     * @param input Read-only list of integers
     * @return New ArrayList with reversed elements
     */
    public static ArrayList<Integer> reverseUsingTwoPointers(final List<Integer> input) {

        // Create a mutable copy of input (since input is read-only)
        ArrayList<Integer> result = new ArrayList<>(input);

        int start = 0;
        int end = result.size() - 1;

        // Swap elements from both ends
        while (start < end) {

            // Store start element temporarily
            int temp = result.get(start);

            // Swap start with end
            result.set(start, result.get(end));
            result.set(end, temp);

            // Move pointers
            start++;
            end--;
        }

        return result;
    }

    /**
     * Alternative Approach: Reverse using loop
     *
     * @param input Read-only list
     * @return Reversed list
     */
    public static ArrayList<Integer> reverseUsingLoop(final List<Integer> input) {

        ArrayList<Integer> result = new ArrayList<>();

        // Traverse from end to beginning
        for (int i = input.size() - 1; i >= 0; i--) {
            result.add(input.get(i));
        }

        return result;
    }
}