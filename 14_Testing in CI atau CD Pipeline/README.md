Nama : Ikhsan Nurazis
Kelas : C - Quality Engineer

Testing in CI atau CD Pipeline
explain about :
introduction CI/CD
what makes for good CI/CD
CI/CD Process
Benefits and Costs from CI/CD
CI/CD Tools
Github Actions
Practice Testing API in CI Using Github


pengantar CI/CD
CI/CD (Continuous Integration/Continuous Delivery atau Continuous Deployment) adalah metode pengembangan perangkat lunak yang bertujuan untuk mempercepat dan mengotomatisasi proses pengiriman atau penerbitan aplikasi atau software.
Dalam CI/CD, pengembangan aplikasi dilakukan secara terus-menerus dan diintegrasikan secara otomatis ke dalam satu repositori bersama, sehingga memungkinkan tim pengembang untuk bekerja secara kolaboratif dan menghasilkan kode yang lebih konsisten dan stabil.
Setelah kode diintegrasikan, aplikasi atau software diuji secara otomatis untuk memastikan tidak ada masalah atau bug yang terjadi. Setelah melewati serangkaian pengujian, aplikasi atau software siap untuk dikirimkan atau diterbitkan secara otomatis ke dalam produksi atau ke dalam lingkungan yang diinginkan.
Dengan CI/CD, proses pengembangan dan pengiriman aplikasi dapat diotomatisasi, sehingga meningkatkan efisiensi, kecepatan, dan kualitas pengembangan aplikasi. Selain itu, CI/CD juga membantu mengurangi risiko kesalahan manusia, meningkatkan kolaborasi antara tim, dan memperbaiki kualitas serta keandalan aplikasi atau software.


apa yang membuat CI/CD bagus
CI/CD (Continuous Integration/Continuous Delivery atau Continuous Deployment) memiliki beberapa keuntungan atau alasan mengapa metode ini dianggap bagus untuk digunakan dalam pengembangan perangkat lunak, antara lain:
Mempercepat waktu rilis aplikasi: Dengan otomatisasi proses pengujian, integrasi, dan pengiriman aplikasi, CI/CD dapat mempercepat waktu rilis aplikasi. Proses pengiriman aplikasi dapat dilakukan lebih cepat karena sudah diuji dan diverifikasi secara otomatis.
Mengurangi risiko kesalahan: Dengan otomatisasi proses, risiko kesalahan manusia dapat dikurangi. CI/CD memastikan bahwa setiap kode yang diintegrasikan ke dalam repositori sudah diuji secara otomatis dan diverifikasi sebelum dikirimkan ke dalam produksi.
Memperbaiki kolaborasi antar tim: CI/CD memungkinkan setiap anggota tim untuk berkontribusi ke dalam repositori dan melakukan integrasi kode secara teratur, sehingga meningkatkan kolaborasi antar tim. Hal ini dapat meningkatkan produktivitas dan kualitas pengembangan aplikasi.
Memperbaiki kualitas dan keandalan aplikasi: Dengan otomatisasi pengujian dan integrasi, CI/CD dapat memastikan bahwa aplikasi yang dikirimkan ke dalam produksi memiliki kualitas dan keandalan yang lebih baik. Setiap masalah atau bug dapat terdeteksi dan diperbaiki sebelum aplikasi dikirimkan ke dalam produksi.
Meningkatkan kepuasan pelanggan: Dengan pengiriman aplikasi yang lebih cepat, berkualitas, dan stabil, pelanggan dapat merasa lebih puas dengan layanan atau produk yang diberikan. Hal ini dapat membantu meningkatkan loyalitas pelanggan dan citra perusahaan.


Proses CI/CD
Proses CI/CD (Continuous Integration/Continuous Delivery atau Continuous Deployment) terdiri dari beberapa tahap utama, antara lain:
Continuous Integration (CI): Tahap ini dimulai dengan pengembangan kode oleh anggota tim, yang kemudian diintegrasikan ke dalam satu repositori bersama secara teratur dan otomatis. Setiap kali ada perubahan kode, repositori akan secara otomatis melakukan build, compile, dan pengujian terhadap kode tersebut untuk memastikan bahwa tidak ada kesalahan atau bug yang terjadi.
Continuous Delivery (CD): Setelah melalui tahap CI, kode akan diuji secara otomatis dalam lingkungan yang mirip dengan lingkungan produksi. Pada tahap ini, tim QA akan melakukan pengujian lebih lanjut untuk memastikan bahwa aplikasi siap untuk dikirimkan ke dalam produksi. Jika aplikasi tidak memenuhi standar kualitas yang ditetapkan, maka proses pengiriman akan dihentikan dan masalah akan diperbaiki.
Continuous Deployment (CD): Setelah melalui tahap CD, aplikasi siap untuk dikirimkan ke dalam produksi. Pada tahap ini, aplikasi atau software akan diunggah secara otomatis ke dalam lingkungan produksi atau dijalankan secara otomatis. Proses ini memastikan bahwa aplikasi siap digunakan oleh pengguna.
Proses CI/CD dapat diotomatisasi dengan menggunakan alat atau platform CI/CD, seperti Jenkins, CircleCI, atau GitLab. Alat ini memungkinkan pengembang untuk memantau proses pengembangan, melakukan integrasi kode secara otomatis, dan melakukan pengujian terhadap kode secara otomatis.
Pada umumnya, CI/CD mengacu pada pengembangan perangkat lunak berbasis cloud atau platform web, tetapi prinsip CI/CD dapat diterapkan pada pengembangan perangkat lunak berbasis desktop atau perangkat mobile.
Manfaat dan Biaya dari CI/CD


