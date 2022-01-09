package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// GİRİLEN YILIN ARTIK YIL OLUP OLMADIĞINI BULAN ALGORİTMA ? 

        int yıl;
        Scanner scanner= new Scanner(System.in);
        System.out.println("lütfen bir yıl  giriniz");
        yıl = scanner.nextInt();
        if (yıl%4==0){
            System.out.println(yıl+"yılı artık bir yılddır");
        }else System.out.println(" artık bir yıl değildir");
    }
}
