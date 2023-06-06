/* 
* Nama File: Lambdalist.java 
* Pembuat: Aretha Khansa Maritza
* NIM: 24060121140147
* Tanggal: 4 Juni 2023
* Deskripsi: Implementasi lambda pada list, digunakan sebagai parameter pada method
* Lab: B1
*/

 import java.util.ArrayList;

 public class LambdaList {
     public static void main(String[] args) {
         ArrayList<String> mahasiswaList = new ArrayList<>();
         mahasiswaList.add("Aretha");
         mahasiswaList.add("Afra");
         mahasiswaList.add("Ajeng");
         mahasiswaList.add("Diva");
 
         //lambda digunakan sebagai parameter pada method
         mahasiswaList.forEach((nama) -> System.out.println(nama));
     }
 }