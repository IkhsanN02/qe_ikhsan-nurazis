Nama : Ikhsan Nurazis
Kelas : C - Quality Engineer
Materi : Iterable and Map Data Structure

Basic Data Structures
- Stack
- Queue
- Priority Queue
- Deque
- Set & Map
- Exercises

ITERABLE
java Collection Interface
merupakan bagian dari Java Collections Framework dan digunakan untuk merepresentasikan sebuah kumpulan objek sebagai satu kesatuan. Interface Collection adalah sebuah iterable interface, yang berarti bahwa ia mendefinisikan metode-metode untuk melakukan penelusuran terhadap elemen-elemen dalam kumpulan tersebut.
Interface Collection merupakan sebuah interface dasar dalam Java Collections Framework dan diperluas oleh interface-interface lain seperti List, Set, dan Queue. Interface ini menyediakan beberapa metode untuk menambah, menghapus, dan mengambil elemen dalam kumpulan, serta untuk memeriksa ukuran kumpulan dan melakukan iterasi terhadap elemen-elemennya.
Berikut beberapa contoh metode yang disediakan oleh interface Collection:
add(Object obj): menambahkan sebuah objek ke dalam kumpulan
remove(Object obj): menghapus sebuah objek dari kumpulan
contains(Object obj): memeriksa apakah kumpulan mengandung objek yang ditentukan
size(): mengembalikan jumlah elemen dalam kumpulan
iterator(): mengembalikan sebuah iterator yang digunakan untuk melakukan iterasi terhadap elemen-elemen dalam kumpulan


Iterable
Iterable adalah sebuah interface dalam bahasa pemrograman Java yang digunakan untuk melakukan iterasi (penelusuran) terhadap elemen-elemen dalam sebuah koleksi data, seperti array, list, set, map, dan sebagainya.
Interface Iterable menyediakan satu buah metode yang harus diimplementasikan oleh kelas-kelas yang ingin mengizinkan objek-objek mereka untuk diiterasi menggunakan pernyataan for-each pada bahasa Java. Metode tersebut adalah:
iterator(): mengembalikan sebuah objek iterator yang dapat digunakan untuk melakukan iterasi terhadap elemen-elemen dalam koleksi.
Objek iterator yang dihasilkan oleh metode iterator() akan memungkinkan kita untuk mengakses elemen-elemen dalam koleksi data secara sekuensial satu per satu. Kita dapat menggunakan metode-metode seperti hasNext() untuk memeriksa apakah masih ada elemen dalam koleksi yang dapat diakses, dan next() untuk mengambil elemen selanjutnya dalam koleksi.

Collection
Collection dalam bahasa pemrograman Java adalah sebuah antarmuka (interface) yang digunakan untuk merepresentasikan kumpulan objek sebagai satu kesatuan. Kumpulan objek yang dimaksud dapat berupa list, set, queue, atau struktur data lainnya.
Interface Collection merupakan bagian dari Java Collections Framework dan menyediakan sejumlah metode untuk melakukan manipulasi terhadap elemen-elemen dalam kumpulan objek, seperti menambahkan objek ke dalam kumpulan, menghapus objek dari kumpulan, atau mengambil elemen dari kumpulan.

