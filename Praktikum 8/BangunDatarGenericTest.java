/* 
* Nama File: BangunDatarGenericTest.java 
* Pembuat: Aretha Khansa Maritza
* NIM: 24060121140147
* Tanggal: 17 Mei 2023
* Deskripsi: Main class generic untuk BangunDatar
* Lab: B1
*/

public class BangunDatarGenericTest {
    public static void main(String[] args){
        Lingkaran lingkaran = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg =
                new BangunDatarGeneric<Lingkaran>();
        bdg.set(1);
        System.out.println("keliling lingkaran: "+bdg.hitungKeliling());
        System.out.println("tipe generic: "+bdg.get().getClass().getName())
    }
}