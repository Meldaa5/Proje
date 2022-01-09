package com.company;

public class Main {

    public static void main(String[] args) {
        //  VERİLEN DİZİNİN İÇİDE ARANIN OLUP OLMADIĞINI BULMA
        int aranacak =4;
        int[] sayılar=new int []{1,2,3,5,6};
        boolean varmı = false;
        for (int sayı :sayılar){
            if(sayı==aranacak){
                varmı=true;
                break;
            }
        }    if (varmı){
            System.out.println("sayı mevcut");
        } else {
            System.out.println("sayı mevcut değil");
        }

    }

}
