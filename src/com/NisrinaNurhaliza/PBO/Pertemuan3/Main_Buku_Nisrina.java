package com.NisrinaNurhaliza.PBO.Pertemuan3;

import java.util.Arrays;
import java.util.Scanner;

public class Main_Buku_Nisrina {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        int pilih;
        int jumlah, bayar, totalHarga;

        Scanner input = new Scanner(System.in);
        Buku_Nisrina bk1 = new Buku_Nisrina();
        Buku_Nisrina bk2 = new Buku_Nisrina();

        System.out.println("NAMA    : NISRINA NURHALIZA");
        System.out.println("NIM     : 21102218");
        System.out.println();
        System.out.println("====== LIST OF BOOKS =====");
        bk1.setNo_Buku(1);
        bk1.setJudul_Buku("Pemrograman Berbasis Objek dengan Java");
        bk1.setPengarang("Indrajani");
        bk1.setTahun_Terbit(2007);
        bk1.setHarga(70000);

        bk2.setNo_Buku(2);
        bk2.setJudul_Buku("Dasar Pemrograman Java");
        bk2.setPengarang("Abdul Kadir");
        bk2.setTahun_Terbit(2004);
        bk2.setHarga(30000);

        bk1.showInfo();
        bk2.showInfo();

        System.out.println("================================================");
        System.out.print("Masukkan No Buku Yang Ingin Dibeli     : ");
        pilih = input.nextInt();
        System.out.print("Masukkan Jumlah Buku Yang Ingin Dibeli : ");
        jumlah = input.nextInt();

        if (pilih == 1) {
            totalHarga = bk1.getHarga() * jumlah;
            System.out.println("Total Harga          : " + totalHarga);
            System.out.print("Masukkan Jumlah Uang : ");
            bayar = input.nextInt();
            if (bayar <= totalHarga) {
                clearScreen();
                System.out.println("Mohon Maaf Uang Anda Tidak Cukup.");
            } else {
                clearScreen();
                System.out.println();
                System.out.println("====== Rincian Pembelian Buku ======");
                bk1.showInfo();
                System.out.println("====== Rincian Pembayaran ======");
                System.out.println("Jumlah Bayar  :" + bayar);
                System.out.println("Kembalian     :" + (bayar - totalHarga));
            }
        }else if (pilih == 2) {
            totalHarga = bk2.getHarga() * jumlah;
            System.out.println("Total Harga          : " + totalHarga);
            System.out.print("Masukkan Jumlah Uang : ");
            bayar = input.nextInt();
            if (bayar <= totalHarga) {
                System.out.println("Mohon Maaf Uang Anda Tidak Cukup.");

            } else {
                System.out.println("====== Rincian Pembelian Buku ======");
                bk2.showInfo();
                System.out.println("====== Rincian Pembayaran ======");
                System.out.println("Jumlah Bayar  :" + bayar);
                System.out.println("Kembalian     :" + (bayar - totalHarga));
            }
        }else {
            System.out.println("Pilihan Tidak Tersedia");
        }
        input.close();
    }
}
