/*
[Opsional / Nilai Tambah] Given an array of positive numbers and a positive number ‘k’, find the maximum sum of any contiguous subarray of size ‘k’.

    **Sample Test Case**
    Input: [2, 1, 5, 1, 3, 2], k=3
    Output: 9
    Explanation: Subarray with maximum sum is [5, 1, 3].

    **Sample Test Case**
    Input: [2, 3, 4, 1, 5], k=2
    Output: 7
    Explanation: Subarray with maximum sum is [3, 4].
    2, 1, 5, 1, 3, 2
 */
public class MaximumSumSubarray {
    public static int findMaxSumSubarray(int[] arr, int k) {
        int maxSum = 0;
        int windowSum = 0;
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd];
            if (windowEnd >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 5, 1, 3, 2};
        int k1 = 3;
        int result1 = findMaxSumSubarray(arr1, k1);
        System.out.println(result1); // Output: 9

        int[] arr2 = {2, 3, 4, 1, 5};
        int k2 = 2;
        int result2 = findMaxSumSubarray(arr2, k2);
        System.out.println(result2); // Output: 7
    }
}