Alat CI/CD
 Berikut adalah beberapa alat CI/CD yang umum digunakan:
Jenkins: Jenkins adalah alat open-source yang paling populer untuk CI/CD. Jenkins memiliki berbagai plugin yang dapat digunakan untuk otomatisasi proses CI/CD, seperti integrasi dengan Git, SVN, dan GitHub.
GitLab CI/CD: GitLab CI/CD adalah platform CI/CD yang terintegrasi dengan GitLab. GitLab CI/CD memiliki berbagai fitur seperti integrasi dengan Docker, Kubernetes, dan helm chart.
CircleCI: CircleCI adalah alat CI/CD berbasis cloud yang memungkinkan pengembang untuk membangun, menguji, dan menerapkan perangkat lunak dalam lingkungan yang terisolasi. CircleCI memiliki dukungan untuk berbagai bahasa pemrograman dan kerangka kerja.
Travis CI: Travis CI adalah platform CI/CD yang terintegrasi dengan GitHub. Travis CI memiliki dukungan untuk berbagai bahasa pemrograman dan kerangka kerja, serta fitur untuk pengujian berbasis browser dan integrasi dengan Docker.
Bamboo: Bamboo adalah platform CI/CD yang dikembangkan oleh Atlassian. Bamboo memiliki dukungan untuk berbagai bahasa pemrograman dan kerangka kerja, serta integrasi dengan Jira dan Bitbucket.
TeamCity: TeamCity adalah alat CI/CD yang dikembangkan oleh JetBrains. TeamCity memiliki fitur untuk pengujian otomatis dan integrasi dengan Git, SVN, dan GitHub.
Codeship: Codeship adalah platform CI/CD berbasis cloud yang memungkinkan pengembang untuk mengotomatisasi proses integrasi dan pengiriman perangkat lunak.
Alat-alat CI/CD di atas memiliki fitur dan kelebihan masing-masing. Pengembang perlu memilih alat yang sesuai dengan kebutuhan dan spesifikasi proyek yang sedang dikembangkan.


Github Actions
Tindakan (actions) di GitHub adalah unit otomatisasi yang dapat digunakan untuk mengeksekusi tugas-tugas tertentu di dalam repositori GitHub. Tindakan Github menyediakan cara untuk mengotomatisasi berbagai tugas, seperti melakukan pengujian, membangun (build), dan merilis (release) kode.
Tindakan GitHub dapat ditentukan dalam file konfigurasi YAML yang disebut dengan file konfigurasi tindakan (action configuration file) yang disimpan di dalam direktori .github/workflows di dalam repositori. File konfigurasi tindakan ini dapat menentukan kriteria pemicu (trigger) untuk tindakan tersebut, seperti setiap kali ada perubahan pada branch tertentu, atau setiap kali ada perubahan pada kode.
Tindakan GitHub terdiri dari beberapa tahap (steps) yang menjalankan satu atau beberapa perintah. Setiap tahap terdiri dari serangkaian perintah (commands) yang akan dijalankan oleh agen GitHub (GitHub agent) ketika tindakan diaktifkan. Perintah ini dapat mengeksekusi berbagai tugas, seperti membangun kode, menjalankan pengujian, dan mengirim notifikasi ke layanan eksternal seperti Slack atau email.
GitHub menyediakan banyak tindakan (action) bawaan yang dapat digunakan secara gratis. Selain itu, Anda juga dapat membuat tindakan GitHub sendiri sesuai dengan kebutuhan Anda. GitHub Actions memungkinkan pengembang untuk mengotomatisasi tugas-tugas penting dalam siklus pengembangan perangkat lunak, seperti membangun kode, melakukan pengujian, dan merilis kode. Dengan menggunakan tindakan GitHub, pengembang dapat mempercepat waktu pengembangan dan memastikan bahwa kode yang dihasilkan berkualitas tinggi.


Praktik Pengujian API di CI Menggunakan Github Actions
Salah satu praktik pengujian yang dapat dilakukan dengan GitHub Actions adalah pengujian API. API (Application Programming Interface) adalah cara untuk menghubungkan perangkat lunak dengan perangkat lunak lainnya atau dengan perangkat keras. Pengujian API memastikan bahwa API berfungsi dengan benar dan memberikan hasil yang diharapkan.
Berikut adalah langkah-langkah untuk melakukan pengujian API di CI menggunakan GitHub Actions:
Membuat file konfigurasi YAML di dalam direktori .github/workflows. File konfigurasi tersebut akan menentukan tindakan (action) yang akan dilakukan oleh GitHub Actions.
Menentukan nama dan kriteria pemicu (trigger) untuk GitHub Actions. Misalnya, pengujian API dapat dipicu setiap kali ada perubahan pada cabang (branch) master.
Menentukan tindakan (action) yang akan dilakukan oleh GitHub Actions, seperti melakukan build, compile, dan pengujian API.
Menggunakan alat pengujian API seperti Postman atau Newman untuk melakukan pengujian terhadap API.
Menentukan kondisi atau skenario pengujian API yang akan diuji. Misalnya, menentukan endpoint API, parameter masukan, dan hasil keluaran yang diharapkan.
Menyimpan hasil pengujian API ke dalam laporan atau log yang dapat diakses oleh tim pengembang atau QA.
Melakukan pengujian API di CI menggunakan GitHub Actions dapat membantu mengotomatisasi proses pengujian dan mempercepat waktu pengembangan. Dengan menggunakan GitHub Actions, pengujian API dapat dilakukan secara otomatis setiap kali ada perubahan pada kode. Hal ini dapat meminimalkan kesalahan dan memastikan bahwa API berfungsi dengan benar.