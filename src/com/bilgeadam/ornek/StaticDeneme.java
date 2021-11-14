package  com.bilgeadam.ornek;

public class StaticDeneme {

    //Instance veriable
    int sayi1;

    //Class veriable - değişken static ise class veriable'dır.
    static int sayi2;

    public static void main(String[] args) {

        //static olmayan değişkene, static metoddan erişilemez.
        //Erişmek istiyorsak, class'ın kendi objesini
        //oluşturarak erişeceğiz

        //Local veriable'ı biz İntialize etmek zorundayız.
        //Yani ilk değer vermek zorundayız
        int sayi3=0;

        StaticDeneme sd = new StaticDeneme();

        System.out.println("Sayi1:"+ sd.sayi1);
        System.out.println("Sayı2:"+sayi2);
        System.out.println("Sayı3:"+sayi3);


    }




}
