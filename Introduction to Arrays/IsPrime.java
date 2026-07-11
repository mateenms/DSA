/*
* Given a number A. Return 1 if A is prime and return 0 if not.

Note :
The value of A can cross the range of Integer.


Problem Constraints

1 <= A <= 109


Input Format

The first argument is a single integer A.


Output Format

Return 1 if A is prime else return 0.


Example Input

Input 1:
A = 5
Input 2:

A = 10


Example Output

Output 1:
1
Output 2:

0


Example Explanation

Explanation 1:
5 is a prime number.
Explanation 2:

10 is not a prime number.
* */

public class IsPrime {
    public static void main(String[] args) {
        int N = 11;
        int result = solve(N);
        System.out.println(result==1? " Prime Number ": "Not prime Number");

    }

    public static int solve(int N) {
        if (countFactor(N) == 2)
            return 1;
        else
            return 0;
    }

    public static int countFactor(int N) {
        int count = 0;
        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                if (i == N / i)
                    count++;
                else
                    count = count + 2;
            }
        }
        return count;
    }
}