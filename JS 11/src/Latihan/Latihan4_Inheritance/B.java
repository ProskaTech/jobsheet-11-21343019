package Latihan.Latihan4_Inheritance;

/*
 * Created By 21343019 Arafil Azmi
 */

public class B extends A{
    private int b;

    public void setB(int nilai){
        b = nilai;
    }

    public int getB(){
        return b;
    }

    // melakukan override terhadap metod tampilkanNilai()
    // yang terhadap pada kelas A
    public void tampilkanNilai(){
        super.tampilkanNilai(); // memanggil method dalam kelas A
        System.out.println("Nilai b = " + getB());
    }
}