Method Collection 
Method Collection dalam bahasa pemrograman Java adalah kumpulan metode yang terdapat pada interface Collection. Method-method ini digunakan untuk melakukan operasi dan manipulasi terhadap kumpulan objek dalam Java Collections Framework.
Beberapa method yang tersedia pada interface Collection antara lain:
add(Object obj): Menambahkan sebuah objek ke dalam kumpulan.
addAll(Collection c): Menambahkan semua elemen dari kumpulan lain ke dalam kumpulan saat ini.
remove(Object obj): Menghapus sebuah objek dari kumpulan.
removeAll(Collection c): Menghapus semua elemen dari kumpulan yang ada dalam kumpulan lain.
retainAll(Collection c): Menjaga hanya elemen-elemen yang ada dalam kumpulan saat ini dan kumpulan lain.
contains(Object obj): Memeriksa apakah kumpulan mengandung objek yang ditentukan.
containsAll(Collection c): Memeriksa apakah kumpulan mengandung semua elemen dalam kumpulan lain.
size(): Mengembalikan jumlah elemen dalam kumpulan.
isEmpty(): Memeriksa apakah kumpulan kosong.
iterator(): Mengembalikan sebuah iterator yang digunakan untuk melakukan iterasi terhadap elemen-elemen dalam kumpulan.
Selain method-method dasar di atas, terdapat juga beberapa method yang bersifat matematika pada kumpulan objek, seperti union, intersection, dan difference.
Java Collections Framework menyediakan banyak method untuk mengelola kumpulan objek dengan cara yang efisien dan mudah dipahami. Oleh karena itu, dengan memahami method-method yang ada dalam interface Collection, kita dapat dengan mudah melakukan operasi dan manipulasi terhadap kumpulan objek dalam bahasa Java.


List dalam bahasa pemrograman Java adalah salah satu jenis kumpulan objek yang terdapat dalam Java Collections Framework. List memungkinkan kita untuk menyimpan objek dalam urutan tertentu (ordered) dan dapat diakses dengan indeks, sehingga memungkinkan pengaksesan elemen secara langsung menggunakan indeks.

Method List:
Beberapa method yang tersedia pada interface List antara lain:

- add(int index, E element): Menambahkan objek ke dalam list pada posisi tertentu.
- remove(int index): Menghapus objek dari list pada posisi tertentu.
- get(int index): Mengambil objek dari list pada posisi tertentu.
- set(int index, E element): Mengubah objek pada posisi tertentu dengan objek yang baru.
- indexOf(Object o): Mengembalikan indeks dari objek yang sama dengan objek yang diberikan.
- subList(int fromIndex, int toIndex): Mengembalikan list baru yang terdiri dari elemen-elemen pada range indeks tertentu.

Implementasi List:
Ada beberapa implementasi List dalam Java, antara lain:
1. ArrayList
ArrayList adalah implementasi dari interface List yang menggunakan array sebagai struktur datanya. ArrayList cocok digunakan jika kita membutuhkan akses yang cepat ke elemen-elemen list dan penggunaan memori yang efisien. Keuntungan dari ArrayList adalah pengaksesan elemen secara langsung menggunakan indeks yang membuatnya lebih cepat daripada LinkedList.
2. LinkedList
LinkedList adalah implementasi dari interface List yang menggunakan linked list sebagai struktur datanya. Keuntungan dari LinkedList adalah kemampuannya untuk mengambil dan memasukkan elemen-elemen ke dalam list dengan cepat dan mudah, terutama untuk operasi-operasi di depan atau belakang list. LinkedList juga lebih efisien dalam memori ketika kita memerlukan penambahan atau penghapusan elemen di tengah list.
3. Immutable List
Immutable List adalah implementasi dari interface List yang tidak dapat diubah setelah dibuat. Immutable List cocok digunakan jika kita membutuhkan list yang tidak bisa diubah atau diganti elemen-elemennya setelah dibuat. Immutable List dapat membantu mempercepat performa aplikasi karena data tidak perlu dikopi setiap kali dilakukan manipulasi.
    ArrayList dan LinkedList adalah implementasi yang paling umum digunakan dalam Java. Pemilihan implementasi yang tepat tergantung pada kebutuhan aplikasi dan performa yang diinginkan.
    Dalam kesimpulan, List adalah salah satu jenis kumpulan objek yang memungkinkan kita untuk menyimpan dan mengakses objek dalam urutan tertentu. Java menyediakan beberapa implementasi List, antara lain ArrayList, LinkedList, dan Immutable List, serta beberapa method yang berguna untuk melakukan manipulasi terhadap elemen-elemen dalam list.


