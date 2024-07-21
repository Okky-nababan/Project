package org.example;

public class Mobil {
    String merk, warna, tipe;
    Integer kapasitasBensin;

    public Mobil(String merk, String warna, String tipe, Integer kapasitasBensin) {
        this.merk = merk;
        this.warna = warna;
        this.tipe = tipe;
        this.kapasitasBensin = kapasitasBensin;
    }

    public void gas(){
        System.out.println("Breeemm....");
    }
}
