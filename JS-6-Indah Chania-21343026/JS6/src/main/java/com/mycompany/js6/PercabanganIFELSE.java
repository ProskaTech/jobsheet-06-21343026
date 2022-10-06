
package com.mycompany.js6;

import java.util.Scanner;

/**
 * Created by Indah Chania 21343026
 * @author Indah
 */
public class PercabanganIFELSE {
    public static void main (String[]args){
        double total_pembelian, diskon = 0;
        
        Scanner dataMasuk = new Scanner(System.in);
        System.out.print("Masukan Total Pembelian: Rp ");
        total_pembelian = dataMasuk.nextDouble();
        
        if (total_pembelian >= 50000)
            diskon = 0.1 * total_pembelian;
        else
            diskon = 0.2 * total_pembelian;
        
        System.out.println("Besarnya diskon: Rp "+diskon);
    }
}
