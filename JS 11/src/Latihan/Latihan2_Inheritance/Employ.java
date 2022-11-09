package Latihan.Latihan2_Inheritance;

/*
 * Created By 21343019 Arafil Azmi
 */

public class Employ extends Person{
    private String noKaryawan;
    
    //konstruktor
    public Employ (String noKaryawan, String name, int age){
        super(name, age);
        this.noKaryawan = noKaryawan;
    }

    //metode
    public void info(){
        System.out.println("No. Karyawan: " + this.noKaryawan);
        super.info();
    }
}
