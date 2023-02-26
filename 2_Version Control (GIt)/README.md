Ikhsan Nurazis - QE

Version Control (Git)
pengertian : pengaturan versi atau pelacaran kode
contoh : melakukan skripsi memerlukan banyak revisi, perlu adanya traking dengan membuat file-file baru hingga skripsi selesai

pencatatan dilakukan untuk mengetahui semua perubahan yang terjadi dan siapa yang mengubah 

"Revision Is a Mush, Don't Expect Every Code is Perfect"
tidak ada kode yang sempurna perlu adanya update untuk memperbaharui kode 

TOOLS 
Version Control System
Single User :
data sudah terstruktur & tertraking akan tetapi masih pada 1 local computer
SCCS - 1972 Unix only
RCS - 1982 Cross platforn, text only

Cenralized :
data tertraking dengan internet akan tetapi terbatas karena berada pada 1 server yang sama dan terpusat akan tetapi data hanya terdapat pada server tidak ada data pada local
CVS - 1986 File focus
Perforce - 1995
Subvertion - 2000 - track directory structure
Microsoft Team Foundation Server - 2005

Distributed :
memiliki data pada local dan server sehingga mempermudah dalam pengkodean
GIT - 2005
Mercurial - 2005
Bazaar - 2005

GIT
salah satu VCS populer yang digunakan para developer untuk mengembangkan software secara bersama-sama. bisa digunakan secara paralel berkolaborasi. secara flow terdapat review

Collaboration
untuk mengtrack perubahan-perubahan yang ada
terdistribusi bukan tersentralisasi
terdistribusi : memiliki komputer yang banyak akan tetapi saling berhubungan
tersentralisasi : terpaku pada server

git repository :
memiliki 2 folder :
folder dan file kode 
history : semua perubahan yang terjadi baik dari siapa yang mengubah, apa yang diubah
di git bisa melakukan undo dengan point bisa, dikenal sebagai commite
1 commite berisi banyak file, commite seperti sebuah riwayat


Git Hub
adalah media sosial bagi para programer
ada 2 public dan private
public bisa digunakan dan dilihat orang lain
private hanya beberapa orang tertentu yang di undang

Langkah dalam membuat repository
click your repository, kemudian klik new
isi nama repository
isi description
pilih antara public atau private
readme berupa dokumentasi penting : letak dibawah file project, cara penggunaan, dokumentasi, cara instalasi 
ada beberapa file yang tidak perlu di upload karena berisi data sensitif atau data yang besar hanya bagian-bagian tertentu
add .gitgnore untuk security dari file-file yang ada 
lisence untuk keamanan dari bagaimana pengunaan github

