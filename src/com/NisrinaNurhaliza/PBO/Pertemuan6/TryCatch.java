package com.NisrinaNurhaliza.PBO.Pertemuan6;

import java.lang.reflect.Array;

public class TryCatch {

    //Membuat Method Main
    public static void main(String[] args) {
        //Membuat Array
        int[] angka = {
                1, 2, 3, 4, 5, 6
        };
        System.out.print("Indeks ke 4 ada : ");
        try {
            //Membuat Array Berdasarkan Indek
            System.out.println(
                    angka[4]
            );
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                    "Indeks yang Anda masukkan melebihi batas"
            );
        }
        System.out.println("Indeks Ke 6 Tidak Ada : ");
        try {
            //Memanggil Array Berdasarkan Indeks
            System.out.println(
                    angka[6]
            );
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(
                    "Indeks yang Anda Masukkan Melebihi Batas"
            );
        }
    }
}
