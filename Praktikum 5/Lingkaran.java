/*
* File: Lingkaran.java
* Tanggal: 26-03-2023
* Nama: Aretha Khansa Maritza
* NIM: 24060121140147
* Deskripsi: Kelas implementasi IArea berupa cara untuk menghitung luas lingkaran
* Lab: B1
*/

import static java.lang.Math.PI;

class Lingkaran implements IArea{
	private double jejari;
	
	public Lingkaran(double r){
		jejari = r;
	}
	
	public double hitungLuas(){
		return PI*jejari*jejari;
	}
}