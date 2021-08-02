/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihansoalukl5;

/**
 *
 * @author maylany hellena
 */
public class LatihanSoalUkl5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int[][] nil1 = {{-5,3},{7,2}};
     int[][] nil2 = {{3,1},{5,-2}};
     int[][] hasil = new int [2][2];
     
     int jumlahbaris = 2;
     int jumlahkolom = 2;
     
      // Menampilkan matriks B
        System.out.println("Matrik B");

        for (int k = 0; k < 2; k++) {
            for (int l = 0; l < 2; l++) {
                System.out.print(nil2[k][l] + "  ");
            }
            System.out.println();
        }

        // Proses perhitungan
        for (int x = 0; x < jumlahbaris; x++) {
            for (int y = 0; y < jumlahkolom; y++) {
                hasil[x][y] = nil1[x][y] - nil2[x][y];
            }
        }

        // Menampilkan hasil
        System.out.println("Hasil Pengurangan Matriks A Dan B =");

        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 2; y++) {
                System.out.print(hasil[x][y] + "  ");
            }
            System.out.println();
        }

    }

}

   
   