Set adalah salah satu jenis kumpulan objek dalam Java Collections Framework yang memperhatikan kemunculan unik dari setiap elemen, artinya set tidak mengizinkan duplikasi elemen. Set juga tidak memperhatikan urutan penyimpanan elemen.
Implementasi Set:
Beberapa implementasi Set yang tersedia dalam Java Collections Framework antara lain:
1. HashSet
HashSet adalah implementasi Set yang menggunakan hash table sebagai struktur penyimpanannya. HashSet mengizinkan elemen-elemen null dan memperbolehkan pengaksesan elemen secara acak (random access). HashSet adalah implementasi Set yang paling efisien secara performa karena menggunakan hash table, namun tidak menjaga urutan penyimpanan elemen.
2. LinkedHashSet
LinkedHashSet adalah implementasi Set yang menggunakan linked list dan hash table sebagai struktur penyimpanannya. LinkedHashSet mempertahankan urutan penyimpanan elemen dan cocok digunakan jika kita memerlukan pengaksesan elemen secara berurutan dengan performa yang cepat.
3. Immutable Set
Immutable Set adalah implementasi Set yang tidak dapat diubah setelah dibuat. Immutable Set cocok digunakan jika kita membutuhkan Set yang tidak bisa diubah atau diganti elemen-elemennya setelah dibuat. Immutable Set dapat membantu mempercepat performa aplikasi karena data tidak perlu dikopi setiap kali dilakukan manipulasi.
Hash Set dan LinkedHashSet adalah implementasi Set yang paling umum digunakan dalam Java. Pemilihan implementasi yang tepat tergantung pada kebutuhan aplikasi dan performa yang diinginkan.
Dalam kesimpulan, Set adalah salah satu jenis kumpulan objek dalam Java Collections Framework yang tidak mengizinkan duplikasi elemen dan tidak memperhatikan urutan penyimpanan. Java menyediakan beberapa implementasi Set, antara lain HashSet, LinkedHashSet, dan Immutable Set. Set berguna untuk mengelola kumpulan objek yang unik dan memungkinkan aplikasi untuk melakukan operasi-operasi yang efisien pada kumpulan objek tersebut.


SortedSet adalah sebuah subinterface dari interface Set pada Java Collections Framework yang memperbolehkan elemen-elemennya tersusun dalam urutan tertentu (ordered) yang didefinisikan oleh sebuah Comparator atau secara natural (natural ordering). Setiap elemen pada SortedSet memiliki nilai yang lebih kecil atau lebih besar dari elemen sebelum atau sesudahnya.

Method pada SortedSet antara lain:
1. Comparator comparator() - Mengembalikan Comparator yang digunakan untuk mengurutkan elemen dalam SortedSet, atau null jika SortedSet diurutkan secara natural.
2. Object first() - Mengembalikan elemen pertama pada SortedSet.
3. Object last() - Mengembalikan elemen terakhir pada SortedSet.
4. SortedSet headSet(Object toElement) - Mengembalikan SortedSet yang berisi semua elemen dari awal sampai elemen sebelum toElement.
5. SortedSet tailSet(Object fromElement) - Mengembalikan SortedSet yang berisi semua elemen dari elemen fromElement hingga akhir SortedSet.
Implementasi SortedSet:
Java menyediakan beberapa implementasi untuk SortedSet, salah satunya adalah TreeSet.

TreeSet :
TreeSet adalah implementasi SortedSet yang menggunakan struktur data pohon untuk menyimpan elemen-elemennya. TreeSet mempertahankan elemen-elemennya dalam urutan terurut dan cepat dalam melakukan operasi-operasi seperti insertion, deletion, dan search pada setiap elemen. TreeSet juga menyediakan beberapa metode tambahan yang memudahkan dalam operasi pencarian dan pengambilan elemen.

