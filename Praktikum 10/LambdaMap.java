/* 
* Nama File: LambdaHashmap.java 
* Pembuat: Aretha Khansa Maritza
* NIM: 24060121140147
* Tanggal: 4 Juni 2023
* Deskripsi: Implementasi lambda pada hash map
* Lab: B1
*/

import java.util.HashMap;
import java.util.Map;

public class LambdaHashmap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060121140147", "Aretha");
        mahasiswaMap.put("24060121140109", "Ajeng");
        mahasiswaMap.put( "24060121140135", "Afra");

        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " +nim+ ", Nama: " +nama));
    }
}