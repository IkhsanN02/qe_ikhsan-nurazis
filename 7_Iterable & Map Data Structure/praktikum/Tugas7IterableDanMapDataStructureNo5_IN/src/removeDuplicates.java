/*
5. Given an array of sorted numbers, remove all duplicates from it. You should not use any extra space; after removing the duplicates in-place return the length of the subarray that has no duplicate in it.

    **Sample Test Case**
    Input: [2, 3, 3, 3, 6, 9, 9]
    Output: 4
    Explanation: The first four elements after removing the duplicates will be [2, 3, 6, 9].
    Sample Test Case
    Input: [2, 2, 2, 11]
    Output: 2
    Explanation: The first two elements after removing the duplicates will be [2, 11].
 */
import java.util.*;
public class removeDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 3, 3, 6, 9, 9};
        int[] arr2 = {2, 2, 2, 11};

        int len1 = removeDuplicates(arr1); // returns 4
        int len2 = removeDuplicates(arr2); // returns 2

        System.out.println(len1); // prints 4
        System.out.println(len2); // prints 2
    }

}
