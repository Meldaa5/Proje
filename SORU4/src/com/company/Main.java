package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int a;
        Scanner scanner= new Scanner(System.in);
        System.out.println("lütfen a için bir sayı giriniz");
        a = scanner.nextInt();

        int b;
        System.out.println("lütfen b için bir sayı giriniz");
        b= scanner.nextInt();
        if (a>50 && b>50){
            int c= a +b ;
            System.out.println(c);
        }else
            System.out.println("bu sayılar uygun değil");
    }
}
