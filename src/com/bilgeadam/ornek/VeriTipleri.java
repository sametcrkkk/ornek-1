package com.bilgeadam.ornek;

public class VeriTipleri {

    public static void main(String[] args) {

        int yas = 20;

        char cinsiyet = 'E';

        String sehir = "Ankara";


        if (yas < 35) {
            System.out.println("Genç");
        } else {
            System.out.println("Yaşlı");
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "-Merhaba");
        }

        System.out.println("Şehir index:" + sehir.indexOf("A"));

        if (sehir.indexOf("A") >= 0)
            System.out.println("İçinde A harfi var!");



        if (sehir.indexOf("k") > 0) {
            System.out.println("İçinde k harfi var!");
        }

        String deneme = "Samet Çoruk";

        System.out.println(deneme.substring(5));

    }


}