NavigableSet:
NavigableSet adalah subinterface dari SortedSet yang memperbolehkan aplikasi untuk melakukan navigasi pada kumpulan elemen yang diurutkan. NavigableSet menambahkan beberapa metode tambahan seperti lower, floor, ceiling, dan higher yang memperbolehkan pengambilan elemen berdasarkan nilai tertentu. Implementasi utama dari NavigableSet adalah TreeSet.


Queue adalah salah satu jenis kumpulan objek dalam Java Collections Framework yang biasanya digunakan untuk menyimpan elemen-elemen dalam antrian atau antrean. Antrian pada Queue memperhatikan prinsip "first-in, first-out" (FIFO) yang artinya elemen pertama yang dimasukkan ke dalam antrian akan menjadi elemen pertama yang diambil atau dihapus dari antrian.

SortedSet pada Queue:
SortedSet tidak secara khusus terkait dengan Queue karena SortedSet adalah subinterface dari Set dan fokus pada pengurutan dan kesamaan elemen. Namun, Queue memiliki bentuk khusus dari SortedSet yang disebut PriorityQueue yang mengimplementasikan Queue dan SortedSet.

Implementasi Queue:
Java menyediakan beberapa implementasi Queue, diantaranya adalah:
1. LinkedList
LinkedList adalah implementasi Queue yang menggunakan linked list sebagai struktur penyimpanannya. LinkedList memperbolehkan operasi penambahan dan penghapusan elemen di depan dan belakang antrian secara efisien.
2. PriorityQueue
PriorityQueue adalah implementasi Queue yang menggunakan heap (himpunan terurut) sebagai struktur penyimpanannya. Setiap elemen pada PriorityQueue memiliki prioritas tertentu yang menentukan posisinya dalam antrian. Element dengan prioritas yang lebih tinggi akan diambil terlebih dahulu dari antrian.
Pemilihan implementasi yang tepat tergantung pada kebutuhan aplikasi dan performa yang diinginkan. Jika kita perlu menambahkan atau menghapus elemen di posisi tertentu secara cepat, maka LinkedList adalah pilihan yang tepat. Sedangkan, jika kita perlu antrian dengan elemen yang diurutkan berdasarkan prioritas tertentu, maka PriorityQueue adalah pilihan yang tepat.


Deque adalah sebuah antarmuka (interface) dalam Java Collections Framework yang merepresentasikan struktur data antrian dwi arah atau double-ended queue. Deque memperbolehkan penambahan dan penghapusan elemen pada kedua ujung antrian. Selain itu, Deque juga mendukung operasi-operasi dasar seperti pengambilan elemen dari ujung antrian dan penambahan elemen ke ujung antrian.

Method pada Deque antara lain:
1. addFirst(E e) - Menambahkan elemen ke bagian depan Deque.
2. addLast(E e) - Menambahkan elemen ke bagian belakang Deque.
3. offerFirst(E e) - Menambahkan elemen ke bagian depan Deque dan mengembalikan true jika operasi berhasil.
4. offerLast(E e) - Menambahkan elemen ke bagian belakang Deque dan mengembalikan true jika operasi berhasil.
5. removeFirst() - Menghapus dan mengembalikan elemen dari bagian depan Deque.
6. removeLast() - Menghapus dan mengembalikan elemen dari bagian belakang Deque.
7. pollFirst() - Menghapus dan mengembalikan elemen dari bagian depan Deque, atau mengembalikan null jika Deque kosong.
8. pollLast() - Menghapus dan mengembalikan elemen dari bagian belakang Deque, atau mengembalikan null jika Deque kosong.
9. getFirst() - Mengembalikan elemen dari bagian depan Deque, atau menyebabkan NoSuchElementException jika Deque kosong.
10. getLast() - Mengembalikan elemen dari bagian belakang Deque, atau menyebabkan NoSuchElementException jika Deque kosong.

