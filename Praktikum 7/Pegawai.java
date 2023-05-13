/* 
* Nama File: Pegawai.java 
* Pembuat: Aretha Khansa Maritza
* NIM: 24060121140147
* Tanggal: 3 Mei 2023
* Deskripsi: Class Pegawai
* Lab: B1
*/

public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
    }
}
