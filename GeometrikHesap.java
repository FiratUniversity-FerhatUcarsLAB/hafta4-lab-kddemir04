/*
 * Ad Soyad: [Abdulkadir Demir]
 * Ogrenci No: [240541007]
 * Tarih: [29/10/2025]
 * Aciklama: Gorev 2 - Geometrik Hesaplayici
 * 
 * Bu program kullanicidan yaricap bilgisini alir ve
 * duzenli bir formatta ekrana dairenin alanini cevresini capini ve kurenin hacmini ve yuzey alanini yazdirir.
 */

import java.util.Scanner;

public class GeometrikHesap{

  public static void main(String[] args){

 float PI = 3.14f;//constant ı tanımladım

         //yarıçap bilgisini alıyorum
        Scanner tara = new Scanner(System.in);
        System.out.println("Dairenin yarıçapını (cm) giriniz");
        double r = tara.nextDouble();

         //yapılacak işlemler
        double alan = PI * Math.pow(r, 2);
        double cevre = 2 * PI * r;
        double cap = 2 * r;
        double vKure = (4.0/3.0) * PI * Math.pow(r, 3);
        double aKure = 4 * PI * Math.pow(r, 2);

         //çıktılar
        System.out.println("===GEOMETRIK HESAPLAYICI===");
        System.out.println("--------------------------");
        System.out.printf("\nDaire alanı: %.2f cm²", alan);
        System.out.printf("\nDaire çevresi: %.2f cm", cevre);
        System.out.printf("\nDaire çapı: %.2f cm", cap);
        System.out.printf("\nKüre hacmi: %.2f cm³", vKure);
        System.out.printf("\nKüre yüzey alanı: %.2f cm²", aKure);

    tara.close();

  }

}

