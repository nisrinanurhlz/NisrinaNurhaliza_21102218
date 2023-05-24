package com.NisrinaNurhaliza.PBO.Pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiplecatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan Angka         : ");
            int angka1 = input.nextInt();

            System.out.print("Masukkan Angka Pembagi : ");
            int angka2 = input.nextInt();

            int hasil = angka1 / angka2;
            System.out.println(angka1 + " / " + angka2 + " = " + hasil+" (Dibulatkan)");
        }
        //Multiple Exception
//        catch (ArithmeticException | InputMismatchException e) {
//            System.out.println("Error : " + e);
//       }

        //Multiple Exception
         catch(ArithmeticException e) {
             System.out.println("Error : Kesalahan Dalam Perhitungan!");
         }
        catch (InputMismatchException e) {
            System.out.println("Error : Kesalahan Dalam Input!");
        }
        finally {
            System.out.println(
                    "Finally Akan Selalu Dijalankan"
            );
        }
        System.out.println("Akhir Dari Program");
    }
}
