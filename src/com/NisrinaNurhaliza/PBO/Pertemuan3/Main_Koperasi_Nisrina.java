package com.NisrinaNurhaliza.PBO.Pertemuan3;

import java.util.Arrays;

public class Main_Koperasi_Nisrina {

    public static void main(String[] args) {
        System.out.println("NAMA    : NISRINA NURHALIZA");
        System.out.println("NIM     : 21102218");
        System.out.println();

        System.out.println("====== NISRINA BOOKSTORE ======");
        Koperasi_Nisrina BukuTulis = new Koperasi_Nisrina("Buku Tulis",
                2000, 20);
        Koperasi_Nisrina Pensil = new Koperasi_Nisrina("Pensil",
                3000,10);

            BukuTulis.HargaSatuan  = 5000;
            BukuTulis.JumlahBarang = 10;
            BukuTulis.TotalHarga   = (BukuTulis.getHargaSatuan() *
                    BukuTulis.getJumlahBarang());

             Pensil.HargaSatuan  = 3000;
             Pensil.JumlahBarang = 20;
             Pensil.TotalHarga   = (Pensil.getHargaSatuan() *
                Pensil.getJumlahBarang());

             BukuTulis.showInfo();
             Pensil.showInfo();
             System.out.println("=======================");
             System.out.println(("Total Harga : "
                     + (Pensil.getHargaSatuan() * Pensil.getJumlahBarang() +
                       (BukuTulis.getHargaSatuan() * BukuTulis.getJumlahBarang()))));

             System.out.println("=======================" );
    }
}
