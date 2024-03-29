/* 
* Nama File: Kubus.java 
* Pembuat: Aretha Khansa Maritza
* NIM: 24060121140147
* Tanggal: 20 Maret 2023
* Deskripsi: File Class Kubus
* Lab: B1
*/

package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus {
    // atribut
    private BujurSangkar permukaan;

    // konstruktor
    public Kubus(BujurSangkar bujurSangkar){
        this.permukaan = bujurSangkar;
    }

    // method
    public double hitungVolume(){
        return Math.pow(permukaan.getPanjangSisi(), 3);
    }

    public double hitungLuasAlas(){
        return permukaan.hitungLuas();
    }
}