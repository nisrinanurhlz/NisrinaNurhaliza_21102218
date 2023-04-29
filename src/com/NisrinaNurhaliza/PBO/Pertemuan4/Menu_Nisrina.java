package com.NisrinaNurhaliza.PBO.Pertemuan4;

public class Menu_Nisrina extends WarungMakan_Nisrina {
    int stock;
    int harga;
    String nama_makanan;
    int no_makanan;

    //Fungsi untuk Menampilkan Menu
    public void detailMakanan() {
        System.out.println("No Makanan   : " + no_makanan);
        System.out.println("Nama Makanan : " + nama_makanan);
        System.out.println("Harga        : " + harga);
        System.out.println();
    }

    //Membuat Fungsi TotalHarga
    public void totalHarga() {
        System.out.println("Total Harga   : " + harga);
        System.out.println();
    }

    //Getter dan Setter

    public int getStock() {

        return stock;
    }

    public void setStock(int stock) {

        this.stock = stock;
    }

    public int getHarga() {

        return harga;
    }

    public void setHarga(int harga) {

        this.harga = harga;
    }

    public String getNama_makanan() {

        return nama_makanan;
    }

    public void setNama_makanan(String nama_makanan) {

        this.nama_makanan = nama_makanan;
    }

    public int getNo_makanan() {

        return no_makanan;
    }

    public void setNo_makanan(int no_makanan) {

        this.no_makanan = no_makanan;
    }
}
