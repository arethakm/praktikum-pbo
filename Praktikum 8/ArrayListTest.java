/* 
* Nama File: ArrayListTest.java 
* Pembuat: Aretha Khansa Maritza
* NIM: 24060121140147
* Tanggal: 17 Mei 2023
* Deskripsi: Program penggunaan objek ArrayList sebagai collection class
* Lab: B1
*/

import java.util.ArrayList;

public class ArrayListTest{
    public static void main (String[] args){
        // inisialisasi ArrayList yang hanya dapat berisi objek string
        ArrayLisy<String> strings = new ArrayLisy<String>();
        // menambah elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generic");
        // menghapus elemen
        strings.remove("praktikum");
        // iterasi pada keseluruhan ArrayList
        for(String s : strings){
            System.out.print(s+" ");
        }
    }
}