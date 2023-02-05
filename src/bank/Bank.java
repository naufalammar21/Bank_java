/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author NAUFAL
 */
import java.util.Scanner;
public class Bank {

    /**
     * @param args the command line arguments
     */
    Scanner input = new Scanner(System.in);
            void welcome(){
        
        
        System.out.println("Selamat Datang di Bank Indonesia");
        System.out.println("");
        System.out.print("Input Nama anda : ");
        String nama = input.next();
        System.out.print("Input Pin Anda : ");
        int pin = input.nextInt();
        System.out.println("Nama anda : "+nama);
        System.out.println("Pin Anda : "+pin);
        
        if(pin==1111){
            Bank a = new Bank();
            a.menu();}
}
    void menu(){
        System.out.println("1. Simpan Uang");
        System.out.println("2. ambil uang");
        System.out.println("3. cek saldo");
        System.out.println("4. Transfer");
        System.out.println("5. ganti pin");
        System.out.println("");
        System.out.print("tentukan pilihan anda ");
        int pilih = input.nextInt();
       if(pilih==1){
           Bank my = new Bank();
           my.simpan();
           
       }
       else if(pilih==2){
           Bank my = new Bank();
           my.ambil(pilih);
       }
    }
    void simpan(){
        System.out.print("masukan nominal uang : ");
        int simpan = input.nextInt();
        int saldo=50000;
        int total = simpan+saldo;
        System.out.println("total saldo anda = "+total);
    }
    void ambil(int total){
        System.out.print("Berapa jumlah yang akan diambil? ");
        int ambil = input.nextInt();
        int saldo3=total-ambil;
        System.out.print(" uang anda : "+saldo3);
    }
    void transfer(int total){
        System.out.println("masukan nominal yang akan ditransfer = ");
        int nom = input.nextInt();
        int total2=total-nom;
        System.out.println("saldo anda saat ini = "+total2);
    }
    
    

public static void main(String[]args){
Bank ammar = new Bank();
ammar.menu();
}
}

