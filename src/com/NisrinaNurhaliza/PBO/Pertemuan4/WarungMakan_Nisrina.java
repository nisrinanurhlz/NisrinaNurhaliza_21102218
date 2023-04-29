package com.NisrinaNurhaliza.PBO.Pertemuan4;

public class WarungMakan_Nisrina {
    String no_telp;
    String nama_warung;
    String alamat;

    public void detailWarung(){
        System.out.println("====== WARUNG MAKAN SEDERHANA ALA NISRINA ======");
        System.out.println("Nama Warung Makan : " + nama_warung);
        System.out.println("Alamat            : " + alamat);
        System.out.println("No Telpon         : " + no_telp);
        System.out.println();
    }
    //Membuat Fungsi Cetak
    public void cekStock(Menu_Nisrina m) {
        if (m.no_makanan == 1) {
            System.out.println("Stock Nasi Goreng         : " + m.stock);

        } else if(m.no_makanan == 2) {
            System.out.println("Stock Nasi Goreng Spesial :" + m.stock);

        } else if(m.no_makanan == 3) {
            System.out.println("Stock Nasi Goreng Spesial + Telur " + m.stock);
        }
        System.out.println();

    }
    public void beliMakanan(Menu_Nisrina m, int jumlah) {
        if (jumlah >= m.stock){
            System.out.println("Mohon Maaf Stock Tidak Cukup");
            m.harga = 0;

        } else {
            System.out.println();
            System.out.println("====== Detail Pembelian Makanan ======");
            System.out.println();
            System.out.println("Nama Makanan  : " + m.nama_makanan);
            System.out.println("Harga Makanan : " + m.harga);
            System.out.println("Jumlah        : " + jumlah);
            m.harga = m.harga * jumlah;
            m.stock -= jumlah;
        }
    }

    //Getter and Setter
    public String getNo_telp() {

        return no_telp;
    }

    public void setNo_telp(String no_telp) {

        this.no_telp = no_telp;
    }

    public String getNama_warung() {

        return nama_warung;
    }

    public void setNama_warung(String nama_warung) {

        this.nama_warung = nama_warung;
    }

    public String getAlamat() {

        return alamat;
    }

    public void setAlamat(String alamat) {

        this.alamat = alamat;
    }
}
