package Latihan.Latihan1_Inheritance;

/*
 * Created By 21343019 Arafil Azmi
 */

public class Kedua extends Pertama {
    private int b = 8;

    protected void BacaSuper(){
        System.out.println("Nilai b = " + b);
        terprotek();
        info();
    }
    
}
