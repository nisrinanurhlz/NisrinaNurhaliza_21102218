package com.NisrinaNurhaliza.PBO.Pertemuan4;

public class Main_Nisrina {

    public static void main(String[] args) {

        Manager_Nisrina manager = new Manager_Nisrina();
        Pegawai_Nisrina pegawai = new Pegawai_Nisrina();

        manager.nip  = 21102218;
        manager.nama = "Nisrina Nurhaliza";

        pegawai.nip  = 21101976;
        pegawai.nama = "Bella Hadid";

        manager.showInfo();
        manager.extraInfo();
        manager.bonus(1000000);

        //manager.bonus();

        pegawai.showInfo();
        pegawai.extraInfo();
    }
}
