/* 
* Nama File: Manajer.java
* Pembuat: Aretha Khansa Maritza
* NIM: 24060121140147
* Tanggal: 3 Mei 2023
* Deskripsi: Class manajer
* Lab: B1
*/

public class Manajer extends Pegawai {
    private int tunjangan = 700000;

    public Manajer(String nama) {
        setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}