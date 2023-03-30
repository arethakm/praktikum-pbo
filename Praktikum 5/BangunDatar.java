/*
* File: BangunDatar.java 
* Tanggal: 26-03-2023
* Nama: Aretha Khansa Maritza
* NIM: 24060121140147
* Deskripsi: Kelas abstrak, berisi abstraksi bangun datar
* Lab: B1
*/

public abstract class BangunDatar{
	protected double luas;
	
	public abstract double hitungLuas(double sisi);
	
	public void setLuas(double l){
		luas = l;
	}
	
	public double getLuas(){
		return luas;
	}
}