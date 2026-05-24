## TUGAS KELOMPOK - PBO

Anggota Kelompok :

- Ruth Septriana Sipangkar   (24060124120024)
- Sarifa Nuha Ardanti Jusmar (24060124130082)
- Syafira Azka Ramadhani     (24060124130088)
- Yasmina Syahidah           (24060124130116)

Informatika 2024 Kelas C

## Bussines Process
Sebuah **Sistem Geometrik** terdiri dari dua class utama, yaitu BangunDatar dan BangunRuang, dengan rincian sebagai berikut.

**BangunDatar** adalah abstract class yang memiliki atribut jumlahSisi dan warna, serta atribut statis counterBangunDatar.BangunDatar memiliki abstract method getKeliling() untuk menghitung keliling, getLuas() menghitung luas, dan printDetail() untuk menampilkan detail.

BangunDatar membentuk tiga subclass: 
- BujurSangkar, yang memiliki ukuran sisi dalam cm dan method getDiagonal() untuk menghitung diagonal; 
- PersegiPanjang, yang memiliki panjang dan lebar dalam cm;
- SegiTiga, yang memiliki alas dan tinggi dalam cm.

**BangunRuang** adalah abstract class yang memiliki atribut jumlahSisi, jumlahRusuk, serta atribut statis counterBangunRuang. BangunRuang memiliki abstract method getLuasPermukaan() untuk menghitung luas permukaan, getVolume() untuk menghitung volume, dan printDetail() untuk menampilkan detail.

BangunRuang membentuk tiga subclass:
- Kubus, yang tersusun dari sisi berbentuk BujurSangkar dan memiliki method getDiagonalRuang() untuk menghitung diagonal ruang; 
- Balok, yang tersusun dari sisiAlas, sisiTegak, dan sisiDepan berbentuk PersegiPanjang dan memiliki method getDiagonalRuang() untuk menghitung diagonal ruang;
- Limas, yang tersusun dari sisiAlas berbentuk BujurSangkar dan sisiTegak berbentuk Segitiga dan memiliki method getTinggi() untuk menghitung tinggi limas.

Selain itu, terdapat Interface IValidasi berisi method isValid() yang diimplementasikan oleh class Balok dan Limas untuk memvalidasi ukuran bangun. Method ini dipanggil di dalam konstruktor untuk memeriksa parameter dan memastikan bahwa nilai-nilai ukuran, seperti sisiAlas, sisiDepan, sisiTegak memenuhi syarat valid. Apabila hasil validasi bernilai false, maka konstruktor akan melempar exception (misalnya IllegalArgumentException) sebagai bentuk penanganan kesalahan input.

Dengan struktur ini, seluruh sistem geometrik tersusun secara terorganisir, di mana setiap jenis bangun datar maupun bangun ruang memiliki karakteristik dan perilaku yang konsisten dengan sifat geometrisnya.

## Class Diagram

<p align="center">
  <img src="./img/PBO-class-diagram.png" width="700">
</p>