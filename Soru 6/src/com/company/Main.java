package com.company;

import java.util.Scanner;
//1 ile 100 arasındaki çift sayıların toplamlarının mükemmel sayı olup olmadığını bulan kod ?
public class Main {

    public static void main(String[] args) {

                int toplam=0;
                int sayı;
                Scanner scanner= new Scanner(System.in);
                System.out.println("lütfen sayı giriniz");
                sayı = scanner.nextInt();
                for (int i = 1; i < sayı; i++) {
                    if (sayı % i == 0) {
                        toplam = toplam + i;
                    }

                }
                if (toplam==sayı){
                    System.out.println(sayı+" sayısı mükemmel bir sayıdır");
                }else
                    System.out.println("mükemmel bir sayı değildir");
            }

        }

