import java.util.ArrayList;

public class LinearSearchOccurrence {

    /*
     * ============================================================
     * 🧠 PROBLEM THEORY (INSIDE CODE)
     * ============================================================
     *
     * Given:
     * - An ArrayList A of integers
     * - An integer B (target element)
     *
     * Task:
     * - Count how many times B appears in A
     *
     * Example:
     * A = [1, 2, 2], B = 2 → Output = 2
     * A = [1, 2, 1], B = 3 → Output = 0
     *
     * ------------------------------------------------------------
     * 💡 APPROACH (Linear Search)
     * ------------------------------------------------------------
     * - Traverse each element in the array
     * - Compare it with B
     * - If equal → increment count
     *
     * ------------------------------------------------------------
     * ⚡ WHY THIS APPROACH?
     * ------------------------------------------------------------
     * - Simple and direct
     * - Works for unsorted arrays
     *
     * ------------------------------------------------------------
     * ⏱ COMPLEXITY
     * ------------------------------------------------------------
     * Time Complexity  : O(N)
     * Space Complexity : O(1)
     *
     * ============================================================
     */

    /**
     * Function to count occurrences of B in ArrayList A
     */
    public static int countOccurrences(ArrayList<Integer> list, int target) {

        // ✅ Edge Case Handling
        if (list == null || list.size() == 0) {
            System.out.println("List is empty or null.");
            return 0;
        }

        int count = 0;

        // 🔁 Traverse the list
        for (Integer num : list) {
            if (num == target) {
                count++; // Increment count if match found
            }
        }

        return count;
    }

    /**
     * 🚀 Main Method (Execution starts here)
     */
    public static void main(String[] args) {

        // 🔹 Test Case 1
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(2);

        int target1 = 2;

        System.out.println("ArrayList 1: " + list1);
        int result1 = countOccurrences(list1, target1);
        System.out.println("Occurrences of " + target1 + " = " + result1);

        // 🔹 Test Case 2
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(1);

        int target2 = 3;

        System.out.println("\nArrayList 2: " + list2);
        int result2 = countOccurrences(list2, target2);
        System.out.println("Occurrences of " + target2 + " = " + result2);
    }
}