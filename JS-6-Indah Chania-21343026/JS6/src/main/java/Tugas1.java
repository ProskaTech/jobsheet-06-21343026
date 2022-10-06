
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by Indah Chania 21343026
 * @author Indah 
 */
public class Tugas1 {
     public static void main(String[] args) {
        BufferedReader nilai = new BufferedReader(new InputStreamReader(System.in));
        
        String a, b, c;
        float nilai1, nilai2, nilai3, average;
        
        try {
            System.out.print("Masukkan nilai 1: ");
            a = nilai.readLine();
            nilai1 = Float.parseFloat(a);
            
            System.out.print("Masukkan nilai 2: ");
            b = nilai.readLine();
            nilai2 = Float.parseFloat(b);
            
            System.out.print("Masukkan nilai 3: ");
            c = nilai.readLine();
            nilai3 = Float.parseFloat(c);
            
            average = (nilai1 + nilai2 + nilai3)/3;
            
            if (average >= 60){
                System.out.println("Average: " + average + " :-)");
            }
            else 
                System.out.println("Average: " + average + " :-(");
        }
        catch (IOException e) {
            System.out.println("Gagal membaca keyboard");
        }
        }
    }
