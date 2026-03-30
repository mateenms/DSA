import java.util.Arrays;
import java.util.List;

/**
 * Counts how many elements in a list are NOT equal to the maximum value.
 */
public class CountsElements {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 3, 4);

        int result = countNonMaxElements(list);

        System.out.println("Number of elements that are NOT the maximum: " + result);
    }

    /**
     * Returns the count of elements that are not equal to the maximum value in the list.
     *
     * @param list the list of integers
     * @return count of non-maximum elements
     */
    private static int countNonMaxElements(List<Integer> list) {

        int max = list.get(0);

        // Find the maximum element
        for (int value : list) {
            if (value > max) {
                max = value;
            }
        }

        // Count how many times the max appears
        int maxCount = 0;
        for (int value : list) {
            if (value == max) {
                maxCount++;
            }
        }

        // Elements not equal to max = total size - count of max
        return list.size() - maxCount;
    }
}