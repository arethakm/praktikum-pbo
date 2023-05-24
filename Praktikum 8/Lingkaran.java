/* 
* Nama File: Lingkaran.java 
* Pembuat: Aretha Khansa Maritza
* NIM: 24060121140147
* Tanggal: 17 Mei 2023
* Deskripsi: Implementasi Lingkaran sebagai BangunDatar
* Lab: B1
*/

public class Lingkaran extends BangunDatar {
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }
    public double hitungKeliling(){
        return 2*jejari*3.14;
    }
}