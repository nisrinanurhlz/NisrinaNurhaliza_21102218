package com.NisrinaNurhaliza.PBO.Pertemuan4;

public class Manager_Nisrina extends Pegawai_Nisrina {

    public void bonus(int bonus){
        System.out.println("Pegawai dengan nama " + nama +
                " Dengan NIP : (" + nip + ") Mendapatkan Bonus : " + bonus);
    }
    public void extraInfo(){
        System.out.println("Jabatan Pegawai : Manager");
    }
    public void bonus(){
        System.out.println("Error : Harap Masukkan Jumlah Bonusnya!");
    }
}
