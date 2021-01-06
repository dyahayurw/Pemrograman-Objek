/*
Suit kertas, batu, gunting.
 */

import java.util.Scanner;
import java.util.Random;
public class kertas_batu_gunting {
    public static String komputer(){
        Random number = new Random();
        int random = number.nextInt(3);
        String [] words = {"batu", "kertas", "gunting"};
        return words[random];
    }

    static void Seri(String pemain,String komputer){
        System.out.printf("\nPemain: %s", pemain);
        System.out.printf("\nKomputer: %s", komputer);
        System.out.print("\n\nPermainan seri!");
    }

    static void Kertas(String komputer){
        if(komputer.equals("batu")){
            System.out.print("\nPemain: kertas");
            System.out.printf("\nkomputer: %s", komputer);
            System.out.print("\n\nPemain menang!");
        } 
        else if(komputer.equals("gunting")) {
            System.out.print("\nPemain: kertas");
            System.out.printf("\nKomputer : %s", komputer);
            System.out.print("\n\nKomputer menang!");
        }
    }

    static void Batu(String komputer){
        if(komputer.equals("gunting")){
            System.out.print("\nPemain: batu");
            System.out.printf("\nKomputer: %s", komputer);
            System.out.print("\n\nPemain menang!");
        } 
        else if(komputer.equals("kertas")){
            System.out.print("\nPemain: batu");
            System.out.printf("\nKomputer: %s", komputer);
            System.out.print("\n\nKomputer menang!");
        }
    }

    static void Gunting(String komputer){
        if(komputer.equals("batu")){
            System.out.print("\nPemain: gunting");
            System.out.printf("\nKomputer: %s", komputer);
            System.out.print("\n\nKomputer menang!");
        } 
        else if(komputer.equals("kertas")){
            System.out.print("\nPemain: gunting");
            System.out.printf("\nKomputer: %s", komputer);
            System.out.print("\n\nPemain menang!");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Suit Kertas, Batu, Gunting\n");
        System.out.print("=-=-=-=-=-=-=-=-=-=-=-=-=-=\n\n");
        System.out.print("Pilih 'batu', 'kertas, atau 'gunting'!\n\n");
        System.out.print("Masukkan pilihan: \n");
        String choice = sc.next().toLowerCase();
        String Komputer = komputer();
            if(choice.equals(Komputer)){
                Seri(choice, Komputer);
            } 
            else if(choice.equals("batu")){
                Batu(Komputer);
            } 
            else if(choice.equals("kertas")){
                Kertas(Komputer);
            } 
            else if(choice.equals("gunting")){
                Gunting(Komputer);
            } 
            else {
                System.out.println("Pastikan pilihanmu benar! ");
            }
    }
}
