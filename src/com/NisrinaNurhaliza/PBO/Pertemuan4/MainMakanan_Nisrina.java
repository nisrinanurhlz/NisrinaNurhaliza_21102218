package com.NisrinaNurhaliza.PBO.Pertemuan4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainMakanan_Nisrina {

    //Membuat Fungsi Main
    public static void main(String[] args) {
        //Menggunakan SCanner untuk inputan dari keyboard
        Scanner input = new Scanner(System.in);
        //Inisial Menu
        WarungMakan_Nisrina wm = new WarungMakan_Nisrina();
        Menu_Nisrina m  = new Menu_Nisrina();
        Menu_Nisrina m1 = new Menu_Nisrina();
        Menu_Nisrina m2 = new Menu_Nisrina();
        Menu_Nisrina m3 = new Menu_Nisrina();

        System.out.println();
        System.out.println("Nama : Nisrina Nurhaliza");
        System.out.println("NIM  : 21102218");
        System.out.println();

        wm.nama_warung  = "Warung Bottega Nisrina";
        wm.alamat       = "Ashta District 8 Teluk";
        wm.no_telp      = "087724411250";

        m1.no_makanan   = 1;
        m1.nama_makanan = "Nasi Goreng";
        m1.harga        = 10000;
        m1.stock        = 10;

        m2.no_makanan   = 2;
        m2.nama_makanan = "Nasi Goreng Spesial";
        m2.harga        = 15000;
        m2.stock        = 4;

        m3.no_makanan   = 3;
        m3.nama_makanan = "Nasi Goreng Spesial + Telur";
        m3.harga        = 20000;
        m3.stock        = 20;

        wm.detailWarung();
        m1.detailMakanan();
        m2.detailMakanan();
        m3.detailMakanan();

        System.out.print("Masukkan Nomor Makanan      : ");
        m.no_makanan = input.nextInt();
        //Menggunakan Percabangan
        //Untuk Memilih No 1
        if(m.no_makanan == 1){

            System.out.print("Masukkan Jumlah Pesanan     : ");
            wm.beliMakanan(m1, input.nextInt());
            m1.totalHarga();
            wm.cekStock(m1);

        //Untuk Memilih No 2
        } else if (m.no_makanan == 2){
            System.out.print("Masukkan Jumlah Pesanan     : ");
            wm.beliMakanan(m2, input.nextInt());
            m2.totalHarga();
            wm.cekStock(m2);

        //Untuk Memilih No 3
        } else if (m.no_makanan == 3) {
            System.out.print("Masukkan Jumlah Pesanan    : ");
            wm.beliMakanan(m3, input.nextInt());
            m3.totalHarga();
            wm.cekStock(m3);
        }
        //Berhenti Memilih Menu
        input.close();
    }
}
