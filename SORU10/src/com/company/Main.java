package com.company;

import java.util.Random;
import java.util.Scanner;
// kullanıcıdan sayı alınız 6 tahmin hakkı veriniz oyuncu tahmin sonuçlarını yönergeler izleerek yaklaşsın örn( çok yaklaştın veya uzaksın )
// kullanıcıa istediği zaman oyundan çıkabilme hakkı veriniz.
public class Main {
    public static void main(String[] args){
        short tahmin_hakkı=6;
        String message ="sayı tahmin oyununa Hoş Geldiniz\n"
                +"oyunumuzda tahmin edilecek sayı 0 ile 20 arasındadır ve 6 tahmin hakkınız bulunmaktadır\n"
                +"tahmin bitinnce oyun sonlanır.\n"
                +"ancak eğer isterseniz tekrar rastgele sayı atayarak oyunu tekrar başlatabilirsiniz.\n"
                +"oyun başladı.\n başarılar..."
                +"tahmini sayıyı giriniz";
        while (true){
            System.out.println(message);
            Random random=new Random();

            int tahmin_edilecek_sayı = random.nextInt(20);
            Scanner scanner = new Scanner(System.in);
            for ( int i = tahmin_hakkı;i>0;i--){
                int tahmin_edilen_sayi=scanner.nextInt();
                if(tahmin_edilecek_sayı==tahmin_edilen_sayi){
                    String message2="tebrikler sayıyı doğru tahmin ettiniz.\n"
                            +"Tekrar oynamak için 1'e çıkmak için 0'a basınız.";
                    System.out.println(message2);
                    int cevap= scanner.nextInt();
                    if(cevap==0){
                        System.out.println("çıkış yapılıyor...");
                        return;
                    }
                    else{
                        break;
                    }
                }
                else if (tahmin_edilecek_sayı!=tahmin_edilen_sayi)
                    System.out.println("hatalı bir tahmmin yaptınız."+" "+"kalan tahmin hakkınız:"+(i-1));
                if (i==1) {
                    String message3="tahmin hakkınız biitti\n"
                            +"tekrar oynamak için 1'e çıkmak için 0 'a basınız";
                    System.out.println(message3);
                    int cevap=scanner.nextInt();
                    if(cevap==0){
                        System.out.println("çıkış yapılıyor...");
                        return;
                    }
                    else{
                        break;
                    }
                }


                {

                    tahminOrani(tahmin_edilen_sayi, tahmin_edilecek_sayı);
                }
            }
        }
    }
    static void tahminOrani(int tahmin_edilen_sayi,int tahmin_edilecek_sayi){
        int f=tahmin_edilen_sayi-tahmin_edilecek_sayi;
        if(f<=0 && f>-2|| f>=0 && f<2){
            System.out.println("Sayıya çok yaklaştınız");

        }
        else if(f<=-2 && f>-4 || f>=2 &&f<4){

            System.out.println("Sayıya yaklaşıyorsunuz");

        }
        else if(f<=-4 &&f>-14 || f>=4 &&f< 14){
            System.out.println("Sayıdan uzaklaşıyorsunuz");
        }
        else if(f<=-15 && f>-19 || f>=15 && f<=19){
            System.out.println("Sayıdan çok uzaklaştınız");
        }
    }


}





