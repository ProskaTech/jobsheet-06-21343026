
import java.util.Scanner;

/**
 * created by Indah Chania 21343026
 * @author Indah
 */
public class Tugas3 {
    public static void main(String[] args) {
        int angka;
        
        Scanner angkaMasuk = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        angka = angkaMasuk.nextInt();
        
        if (angka == 1){
            System.out.println("SATU");
        }
        else if (angka == 2){
            System.out.println("DUA");
        }
        else if (angka == 3){
            System.out.println("TIGA");
        }
        else if (angka == 4){
            System.out.println("EMPAT");
        }
        else if (angka == 5){
            System.out.println("LIMA");
        }
        else if (angka == 6){
            System.out.println("ENAM");
        }
        else if (angka == 7){
            System.out.println("TUJUH");
        }
        else if (angka == 8){
            System.out.println("DELAPAN");
        }
        else if (angka == 9){
            System.out.println("SEMBILAN");
        }
        else if (angka == 10){
            System.out.println("SEPULUH");
        }
        else
            System.out.println("Invalid number.");
}
}

