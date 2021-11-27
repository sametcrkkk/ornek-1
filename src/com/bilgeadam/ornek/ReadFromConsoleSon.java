package com.bilgeadam.ornek;

import java.util.Scanner;

public class ReadFromConsoleSon {

    String isim;
    int yas;

    Scanner sc = new Scanner(System.in);

    public String isimSor()
    {
        System.out.println("İsminizi giriniz:");
        isim = sc.nextLine();

        return isim;
    }

    public int yasSor()
    {
        System.out.println("Yaşınızı giriniz:");
        yas = sc.nextInt();

        return yas;
    }

    public void sonucYazdir()
    {
        if (yas <= 35)
            System.out.println("Yolun 1. yarısındasın" + isim);
        else
            System.out.println("Yolun 2. yarısındasın" + isim);
    }





    public static void main(String[] args) {

    }




}
