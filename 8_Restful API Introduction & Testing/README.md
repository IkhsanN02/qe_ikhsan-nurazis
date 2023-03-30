Nama : Ikhsan Nurazis
Kelas : C - Quality Engineer

BASIC OF API TESTING

API & REST API 

Pengertian API : 
API adalah singkatan dari Application Programming Interface. Ini adalah kumpulan protokol, rutin, dan alat untuk membangun aplikasi perangkat lunak. API memungkinkan aplikasi perangkat lunak yang berbeda untuk berkomunikasi satu sama lain, menukar data, dan mengakses layanan. REST API adalah jenis API yang mengikuti gaya arsitektur REST (Representational State Transfer). REST API menggunakan permintaan HTTP untuk mengambil, memposting, mengirim, dan menghapus data.

Cara Kerja API :
API bekerja dengan menggunakan protokol dan metode tertentu untuk memungkinkan komunikasi antara aplikasi yang berbeda. API memungkinkan aplikasi untuk mengirim permintaan ke server untuk mendapatkan data atau mengirimkan data ke server untuk disimpan atau diproses. API juga dapat memberikan akses ke layanan dan fungsionalitas yang disediakan oleh aplikasi lain atau sistem lain.

API Workflow
API Workflow adalah serangkaian langkah yang diikuti oleh API saat memproses permintaan dari aplikasi klien dan mengembalikan respons yang sesuai. Langkah-langkah ini meliputi autentikasi, validasi permintaan, pengambilan data, pemrosesan data, dan mengirimkan respons.

Rest API
REST API adalah jenis API yang mengikuti gaya arsitektur REST (Representational State Transfer). REST API menggunakan permintaan HTTP untuk mengambil, memposting, mengirim, dan menghapus data. REST API sangat populer karena mudah digunakan, dapat diakses melalui browser web, dan dapat digunakan oleh berbagai jenis aplikasi.

HTTP METHOD
HTTP Method adalah metode atau tindakan yang digunakan oleh klien untuk berkomunikasi dengan server melalui protokol HTTP (Hypertext Transfer Protocol). Beberapa metode HTTP yang umum digunakan adalah GET, POST, PUT, DELETE, dan OPTIONS.

REST API Component
REST API terdiri dari beberapa komponen penting, termasuk Endpoint, Request, Response, Resource, dan Representation. Endpoint adalah alamat URL yang digunakan untuk mengakses API, Request adalah permintaan yang dikirim oleh klien ke server, Response adalah respons yang dikirim oleh server ke klien, Resource adalah objek atau data yang diakses oleh API, dan Representation adalah format data yang digunakan untuk mengirim dan menerima informasi.

HTTP Response Code
HTTP Response Code adalah kode numerik yang dikirimkan oleh server HTTP sebagai respons terhadap permintaan klien. Kode respons ini memberikan informasi tentang keberhasilan atau kegagalan permintaan.

REST API Input
Input REST API adalah data yang dikirim oleh klien ke server melalui permintaan API. Input dapat berupa parameter, kueri, atau badan permintaan.

TESTING API
pengertian Testing API :
Testing API adalah proses pengujian perangkat lunak yang bertujuan untuk memverifikasi bahwa antarmuka pemrograman aplikasi (API) berfungsi dengan benar, sesuai dengan persyaratan fungsional dan non-fungsional yang telah ditentukan, dan memberikan hasil yang diharapkan. 

Kind of API Testing :
Fungsion : untuk memvalidasi apakah sudah berfungsi atau belum
Load Test : menguji banyaknya data
Security : menguji keamanan

Proses dari API Testing meliputi langkah-langkah berikut:
- Analisis persyaratan API
- Persiapan lingkungan tes
- Penentuan kasus pengujian
- Menjalankan pengujian
- Analisis hasil pengujian
- Pelaporan hasil pengujian
- Perbaikan dan pengujian ulang
- Integrasi dengan pengujian lainnya

ADVANTAGES & CHALLENGE
KEUNTUNGAN dari testing API:
- Efisiensi waktu
- bahasa yang idependen
- mengurangi biaya testing
- mengurangi resiko

TANTANGAN dari testing API:
- kombinasi parameter, pemilihan parameter
- tidak ada GUI (Graphical User Interface)
- Kita harus mengetahui terlebih dahulu parameter
- perlu uga mengetes error handling dari setiap API

KESIMPULAN :
- API terdiri dari sekumpulan kelas/fungsi/prosedur
- yang mewakili lapisan logika bisnis
- jika API tidak diuji dengan benar, dapat menimbulkan masalah
- tidak hanya aplikasi API tetapi juga dalam aplikasi panggilan
- itu adalah tes yang sangat diperlukan dalam rekayasa perangkat lunak