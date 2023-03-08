/*
* Penulis: Aretha Khansa Maritza
* NIM: 24060121140147
* Tanggal: 1 Maret 2023
* Deskripsi: Kelas yang berisi program utama untuk membuat titik
* Lab: B1
*/

class Titik{
    private double ordinat,absis;
    private static double counterTitik;

    Titik(){
        counterTitik++;
    }

    Titik(double a, double b){
        absis = a;
        ordinat = b;
        counterTitik++;
    }

	public void setAbsis(double a){
		absis = a;
	}

	public void setOrdinat(double o){
		ordinat = o;
	}

	public double getAbsis(){
		return absis;
	}

	public double getOrdinat(){
		return ordinat;
	}

	public double getCounterTitik(){
		return counterTitik;
	}
}
	
