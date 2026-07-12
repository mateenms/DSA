import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4, 5, 6, 7};
        int B = 3;

        System.out.println("Original Array : " + Arrays.toString(A));

        int[] result = solve(A, B);

        System.out.println("Rotated Array  : " + Arrays.toString(result));
    }

    private static int[] solve(int[] A, int B) {

        int n = A.length;
        int k = B % n;
        reverse(A, 0, n - 1);
        reverse(A, 0, k - 1);
        reverse(A, k, n - 1);
        return A;
    }

    private static void reverse(int[] A, int start, int end) {
        while (start < end) {

            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            start++;
            end--;
        }
    }
}
