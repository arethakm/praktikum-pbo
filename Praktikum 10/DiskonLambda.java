/* 
* Nama File: DiskonLambda.java 
* Pembuat: Aretha Khansa Maritza
* NIM: 24060121140147
* Tanggal: 4 Juni 2023
* Deskripsi: Ekspresi lambda dasar, digunakan untuk mengitung diskon
* Lab: B1
*/

 interface IDiskon {
    public double hitungDiskon(int harga);
}

public class DiskonLambda {
    public static void main(String[] args) {
        IDiskon diskonMerdeka = new IDiskon() {
            public double hitungDiskon(int harga) {
                return harga - (harga * 0.3);
            }
        };

        //dengan lambda
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);

        //dengan lambda dengan blok statement
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };
        System.out.println("Diskon Merdeka: "+diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: "+diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: "+diskonBiasa.hitungDiskon(45000));
    }
}