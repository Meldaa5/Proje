package com.company;
import java. util.Scanner;
    // bugünü pazartesi kabul edip kullanıcıdan alınan gün sayısı kadar sonra o günün haftanın kaçıncı günü olduğunu veren program ?


         public class Main {
            public static void main (String []args) {
                int pazartesi = 1;
                int gün;
                int günler;
                Scanner kullanıcı = new Scanner(System.in);
                System.out.println("sayı gir pikaçhu");
                int sayı = kullanıcı.nextInt();
                if (1 <= sayı && sayı < 365) {
                    günler = pazartesi + sayı;
                    gün = günler % 7;

                    System.out.println("bugün günlerden pazartesi " + sayı + " gün sonra, haftanın " + gün + ". günüdür ");


                } else {
                    System.out.println("yanlış değer girdin pikaçhu");
                }

            }
            }

