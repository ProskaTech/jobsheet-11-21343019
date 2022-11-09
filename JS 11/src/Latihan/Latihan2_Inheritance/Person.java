package Latihan.Latihan2_Inheritance;

/*
 * Created By 21343019 Arafil Azmi
 */

public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // metode
    public void info(){
        System.out.println("Nama : " + this.name);
        System.out.println("Usia : " + this.age);
    }
    //akhir kelas program
}
