package Latihan.Latihan5_Encapsulation;

/*
 * Created By 21343019 Arafil Azmi
 */

public class Bus {
    public int penumpang;
    public  int maxPenumpang;

    public void cetak(){
        System.out.println("Penumpang Bus sekarang adalah " + penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah " + maxPenumpang);
    }
}
