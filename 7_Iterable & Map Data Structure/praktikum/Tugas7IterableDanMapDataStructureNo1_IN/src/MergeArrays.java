/*
1. Buatlah sebuah program menggabungkan 2 array yang diberikan, dan jangan sampai terdapat nama yang sama di data yang sudah tergabung tadi.

    **Sample Test Cases**
    Input: ['kazuya', 'jin', 'lee'], ['kazuya', 'feng']
    Output: ['kazuya', 'jin', 'lee', 'feng']
    Input: ['lee', 'jin'], ['kazuya', 'panda']
    Output: ['lee', 'jin', 'kazuya', 'panda']
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MergeArrays {
    public static List<String> mergeArrays(List<String> arr1, List<String> arr2) {
        // gabungkan kedua array menjadi satu
        List<String> mergedArr = new ArrayList<>(arr1);
        mergedArr.addAll(arr2);

        // buat set kosong untuk menampung nama yang sudah ada
        Set<String> uniqueNames = new HashSet<>();

        // buat list kosong untuk menampung nama yang belum ada
        List<String> resultArr = new ArrayList<>();

        // lakukan iterasi pada setiap elemen array yang tergabung
        for (String name : mergedArr) {
            // jika nama belum ada di set, tambahkan ke set dan list hasil
            if (!uniqueNames.contains(name)) {
                uniqueNames.add(name);
                resultArr.add(name);
            }
        }

        // kembalikan hasil
        return resultArr;
    }

    public static void main(String[] args) {
        List<String> arr1 = new ArrayList<>();
        arr1.add("kazuya");
        arr1.add("jin");
        arr1.add("lee");

        List<String> arr2 = new ArrayList<>();
        arr2.add("kazuya");
        arr2.add("feng");

        List<String> mergedArr = mergeArrays(arr1, arr2);
        System.out.println(mergedArr); // output: [kazuya, jin, lee, feng]

        arr1 = new ArrayList<>();
        arr1.add("lee");
        arr1.add("jin");

        arr2 = new ArrayList<>();
        arr2.add("kazuya");
        arr2.add("panda");

        mergedArr = mergeArrays(arr1, arr2);
        System.out.println(mergedArr); // output: [lee, jin, kazuya, panda]
    }
}
