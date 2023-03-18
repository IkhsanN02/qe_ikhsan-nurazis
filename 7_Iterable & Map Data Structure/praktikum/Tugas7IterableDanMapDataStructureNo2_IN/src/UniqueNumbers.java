/*
2. Buat program sesuai dengan deskripsi di bawah. Input merupakan variable string berisi kumpulan angka. Output merupakan list / array berisi angka yang hanya muncul 1 kali pada input.

    **Sample Test Case**
    Input: “76523752”
    Output: [6, 3]
    Input: “1122”
    Output: []
 */

import java.util.ArrayList;
import java.util.List;

public class UniqueNumbers {
    public static List<Integer> getUniqueNumbers(String input) {
        // inisialisasi list untuk menyimpan angka yang hanya muncul satu kali
        List<Integer> uniqueNumbers = new ArrayList<>();

        // inisialisasi array untuk menyimpan jumlah kemunculan setiap angka
        int[] frequency = new int[10];

        // lakukan iterasi pada setiap karakter pada input
        for (int i = 0; i < input.length(); i++) {
            // tambahkan 1 pada frekuensi karakter yang muncul pada array
            int index = Character.getNumericValue(input.charAt(i));
            frequency[index]++;
        }

        // lakukan iterasi pada setiap angka dari 0 hingga 9
        for (int i = 0; i < 10; i++) {
            // jika angka tersebut hanya muncul satu kali, tambahkan ke list
            if (frequency[i] == 1) {
                uniqueNumbers.add(i);
            }
        }

        // kembalikan list angka unik
        return uniqueNumbers;
    }

    public static void main(String[] args) {
        String input = "76523752";
        List<Integer> uniqueNumbers = getUniqueNumbers(input);
        System.out.println(uniqueNumbers); // output: [6, 3]

        input = "1122";
        uniqueNumbers = getUniqueNumbers(input);
        System.out.println(uniqueNumbers); // output: []
    }
}
