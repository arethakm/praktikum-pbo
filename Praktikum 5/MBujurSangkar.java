/*
* File: MBujurSangkar.java
* Tanggal: 26-03-2023
* Nama: Aretha Khansa Maritza
* NIM: 24060121140147
* Deskripsi: Kelas yang mengimplementasikan cara menghitung luas bujur sangkar
*/

import java.util.Scanner;

class MBujurSangkar{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		BujurSangkar bs = new BujurSangkar();
		System.out.print("Masukkan sisi bujur sangkar : ");
		double sisi = scan.nextDouble();
		System.out.println("Luas bujur sangkar dengan sisi "+sisi+" satuan adalah "+bs.hitungLuas(sisi));
	}
}