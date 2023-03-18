/*
3. Given an array of sorted numbers and a target sum, find a pair in the array whose sum is equal to the given target. Write a function to return the indices of the two numbers (i.e. the pair) such that they add up to the given target.

    **Challenges**:
    Solve with linear complexity O(n), **not** O(n^2) if you can!

    **Sample Test Cases**
    Input: [1, 2, 3, 4, 6], target=6
    Output: [1, 3]
    Explanation: The numbers at index 1 and 3 add up to 6: 2+4=6
    Input: [2, 5, 9, 11], target=11
    Output: [0, 2]
    Explanation: The numbers at index 0 and 2 add up to 11: 2+9=11
 */
import java.util.Arrays;

public class TwoSum {
    public static int[] findTwoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        // lakukan iterasi pada array dari kedua ujung, bergerak ke tengah
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                // jika jumlahnya sama dengan target, kembalikan indeks
                return new int[]{left, right};
            } else if (sum < target) {
                // jika jumlahnya lebih kecil dari target, pindahkan pointer kiri ke kanan
                left++;
            } else {
                // jika jumlahnya lebih besar dari target, pindahkan pointer kanan ke kiri
                right--;
            }
        }

        // jika tidak ada pasangan yang ditemukan, kembalikan array kosong
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 6};
        int target = 6;
        int[] result = findTwoSum(nums, target);
        System.out.println(Arrays.toString(result)); // output: [1, 3]

        nums = new int[]{2, 5, 9, 11};
        target = 11;
        result = findTwoSum(nums, target);
        System.out.println(Arrays.toString(result)); // output: [0, 2]
    }
}
