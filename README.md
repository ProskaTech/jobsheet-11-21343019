## Created_by_21343019_Arafil Azmi

Pada JS 11 ini kita mempelajari tentang Inheritance dan Encapsulation :

  1. Inheritance 
        Inheritance merupakan proses pewarisan data dan method dari suatu class yang telah ada kepada suatu class yang baru. Class yang mewariskan disebut superclass 
        parentclass / base class, sedangkan class yang mewarisi ( class baru ) disebut subclass / child class / derived class. Untuk menerapkan inheritance kita bisa
        menggunakan " extends ". 
        Terdapat keyword " super " keyword ini digunakan pada subclass untuk memanggil konstruktor yang berada pada superclassnya dan ada keyword " this " keyword ini
        digunakan untuk data member, method dan konstruktornya dalam classnya sendiri. Dalam inheritance terdapat istilah overriding, overriding adalah menulis kembali
        method sama persis, mulai dari nama method dan isinya serta mengimplementasikannya kembali pada subclass.
     
  2. Encapsulation
        Enkapsulasi merupakan suatu cara pembungkungsan data dan method yang menyusun suatu kelas sehingga kelas dapat dipandang sebagai suatu modul dan cara bagaimana
        menyembunyikan infotmasi detail dari suatu class. Dalam encapsulatio terdapat accessor method dan mutator method, accessor method yaitu method yang digunakan 
        untuk membaca nilai variabel pada class, baik instance maupun static penulisannya get<namaInstanceVariabel> yang memiliki retrun value. Sedangkan mutator
        method adalah method yang digunakan untuk memberi atau mengubah nilai variabel dalam kelas, baik instance maupun static, penulisannya set<namaInstanceVariabel>
        method ini tidak memiliki nilai balikan atau return.
     
  Penjelasan Program Latihan Pada Job Sheet 11 :
  
    1. Program latihan 1 : Inheritance
       Pada program ini membuat 3 class yaitu class Pertama, class Kedua dan class TestPertamaKedua dalam satu folder atau package, dimana class Pertama merupakan 
       superclass dari class Kedua dan class Kedua merupakan subclass dari class Pertama dan pada class TestPertamaKedua membuat objek dari kedua class yaitu objek
       untuk class Kedua dan objek untuk class Pertama jika program di run maka class Kedua dapat memanggil method yang terdapat pada class Pertama dikarenakan class 
       Kedua merupakan subclass dari class Pertama dengan menggunakan keyword extends.
       
    2. Program latihan 2 : Inheritance
       Pada program terdapat class Person sebagai superclass dari class Employ, class Employ merupakan subclass dari class Person dan terdapat class 
       KonstruktorSuperKelas. Pada class person terdapat konstruktor dengan nama Person dan didalamnya terdapat keyword this yang digunakan untuk menunjuk data pada 
       konstruktor tersebut serta terdapat method dengan nama info. Pada class Employ menggunakan extend Person karena merupakan subclass dari class Person. Pada 
       kosntruktor Employ menggunakan keyword super untuk memanggil konstruktor pada superclass dan pada method juga demikian.
       Kemudian pada class KonstruktorSuperKelas membuat objek dengan nama programmer1 dari class Employ dan mengisikan nilai variabel sesuai dengan konstruktor dan
       memanggil method info pada class Employ maka konstruktor pada class Person beserta methodnya akan ikut ditampilkan karena sudah dipanggil menggunakan keyword 
       super pada subclass yaitu class Employ.
       
    3. Program latihan 3 : Inheritance
       Pada program ini terdapat class Hewan merupakan superclass dan class Gajah yang merupakan subclass dari class Hewan. Pada class Hewan terdapat 2 method. Lalu
       class Gajah melakukan override method pada class Hewan dan pada method static membuat objek untuk class gajah dengan nama myGajah dan untuk class hewan sama
       dengan nama myHewan dari objek myGajah. Maka ketika dipanggil method tersebut menggunakan objek myHewan maka method pada class Gajah yang akan keluar karena 
       pada class Gajah sudah mengoverride method pada class Hewan.
       
    4. Program latihan 4 : Inheritance
       Pada program ini terdapat class A yang merupakan superclass dan class B yang merupakan subclass serta terdapat class Demo Override2. Pada class A terdapat 
       method setA yang digunakan untuk mengubah nilai variabel dan method getA digunakan untuk membaca nilai pada variabel dan mengembalikan nilai variabel serta 
       terdapat method demikian juga pada class B terdapat method setB dan getB serta mengoverride method pada class A dan pada method tersebut melakukan pemanggilan 
       method pada class A menggunakan super. Pada class DemoOverride2 membuat objek baru dari class B dengan nama obj kemudian melakukan pemanggilan method setA dan
       setB dan mengisikan nilai variabel serta memanggil method oada class B, maka pada tampilan variabel pada method A akan ikut ditampilkan karena pada method class 
       B sudah di panggil method pada class A menggunakan super dan objek pada class B dapat mengisikan nilai variabel pada method A dikarenakan class B merupakan sub 
       class dari class A.
       
    5. Program latihan 5 : Encapsulation
       Pada program ini terdapat class Bus dan class UjiBus. Pada class Bus terdapat variabel yang belum diisikan dan terdapat method dengan nama cetak serta isi dari 
       method tersebut. Kemudian pada class UjiBus membuat objek dengan nama BusMini dari class Bus dan mengisikan nilai dari variabel pada class Bus dengan 
       menggunakan objek dan memanggil method pada class Bus. Pada program ini merupakan contoh program tanpa encapsulation karena data variabel pada class Bus public 
       dan dapat diubah - ubah pada class UjiBus.
       
    6. Program latihan 6 : Encapsulation
       Pada program ini terdapat class Bus2 dan class UjiBus2. Pada class Bus2 terdapat variabel yang belum diisikan dan variabel tersebut private dan terdapat 
       konstruktor pada class Bus2 dan menunjuk data pada variabel maxPenumpang , terdapat method addPenumpang yang juga menunjuk data pada variabel penumpang  dan
       terdapat method cetak.
       Kemudian pada class UjiBus2 membuat objek dengan nama busBesar dari konstruktor Bus2 dan mengisikan nilai variabelnya dan memanggil method addPenumpang dan 
       Cetak,  namun pada class UjiBus2 tidak langsung mengisikan nilai pada variabel class Bus2 melainkan mengisikan nilai variabel melalui konstruktor dan method 
       jadi tidak mengubah nilai pada class Bus2 apabila ingin diinisialisaikan pada class yang berbeda karena dia mengisikan pada konstruktor dan method bukan pada 
       variabel yang terdapat pada class Bus2. Program inilah yang disebut menggunakan teknik encapsulation yaitu membungkus data variabel dan method yang artinya yang 
       mengisikan nilai variabel pada konstruktor bukan pada variabel dan itu juga bisa berlaku pada method.
       
       
       
       
       
       
       
       
       
       
    
    
    
