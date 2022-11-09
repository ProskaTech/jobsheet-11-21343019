package Latihan.Latihan4_Inheritance;

/*
 * Created By 21343019 Arafil Azmi
 */

public class A {
    private int a;

    public void setA(int nilai){
        a = nilai;
    }

    public int getA(){
        return a;
    }

    public void tampilkanNilai(){
        System.out.println("Nilai a = " + getA());
    }
}