Implementasi Deque:
Java menyediakan beberapa implementasi Deque, antara lain:
1. LinkedList
LinkedList adalah implementasi Deque yang menggunakan struktur linked list sebagai penyimpanan elemen-elemennya. LinkedList memperbolehkan operasi penambahan dan penghapusan elemen di depan dan belakang Deque secara efisien.
2. ArrayDeque
ArrayDeque adalah implementasi Deque yang menggunakan struktur array sebagai penyimpanan elemen-elemennya. ArrayDeque memiliki performa yang lebih baik daripada LinkedList pada operasi-operasi random access atau akses acak, tetapi performanya sedikit lebih buruk pada operasi-operasi penambahan atau penghapusan di tengah-tengah Deque.


Stack adalah struktur data yang memungkinkan penambahan elemen dan penghapusan elemen hanya pada satu ujung (pada tumpukan atas), sehingga elemen yang terakhir dimasukkan adalah elemen pertama yang dihapus (last-in, first-out / LIFO).

Di Java, Stack merupakan kelas yang termasuk dalam java.util dan mewarisi kelas Vector. Sehingga, Stack memiliki semua metode dari Vector dan ditambah dengan metode-metode khusus yang mendukung operasi push (menambahkan elemen pada tumpukan), pop (menghapus elemen dari tumpukan), peek (melihat elemen teratas pada tumpukan tanpa menghapusnya), dan search (mencari elemen pada tumpukan).

Beberapa method yang umum digunakan pada Stack di Java antara lain:

push(Object obj) - Menambahkan elemen ke dalam Stack pada ujung atas.

pop() - Menghapus elemen pada ujung atas Stack dan mengembalikan elemen tersebut.

peek() - Melihat elemen teratas pada Stack tanpa menghapusnya.

search(Object obj) - Mencari objek pada Stack dan mengembalikan jarak dari objek tersebut ke ujung atas Stack. Jika objek tidak ditemukan, akan mengembalikan nilai -1.

Implementasi Stack di Java menggunakan ArrayDeque atau LinkedList. Namun, disarankan untuk menggunakan ArrayDeque karena memiliki performa yang lebih baik daripada LinkedList.


Map adalah struktur data yang memungkinkan kita untuk menyimpan data dalam bentuk key-value pairs, dimana setiap key memiliki nilai yang terkait dengan itu. Dalam Java, Map adalah sebuah interface yang terletak di package java.util dan memungkinkan kita untuk memetakan keys ke values.

Beberapa method yang umum digunakan pada Map di Java antara lain:

1. put(Object key, Object value) - Menambahkan key-value pairs ke Map.
2. get(Object key) - Mengembalikan nilai (value) dari key yang diberikan.
3. remove(Object key) - Menghapus key dan value yang terkait dari Map.
4. keySet() - Mengembalikan Set dari keys yang ada di Map.
5. values() - Mengembalikan Collection dari values yang ada di Map.
6. entrySet() - Mengembalikan Set dari key-value pairs (Map.Entry) yang ada di Map.

Implementasi Map di Java meliputi:
1. HashMap - Implementasi Map yang paling umum digunakan di Java. Ini menggunakan hash table untuk menyimpan key-value pairs. Ini memungkinkan akses cepat ke elemen dan mempertahankan urutan tidak teratur.
2. WeakHashMap - Sebuah implementasi Map yang memungkinkan garbage collector untuk menghapus elemen yang tidak terpakai.
3. IdentityHashMap - Implementasi Map yang menggunakan operator == untuk membandingkan key, bukan equals() method.
4. LinkedHashMap - Implementasi Map yang mempertahankan urutan insertasi key-value pairs.
5. ImmutableMap - Implementasi Map yang tidak dapat diubah setelah pembuatannya, sehingga aman digunakan di thread yang berbeda secara bersamaan.
Dalam menggunakan Map, kita harus memilih implementasi Map yang tepat berdasarkan kebutuhan kita, seperti akses cepat ke elemen, urutan yang terjaga, dan sebagainya.


