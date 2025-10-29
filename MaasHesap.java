/*
 * Ad Soyad: [Abdulkadir Demir]
 * Ogrenci No: [240541007]
 * Tarih: [29/10/2025]
 * Aciklama: Gorev 3 - Maas Hesaplama Sistemi
 * 
 * Bu program kullanicidan alinan maas ve calisma bilgilerine gore net maasi, kesintileri, mesai gelirini ve kazanc istatistiklerini
 * duzenli bir formatta ekrana yazdirir.
 */

import java.util.Scanner;

public class MaasHesap {

    public static void main(String[] args) {

        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;

        Scanner tara = new Scanner(System.in);

        System.out.println("===MAAŞ BORDROSU OLUŞTURUCU===");

        System.out.println("\nAdınızı giriniz");
        String ad = tara.nextLine();

        System.out.println("Soyadınızı giriniz");
        String soyad = tara.nextLine();

        System.out.println("Aylık brüt maaşınızı(TL) giriniz");
        double brutMaas = tara.nextDouble();

        System.out.println("Haftalık çalışma saatinizi giriniz");
        int haftalikSaat = tara.nextInt();

        System.out.println("Mesai saat sayısı(aylık): ");
        int mesaiSaat = tara.nextInt();

        //Gelirler
        double mesaiUcret = (brutMaas / 160) * mesaiSaat * 1.5;
        double topGelir = brutMaas + mesaiUcret;

        //Kesintiler
        double sgk = topGelir * SGK_ORANI;
        double gelirVergi = topGelir * GELIR_VERGISI_ORANI;
        double damgaVergi = topGelir * DAMGA_VERGISI_ORANI;
        double topKesinti = sgk + gelirVergi + damgaVergi;

        //Net Maaş
        double netMaas = topGelir - topKesinti;

        //Istatistikler
        double kesintiOrani = (topKesinti / topGelir) * 100;
        double netSaatlikKazanc = netMaas / 176;// 22 gün * 8 saat;
        double netGunlukKazanc = netMaas / 22;

        //Çıktı
        System.out.println("\n========================");
        System.out.println("\tMAAŞ BORDROSU");
        System.out.println("========================");
        System.out.printf("Çalışan: %s %s\n", ad, soyad);
        System.out.println("\nGELIRLER:");
        System.out.printf("\nBrüt maaş: %.2f TL",brutMaas);
        System.out.printf("\nMesai ücreti(8 saat): %.2f", mesaiUcret);
        System.out.printf("\nTOPLAM GELIR: %.2f TL",topGelir);
        System.out.println("\n---------------------------");

        System.out.println();

        System.out.println("\nKESINTILER:");
        System.out.printf("\nSGK Kesintisi: %.2f TL", sgk);
        System.out.printf("\nGelir Vergisi: %.2f TL", gelirVergi);
        System.out.printf("\nDamga vergisi: %.2f TL", damgaVergi);
        System.out.printf("\nTOPLAM KESINTI: %.2f TL", topKesinti);
        System.out.printf("\nNET MAAŞ: %.2f TL", netMaas);
        System.out.printf("\nKesinti Oranı: %.1f%%", kesintiOrani);
        System.out.printf("\nSaatlik net kazanç: %.2f TL", netSaatlikKazanc);
        System.out.printf("\nGünlük Net Kazanç: %.2f TL", netGunlukKazanc);

      tara.close();
    }
}

