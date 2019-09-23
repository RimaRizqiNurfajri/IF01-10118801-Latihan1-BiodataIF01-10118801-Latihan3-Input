/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Rima Rizqi Nurfajri
 * KELAS    : IF01
 * NIM      :10118801
 * Deskripsi Program    : Program ini berisi program untuk menampilkan
 * nama yang diinputkan oleh user
 */
public class Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukan nama anda: ");
        Scanner scanner = new Scanner(System.in);
                
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah " +nama);
    }
    
}