SortedMap adalah sub-interface dari Map di Java yang mempertahankan urutan dari key-value pairs berdasarkan urutan alami (natural ordering) atau berdasarkan implementasi dari Comparator yang di definisikan. Dalam SortedMap, keys diurutkan dalam urutan menaik (ascending order).

Beberapa method yang umum digunakan pada SortedMap di Java antara lain:
1. firstKey() - Mengembalikan key pertama (yang terkecil) pada SortedMap.
2. lastKey() - Mengembalikan key terakhir (yang terbesar) pada SortedMap.
3. headMap(K toKey) - Mengembalikan SortedMap dengan keys yang lebih kecil dari toKey.
4. tailMap(K fromKey) - Mengembalikan SortedMap dengan keys yang lebih besar dari fromKey.
5. subMap(K fromKey, K toKey) - Mengembalikan SortedMap dengan keys yang terletak di antara fromKey dan toKey.

Implementasi SortedMap di Java meliputi:
1. TreeMap - Implementasi paling umum dari SortedMap. Ini menggunakan struktur data red-black tree untuk mempertahankan urutan key-value pairs.
Dalam TreeMap, keys harus implement interface Comparable atau kita harus menyediakan sebuah Comparator untuk membandingkan keys. TreeMap mempertahankan urutan key-value pairs berdasarkan urutan keys dalam struktur data red-black tree.
Dalam menggunakan SortedMap, kita harus memastikan bahwa keys sudah diurutkan dan memilih implementasi SortedMap yang tepat berdasarkan kebutuhan kita, seperti mempertahankan urutan keys yang sudah didefinisikan, mengurutkan keys secara alami, dan sebagainya.


NavigableMap adalah sub-interface dari SortedMap di Java yang menyediakan navigasi maju (forward) dan mundur (backward) dalam urutan key-value pairs. Ini menyediakan beberapa method yang berguna untuk mencari dan mengambil entries di dalam map.

Beberapa method yang umum digunakan pada NavigableMap di Java antara lain:
1. ceilingEntry(K key) - Mengembalikan entry dengan key terkecil yang lebih besar atau sama dengan key yang diberikan.
2. higherEntry(K key) - Mengembalikan entry dengan key terkecil yang lebih besar dari key yang diberikan.
3. floorEntry(K key) - Mengembalikan entry dengan key terbesar yang lebih kecil atau sama dengan key yang diberikan.
4. lowerEntry(K key) - Mengembalikan entry dengan key terbesar yang lebih kecil dari key yang diberikan.
5. descendingMap() - Mengembalikan NavigableMap yang menampilkan urutan key-value pairs secara terbalik (descending order).

Implementasi NavigableMap di Java meliputi:
1. TreeMap - Implementasi SortedMap paling umum yang juga mendukung navigasi maju dan mundur.
NavigableMap sangat berguna ketika kita memerlukan kemampuan untuk mencari atau mengambil entries yang berada sebelum atau sesudah key yang diberikan, atau jika kita ingin menampilkan urutan key-value pairs secara terbalik. Namun, penggunaan NavigableMap harus disesuaikan dengan kebutuhan kita karena struktur data ini mungkin tidak efisien untuk beberapa kasus penggunaan.


Sorting adalah proses mengurutkan data dalam suatu struktur data berdasarkan suatu kriteria tertentu, seperti ascending (menaik) atau descending (menurun). Di dalam bahasa pemrograman Java, terdapat beberapa method untuk melakukan sorting pada sebuah list.

Method sorting yang paling umum adalah menggunakan method sort() yang terdapat di dalam kelas Collections. Method ini dapat menerima sebuah list dan sebuah Comparator (opsional) sebagai parameter. Jika Comparator tidak diberikan, elemen akan diurutkan secara natural.
