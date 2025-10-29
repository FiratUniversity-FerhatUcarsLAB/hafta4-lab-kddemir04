/*
 * Ad Soyad: [Abdulkadir Demir]
 * Ogrenci No: [240541007]
 * Tarih: [29/10/2025]
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */

import java.util.Scanner;

public class OgrenciBilgi {

    public static void main(String[] args) {

        Scanner tara = new  Scanner(System.in);

        System.out.println("===ÖĞRENCİ BİLGİ SİSTEMİ===\n");

        //girdiler
        System.out.println("Adınızı giriniz");//Adını alıyorum
        String ad = tara.nextLine();

        System.out.println("\nSoyadınızı giriniz");//Soyadını alıyorum
        String soyad = tara.nextLine();

        System.out.println("\nÖğrenci numaranızı giriniz");//Öğrenci numarasını alıyorum
        int ogrenciNo = tara.nextInt();

        System.out.println("\nYaşınızı giriniz");//Yaşını alıyorum
        int yas =  tara.nextInt();

        System.out.println("\nOrtalamanızı giriniz");//Ortalamasını alıyorum
        double gpa =  tara.nextDouble();

        //çıktılar
        System.out.println("\n===ÖĞRENCİ BİLGİ SİSTEMİ===");
        System.out.printf("Ad soyad: %s %s", ad, soyad);
        System.out.printf("\nÖğrenci no: %d", ogrenciNo);//decimal
        System.out.printf("\nYaş: %d", yas);
        System.out.printf("\nOrtalama: %.2f", gpa);

        tara.close();
    }
}
