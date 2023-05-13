/* 
* Nama File: Programmer.java 
* Pembuat: Aretha Khansa Maritza
* NIM: 24060121140147
* Tanggal: 3 Mei 2023
* Deskripsi: Class programmer
* Lab: B1
*/

public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama) {
        setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}