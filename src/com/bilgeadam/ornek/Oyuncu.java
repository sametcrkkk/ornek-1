package com.bilgeadam.ornek;

public class Oyuncu {
    //static tanımlanırsa class veriable'dır
    //bir obje değeri değiştirise
    //diğer objelşerde değişen değeri görür.
    //static demezsek instance veriable' dır
    //Her obje değişkelerin ilk değeriyle başlar.
    //Örnek, int ise sıfır değeriyle başlar her obje için
    //bir objenin değişkende yaptığı değişikliği
    private static int sayac;

    public int getSayac() {
        return sayac;
    }

    public void setSayac(int sayac) {
        this.sayac = sayac;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    private int no;
    private String ad;
    private String soyad;

    public Oyuncu() {
        sayac = sayac + 1;
    }
}
