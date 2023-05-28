package com.NisrinaNurhaliza.PBO.Pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Unguided_Nisrina {

    public static int JumlahBilangan(int bilangan1, int bilangan2) throws Exception {
        if (bilangan2 == 0) {
            throw new Exception("Penambahan Dengan Nol Tidak Diperbolehkan");
        }
        return bilangan1 + bilangan2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan Bilangan Pertama : ");
            int bilangan1 = scanner.nextInt();

            System.out.print("Masukkan Bilangan Kedua   : ");
            int bilangan2 = scanner.nextInt();

            int hasil = JumlahBilangan(bilangan1, bilangan2);
            System.out.println("Hasil Penjumlahan         : " + hasil);
        } catch (InputMismatchException e) {
            System.out.println("Terjadi Kesalahan : Input Tidak Valid, Harap Masukkan Bilangan Bulat ");
        } catch (Exception e) {
            System.out.println("Terjadi Kesalahan : " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
