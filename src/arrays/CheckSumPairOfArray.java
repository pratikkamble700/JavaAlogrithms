package arrays;


import java.util.HashSet;

/***
 *
 * Input: arr[] = {0, -1, 2, -3, 1}
 *         sum = -2
 * Output: -3, 1
 * If we calculate the sum of the output,
 * 1 + (-3) = -2
 *
 * Input: arr[] = {1, -2, 1, 0, 5}
 *        sum = 0
 * Output: -1
 * No valid pair exists.
 */
public class CheckSumPairOfArray {

    static void printpairs(int arr[], int sum)
    {
        HashSet<Integer> s = new HashSet<Integer>();// not allowed duplicates
        for (int i = 0; i < arr.length; ++i)
        {
            int temp = sum - arr[i];

            // checking for condition
            if (s.contains(temp)) {
                System.out.println("Pair with given sum "
                                + sum + " is (" + arr[i]
                                + ", " + temp + ")");
            }
            s.add(arr[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("");
        int A[] = { 1, 8, 45, 6, 10, 8 };
        int n = 16;
        printpairs(A, n);
    }
}
