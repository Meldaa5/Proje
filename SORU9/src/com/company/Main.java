package com.company;
import java.util.Scanner;
public class Main {
// KULANICIDAN ÖNCE CİNSİYETİNİ ALINIZ SONRA YAKTIĞI KALORİSİNİ HESAPLAYINIZ
    public static void main(String[] args) {

                Scanner kullanıcı=new Scanner(System.in);
                System.out.println("cinsiyetinizi girin");
                String cinsiyet=kullanıcı.nextLine();
                int adımUzunluğu;
                System.out.println("adım sayınızı giriniz");
                int adımSayısı=kullanıcı.nextInt();
                if(cinsiyet.equals("kadın")){
                    adımUzunluğu = 30;
                }
                else{
                    adımUzunluğu=45;
                }
                double kalori = adımUzunluğu * adımSayısı;
                System.out.println("kalori"+kalori);

            }

        }
