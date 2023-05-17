/* 
* Nama File: AngkaSialException.java 
* Pembuat: Aretha Khansa Maritza
* NIM: 24060121140147
* Tanggal: 29 Maret 2023Eksepsi buatan sendiri, menolak masukan angka 13!
* Lab: B1
*/

public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}