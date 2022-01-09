package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// GİRİLEN SAYILARLA GEOMETRİK ALAN HESABI YAPINIZ.
      Scanner s=new Scanner (System.in) ;
        System.out.println("altıgenin bir kenar uzunluğunu giriniz");
        int kenar=s.nextInt();
        System.out.println("dairenin yarıçapınnı giriniz:");
        int yarıçap=s .nextInt();
        System.out.println("altıenin alanı="+6*((kenar *kenar *Math.sqrt(3))/4));
        System.out.println("Dairenin Alanı="+Math.PI*yarıçap*yarıçap);



    }
}
