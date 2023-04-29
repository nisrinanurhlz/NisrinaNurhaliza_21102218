package com.NisrinaNurhaliza.PBO.Pertemuan3;

import java.util.Arrays;

public class SepedaMotor2 {
    public static void main(String[] args) {

        SepedaMotor vespa = new SepedaMotor("Vespa", "Vespa Matic", 40000000);


        //Sebelum Perubahan
        System.out.println("Merek Motor : " + vespa.getMerek() +
                "Dengan Tipe (before)   : " + vespa.getTipe()
        );

        //Melakukan Proses Perubahan Tipe Motor
       vespa.setTipe("Sprint");

        //Lihat Hasil Perubahan
        System.out.println("Merek Motor : " + vespa.getMerek() +
                "Dengan Tipe (after)    : " + vespa.getTipe()
        );

        vespa.showInfo();
    }

}

//                //Pembuatan Class
//                System.out.println("===== DEALER NISRINA =====");
//                SepedaMotor suzuki = new SepedaMotor("Suzuki", "GSX 150R", 2000000);
//                SepedaMotor yamaha = new SepedaMotor("Yamaha", "YZF R15", 25000000);
//                SepedaMotor honda = new SepedaMotor("Honda", "CBR 150R", 23500000);
//
//                //Menjalankan method showInfo()
//                suzuki.showInfo();
//                yamaha.showInfo();
//                honda.showInfo();
//                }
//                }
