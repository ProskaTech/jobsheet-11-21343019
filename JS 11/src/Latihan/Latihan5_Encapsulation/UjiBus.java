package Latihan.Latihan5_Encapsulation;

/*
 * Created By 21343019 Arafil Azmi
 */

public class UjiBus {
    public static void main(String[] args) {
        // membuat objek busMini dari kelas Bus
        Bus busMini = new Bus();

        // memasukan nilai jumlah penumpang dan
        // penumpang maksimal ke dalam obkel busMini
        busMini.penumpang = 5;
        busMini.maxPenumpang = 15;

        // memanggil method cetak pada kelas Bus
        busMini.cetak();

        // menambahkan jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang + 5;
        // memanggil method cetak pada kelas Bus
        busMini.cetak();

        // mengurangi jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang -2 ;
        // memanggil method cetak pada kelas Bus
        busMini.cetak();

        // menambahkan jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang + 8;
        // memanggil method cetak pada kelas Bus
        busMini.cetak();
        
    }
}
