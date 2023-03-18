/*
4. Buatlah sebuah program **ArrayUnique** yang menerima 2 parameter berupa array angka. Output adalah program adalah satu array berupa kumpulan angka di array pertama tetapi tidak memiliki duplikasi di di array kedua.

    **Sample Test Case**
    input: [1, 2, 3, 4] dan [1, 3, 5, 10, 16]
    Output: [2, 4]
    input: [3, 8] dan [2, 8]
    Output: [3]
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.*;

public class ArrayUnique {
    public static int[] findUnique(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        // tambahkan semua angka dari nums2 ke dalam set
        for (int num : nums2) {
            set.add(num);
        }

        // cek setiap angka pada nums1, jika tidak ada di set, tambahkan ke dalam list
        for (int num : nums1) {
            if (!set.contains(num)) {
                list.add(num);
            }
        }

        // konversi list ke dalam array
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {1, 3, 5, 10, 16};
        int[] result = findUnique(nums1, nums2);
        System.out.println(Arrays.toString(result)); // output: [2, 4]

        nums1 = new int[]{3, 8};
        nums2 = new int[]{2, 8};
        result = findUnique(nums1, nums2);
        System.out.println(Arrays.toString(result)); // output: [3]
    }
}
