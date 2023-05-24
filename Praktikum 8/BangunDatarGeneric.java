/* 
* Nama File: BangunDatarGeneric.java 
* Pembuat: Aretha Khansa Maritza
* NIM: 24060121140147
* Tanggal: 17 Mei 2023
* Deskripsi: Kelas konstruksi generic untuk BangunDatar
* Lab: B1
*/

public class BangunDatarGeneric<T1 extends BangunDatar>{
    private T1 bangunDatar;

    public void set(T1 tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public T1 get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}

// Pertanyaan: Gantilah ‘T’ (dan segala T) pada BangunDatarGeneric.java diganti
// dengan karakter yang lain seperti, T1,T2,T1234. Simpulkan apa yang anda lakukan!
// Jawaban:
// Salah satu cara untuk memberikan nama yang lebih deskriptif pada parameter generik adalah 
// dengan menggantikan karakter 'T' dengan karakter lain, seperti T1, T2, T1234. 
// Metode ini bertujuan untuk meningkatkan deskripsi parameter generik dan memberikan fleksibilitas 
// dalam penggunaan data, terutama ketika lebih dari satu parameter generik digunakan dalam kelas yang sama.