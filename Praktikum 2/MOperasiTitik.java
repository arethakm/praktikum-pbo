/*
* Penulis: Aretha Khansa Maritza
* NIM: 24060121140147
* Tanggal: 1 Maret 2023
* Deskripsi: class operasi titik
* Lab: B1
*/

public class MOperasiTitik{

    public static void main (String[] args){
        Titik t = new Titik(4.0,4.0);
        OperasiTitik o = new OperasiTitik();

        System.out.println("Titik : (" + t.getAbsis()+", "+t.getOrdinat() +")");
        o.refleksiX(t); //hasil
        System.out.println("Titik : (" + t.getAbsis()+", "+t.getOrdinat() +")");
        o.refleksiY(t); //hasil
        System.out.println("Titik : (" + t.getAbsis()+", "+t.getOrdinat() +")");
    }
}