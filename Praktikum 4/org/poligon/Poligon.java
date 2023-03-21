/* 
* Nama File: Kubus.java 
* Pembuat: Aretha Khansa Maritza
* NIM: 24060121140147
* Tanggal: 20 Maret 2023
* Deskripsi: File Super Class Poligon
* Lab: B1
*/

package org.poligon;

public class Poligon {
    // atribut
    protected int jumlahSisi;

    // konstruktor
    public Poligon(){
        this.jumlahSisi = 0;
    }

    // method
    public void setJumlahSisi(int sisi){
        this.jumlahSisi = sisi;
    }

    public int getJumlahSisi(){
        return this.jumlahSisi;
    }
}