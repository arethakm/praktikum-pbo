Nama file: MTitik.java
Tanggal: 22 Februari 2023
Penulis: Aretha Khansa Maritza (24060121140147)
Deskripsi: Kelas yang berisi program utama yang memanfaatkan kelas Titik

class MTitik {
	public static void main(String[] args) {
		Titik t1;
		Titik t2;
		Titik t3;
		t1 = new Titik();
		t2 = new Titik();
		t3 = new Titik();

		t1.setAbsis(1.0);
		t1.setOrdinat(2.0);
	
		t2.setAbsis(4.0);
		t2.setOrdinat(9.0);

		t3.setAbsis(5.0);
		t3.setOrdinat(6.0);

		System.out.println("t1.x = "+t1.getAbsis());
		System.out.println("t1.x = "+ t1.getOrdinat());
		System.out.println("t2.x = "+t2.getAbsis());
		System.out.println("t2.x = "+ t2.getOrdinat());
		System.out.println("t3.x = "+t3.getAbsis());
		System.out.println("t3.x = "+ t3.getOrdinat());
	}
}