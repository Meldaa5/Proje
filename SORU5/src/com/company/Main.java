package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// GİRİLEN 3 BASAMAKLI BİR SAININ BASAMAKLARININ KÜPLERİ TOPLAMI SAYININ KENDİSİNE EŞİT OLUP OLMADIĞINI BULAN PROGRAM
        int sayı ;
        int toplam =0 ;
        Scanner scanner= new Scanner(System.in);
        System.out.println("lütfen 3 basamaklı bir sayı gir");
        sayı= scanner.nextInt();
        int fake = sayı ;
        while (sayı>9){
            int rakam =sayı %10 ;
            int küp = rakam*rakam*rakam;
            toplam=toplam+küp;
            sayı=sayı/10;

        } toplam= toplam+(sayı*sayı*sayı);
        if(toplam==fake){
            System.out.println("ikisi eşittir");

        } else
            System.out.println("ikisi eşit değildir");



    }
}
