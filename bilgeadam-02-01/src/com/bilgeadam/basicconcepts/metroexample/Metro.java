package com.bilgeadam.basicconcepts.metroexample;

import java.util.Scanner;

public class Metro {

    static Scanner scanner = new Scanner(System.in);
    static double bakiye = 0.0;

    public static void main(String[] args) {
        int secim = 0;

        do {
            System.out.println("1- Kart bakiyesini göster");
            System.out.println("2- Karta para yükle");
            System.out.println("3- Metroya bin");
            System.out.println("4- Sistemden çıkış");

            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    bakiyeGoster();
                    break;
                case 2:
                    kartaParaYukle();
                    break;
                case 3:
                    metroyaBin();
                    break;
                case 4:
                    sistemdenCikis();
                    break;
                default:
                    System.out.println("Seçim yanlış. Tekrar seçiniz!");
            }

        } while (secim != 4);
    }

    private static void sistemdenCikis() {
        System.exit(0);
    }

    private static void metroyaBin() {
        System.out.println("Abone durumunuzu seçiniz : \t\n1- İndirimli Bilet  \t\n2- Tam Bilet");
        int aboneSecim = scanner.nextInt();

        if (aboneSecim == 1) {
            System.out.println("İndirimli Bilet! Metroya Hoşgeldiniz!");
            if (bakiye < 3.50) {
                System.out.println("Yetersiz bakiye! Öncelikle para yükleyiniz!");
            } else {
                bakiye -= 3.50;
                System.out.println("Kalan " + bakiyeGoster());
            }
        } else if (aboneSecim == 2) {
            if (bakiye < 5.20) {
                System.out.println("Yetersiz bakiye! Öncelikle para yükleyiniz!");
            } else {
                System.out.println("Tam Bilet! Metroya Hoşgeldiniz!");
                bakiye -= 5.20;
            }
            System.out.println("Kalan " + bakiyeGoster());
        } else {
            System.out.println("Hatalı seçim. Tekrar deneyiniz!");
            metroyaBin();
        }
    }

    private static void kartaParaYukle() {
        System.out.println("Yüklemek istediğiniz miktarı giriniz: ");
        bakiye += scanner.nextDouble();
        bakiyeGoster();
    }

    private static String bakiyeGoster() {
        String bakiyeStr = "Bakiyeniz : " + bakiye + " TL.";
        System.out.println(bakiyeStr);
        return bakiyeStr;
    }

}
