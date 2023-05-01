Nama : Ikhsan Nurazis
Kelas : C - Quality Engineer

Materi - Fundamental Performance Testing

Pengertian Peformance Testing : teknik non functional testing untuk menentukan parameter sistem dalam hal responsif dan stabilitas dibawah bebagai beban kerja
performance testing mengukur kualitas atribut dari sistem seperti stabilitas, ketahanan dan pengguna sumber daya.

pengukuran dari performace test
performa suatu aplikasi sampai suatu batas tertentu
bukan merupakan functional-test
bisa dalam berbagai macam bentuk untuk memahami relibilty, stability dan availability pada environtment-nya

performance test jarang dilakukan
- test yang cukup mahal untuk dipalikasikan dan dijalankan, namun dapat dijadikan tolak ukur apakah sistem tersebut dapat mengakomodasi traffic yang ada
- pengetesan memerlukan persiapan dimana beberapa kasus harus membuat environment terpisah dari production agar tidak tercampurnya data test dengan data production
- environment ada yang membuatnya di server cloud yang biayanya bisa lebih besar dari environment production

hal yang diperhatikan dari performance test adalah throughput dan response data

metode peformance test
test plan
yang dibutuhkan seperti endpoint yang akan dites, kebutuhan masing-masing endpoint

tipe dari performance test
1. Smoke Testing : jenis pengujian yang dilakukan untuk memastikan bahwa aplikasi atau sistem dikonfigurasikan dengan benar dan berfungsi dengan baik setelah perubahan kecil atau pembaruan. Tes asap biasanya dilakukan di awal proses pengujian sehingga masalah besar dapat diketahui lebih awal.

2. Load Testing : jenis pengujian yang membuat aplikasi atau sistem mengalami tekanan tinggi untuk mengevaluasi kinerjanya dalam kondisi penggunaan normal atau maksimum. Tujuannya adalah untuk mengetahui apakah aplikasi atau sistem dapat menahan tekanan tinggi dan mempertahankan performa optimal dalam kondisi beban maksimum.

3. Tabel Tier : istilah yang digunakan untuk menggambarkan bagaimana aplikasi atau sistem dibagi menjadi beberapa bagian atau "lapisan". Setiap lapisan bertanggung jawab atas tugas atau fungsi tertentu dalam aplikasi atau sistem.

4. Stress Testing : jenis pengujian yang membuat aplikasi atau sistem dikenai beban di luar kemampuannya untuk menilai toleransi dan memahami bagaimana sistem atau aplikasi akan merespons dalam situasi ekstrem.

5. Spike Testing : jenis pengujian di mana aplikasi atau sistem dikenai beban singkat dan tiba-tiba untuk menilai kemampuannya menangani lonjakan tiba-tiba pada pengguna atau beban.

6. Soak Testing : jenis pengujian yang membuat aplikasi atau sistem mengalami tekanan tinggi untuk jangka waktu yang lama untuk menilai kemampuan sistem atau aplikasi untuk mempertahankan kinerjanya dalam jangka waktu yang lama.

Materi - Introduction JMeter and Tutorial

Kenapa JMeter?
Apache JMeter adalah perangkat lunak sumber terbuka, aplikasi desktop java 100% murni, yang dirancang untuk memuat uji perilaku fungsional dan mengukur kinerja situs web. awal dirancang untuk aplikasi web pengujian beban tetapi sejak itu diperluas ke fungsi pengujian lainnya

componen di jmeter script
Thread Group: Menentukan jumlah pengguna virtual dan skenario pengujian untuk aplikasi yang diuji.

Samplers: Digunakan untuk mengirimkan permintaan ke aplikasi yang diuji, seperti HTTP request, FTP request, JDBC request, dan sebagainya.

Logic Controllers: Digunakan untuk mengontrol alur thread group, seperti If Controller, Loop Controller, dan sebagainya.

Listeners: Digunakan untuk mendengarkan respons dari aplikasi yang diuji dan menampilkan hasil pengujian dalam bentuk grafik, tabel, atau laporan, seperti View Results Tree, Summary Report, dan sebagainya.

Assertions: Digunakan untuk memeriksa respons dari aplikasi yang diuji dan memastikan bahwa aplikasi memberikan hasil yang diharapkan, seperti Response Assertion, Duration Assertion, dan sebagainya.

Timers: Digunakan untuk memberikan waktu jeda antara permintaan dari thread group, seperti Constant Timer, Gaussian Random Timer, dan sebagainya.

Pre-Processors: Digunakan untuk memodifikasi permintaan sebelum dikirimkan ke aplikasi yang diuji, seperti CSV Data Set Config, User Parameters, dan sebagainya.

Post-Processors: Digunakan untuk memodifikasi respons setelah diterima dari aplikasi yang diuji, seperti JSON Extractor, Regular Expression Extractor, dan sebagainya.

cara mengset proxy di firefox browser
Buka Firefox browser dan klik ikon menu di pojok kanan atas layar.
Pilih opsi "Preferences" untuk pengguna macOS atau "Options" untuk pengguna Windows.
Pilih opsi "General" di sisi kiri layar dan gulir ke bawah hingga menemukan opsi "Network Settings".
Klik tombol "Settings" di sebelah kanan opsi "Network Settings".
Pilih opsi "Manual proxy configuration".
Masukkan alamat IP dan nomor port dari proxy server yang ingin digunakan pada kolom "HTTP Proxy" dan "Port". Jika proxy server memerlukan otentikasi, masukkan juga nama pengguna dan kata sandi pada kolom "Username" dan "Password".
Jika ingin mengatur proxy untuk protokol HTTPS dan FTP, aktifkan opsi "Use this proxy server for all protocols" dan masukkan alamat IP dan nomor port proxy server pada kolom yang tersedia.
Klik tombol "OK" untuk menyimpan pengaturan proxy.
Tutup jendela Preferences/Options.