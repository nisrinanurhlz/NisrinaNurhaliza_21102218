package com.NisrinaNurhaliza.PBO.Pertemuan3;

public class Koperasi_Nisrina {
    //Attribute
    String NamaBarang;
    int HargaSatuan;
    int JumlahBarang;
    int TotalHarga;

    //Constructor
    public void Koperasi_Nisrina () {}

    //Contructor Ber Parameter
    public Koperasi_Nisrina (String NamaBarang, int HargaSatuan, int JumlahBarang) {
        this.NamaBarang  = NamaBarang;
        this.HargaSatuan = HargaSatuan;
        this.JumlahBarang = JumlahBarang;
    }

    //Method
    public String getNamaBarang() {
        return NamaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        NamaBarang = namaBarang;
    }

    public int getHargaSatuan() {
        return HargaSatuan;
    }

    public void setHargaSatuan(int hargaSatuan) {
        HargaSatuan = hargaSatuan;
    }

    public int getJumlahBarang() {
        return JumlahBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        JumlahBarang = jumlahBarang;
    }

    public int getTotalHarga() {
        return TotalHarga;
    }

    public void setTotalHarga(int totalHarga) {
        TotalHarga = totalHarga;
    }

    public void showInfo() {
        System.out.println("Nama Barang   : " + NamaBarang);
        System.out.println("Harga Satuan  : " + HargaSatuan);
        System.out.println("Jumlah Barang : " + JumlahBarang);
        System.out.println("Total Harga   : " + TotalHarga);
        System.out.println();
    }
}
