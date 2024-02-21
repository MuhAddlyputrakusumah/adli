/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan_ukl_full;
import java.util.Scanner;
/**
 *
 * @author ADDLY
 */
public class Latihan_ukl_full {

    public static void main(String[] args) {
   Scanner kuliah = new Scanner(System.in);
        System.out.println(" Soal Seleksi Kondisi Tentang Kuliah");
   String ulang;
            String[] nama_user = {"Mira","Nina","Oemar","Pena"};
            String[] alamt = {"Sawojajar","Kedung Kandang","Ijen","Dinoyo"};
            int[] id_user = {1,2,3,4};
            String[] jalur = {"SBMPTN","SNMPTN","Mandiri"};
            String[] kat_gol = {"A","B","C"};
            String[] spp = {"500 Ribu","1 Juta","2 Juta","3 Juta"};
              System.out.print("Masukkan ID Anda : ");
            int ID = kuliah.nextInt();
            System.out.print("Masukkan Pendapatan Anda : ");
            int income = kuliah.nextInt();
            System.out.print("Jumlah SPP yang akan dibayar bulan ini : ");
            int SPP = kuliah.nextInt();
            switch (ID) {
                case 1: for (int i = 0; i < ID; i++) {
                    System.out.println("ID : "+id_user[i]);
                    System.out.println("Nama 3: "+nama_user[i]);
                    System.out.println("Jalur : "+jalur[i]);
                    System.out.println("Alamat : "+alamt[i]);
                    System.out.println("=================================");
                } if (income <2000000) {
                    System.out.println("Golongan : "+kat_gol[0]);
                    System.out.println("SPP yang harus dibayar adalah : "+spp[0]);
                    int hitung_spp = SPP-500000;
                    System.out.println("Sisa Bayaran anda : "+hitung_spp);
                } else if (income >=2000000 && income<=10000000) {
                    System.out.println("Golongan : "+kat_gol[1]);
                    System.out.println("SPP yang harus dibayar : "+spp[1]);
                    int hitung_spp = SPP-1000000;
                    System.out.println("Sisa Bayaran anda : "+hitung_spp);
                } else if (income >10000000) {
                    System.out.println("Golongan : "+kat_gol[2]);
                    System.out.println("SPP yang harus dibayar adalah : "+spp[2]);
                    int hitung_spp = SPP-2000000;
                    System.out.println("Sisa Bayaran anda : "+hitung_spp);
                } break;

                case 2: for (int i = 1; i < ID; i++) {
                    System.out.println("ID : "+id_user[i]);
                    System.out.println("Nama : "+nama_user[i]);
                    System.out.println("Jalur : "+jalur[i]);
                    System.out.println("Alamat : "+alamt[i]);
                    System.out.println("=================================");
                } if (income <2000000) {
                    System.out.println("Golongan : "+kat_gol[0]);
                    System.out.println("SPP yang harus dibayar adalah : "+spp[0]);
                    int hitung_spp = SPP-500000;
                    System.out.println("Sisa Bayaran anda : "+hitung_spp);
                } else if (income >=2000000 && income<=10000000) {
                    System.out.println("Golongan : "+kat_gol[1]);
                    System.out.println("SPP yang harus dibayar : "+spp[1]);
                    int hitung_spp = SPP-1000000;
                    System.out.println("Sisa Bayaran anda : "+hitung_spp);
                } else if (income >10000000) {
                    System.out.println("Golongan : "+kat_gol[2]);
                    System.out.println("SPP yang harus dibayar adalah : "+spp[2]);
                    int hitung_spp = SPP - 2000000;
                    System.out.println("Sisa Bayaran anda : "+hitung_spp);
                } break;

                case 3: for (int i = 2; i < ID; i++) {
                    System.out.println("ID : "+id_user[i]);
                    System.out.println("Nama : "+nama_user[i]);
                    System.out.println("Jalur : "+jalur[i]);
                    System.out.println("Alamat : "+alamt[i]);
                    System.out.println("=================================");
                } if (income <2000000) {
                    System.out.println("Golongan : "+kat_gol[0]);
                    System.out.println("SPP yang harus dibayar adalah : "+spp[0]);
                    int hitung_spp = SPP-500000;
                    System.out.println("Sisa Bayaran anda : "+hitung_spp);
                } else if (income >=2000000 && income<=10000000) {
                    System.out.println("Golongan : "+kat_gol[1]);
                    System.out.println("SPP yang harus dibayar : "+spp[1]);
                    int hitung_spp = SPP-1000000;
                    System.out.println("Sisa Bayaran anda : "+hitung_spp);
                } else if (income >10000000) {
                    System.out.println("Golongan : "+kat_gol[2]);
                    System.out.println("SPP yang harus dibayar adalah : "+spp[3]);
                    int hitung_spp = SPP-3000000;
                    System.out.println("Sisa Bayaran anda : "+hitung_spp);
                } break;
                
                case 4: for (int i = 3; i < ID; i++) {
                    System.out.println("ID : "+id_user[i]);
                    System.out.println("Nama : "+nama_user[i]);
                    System.out.println("Jalur : "+jalur[i-3]);
                    System.out.println("Alamat : "+alamt[i]);
                    System.out.println("=================================");
                } if (income <2000000) {
                    System.out.println("Golongan : "+kat_gol[0]);
                    System.out.println("SPP yang harus dibayar adalah : "+spp[0]);
                    int hitung_spp = SPP-500000;
                    System.out.println("Sisa Bayaran anda : "+hitung_spp);
                } else if (income >=2000000 && income<=10000000) {
                    System.out.println("Golongan : "+kat_gol[1]);
                    System.out.println("SPP yang harus dibayar : "+spp[1]);
                    int hitung_spp = SPP-1000000;
                    System.out.println("Sisa Bayaran anda : "+hitung_spp);
                } else if (income >10000000) {
                    System.out.println("Golongan : "+kat_gol[2]);
                    System.out.println("SPP yang harus dibayar adalah : "+spp[2]);
                    int hitung_spp = SPP-2000000;
                    System.out.println("Sisa Bayaran anda : "+hitung_spp);
                } break;
            }
            System.out.println("=====================Selesai=======================");
            ulang = kuliah.next();    
        
        System.out.println("\n");
        System.out.println("Soal Seleksi Kondisi Tentang Jalan Tol");
         Scanner TOL = new Scanner(System.in);
            String looping;
             
                System.out.println("ASAL : ");
        System.out.println("1.Dupak");
        System.out.println("2.Waru");
        System.out.println("3.Sidoarjo");
        System.out.println("4.Porong");
        System.out.println("5.Kejapanan");
         System.out.print("Masukkan Asal : ");
         int asal = TOL.nextInt();
         System.out.println();
         System.out.println("TUJUAN : ");
         System.out.println("1.Waru");
        System.out.println("2.Sidoarjo");
        System.out.println("3.Porong");
        System.out.println("4.Kejapanan");
        System.out.println("5.Gempol");
        System.out.print("Masukkan Tujuan : ");
        int tujuan = TOL.nextInt();
         System.out.println();
         System.out.println("GOLONGAN : ");
         System.out.println("1. Sedan, Jeep, Pick-up");
         System.out.println("2. Truk dengan 2 sumbu roda");
         System.out.println("3. Truk dengan 3 sumbu roda");
         System.out.print("Masukkan Golongan : ");
         int golongan = TOL.nextInt();
         switch (asal) {
            case 1: if (tujuan == 1)
            if (golongan == 1) {
                System.out.println("Tagihan anda : Rp.5000");
            } else if (golongan == 2 || golongan == 3) {
                System.out.println("Tagihan anda : Rp.8000");
            } break;

            case 2: if (tujuan == 2)
            if (golongan == 1) {
                System.out.println("Tagihan anda : Rp.6000");
            } else if (golongan == 2 || golongan == 3) {
                System.out.println("Tagihan anda : Rp.9000");
            }
            if (tujuan == 3)
            if (golongan == 1) {
                System.out.println("Tagihan anda : Rp.9000");
            } else if (golongan == 2 || golongan == 3) {
                System.out.println("Tagihan anda : Rp. 14.000");
            } break;
            
            case 3: if (tujuan == 1)
            if (golongan == 1) {
                System.out.println("Tagihan anda : Rp. 6000");
            } else if (golongan == 2 || golongan == 3) {
                System.out.println("Tagihan anda : Rp. 9000");
            } if (tujuan == 3)
            if (golongan == 1) {
                System.out.println("Tagihan anda : Rp. 5.500");
            } else if (golongan == 2 || golongan == 3) {
                System.out.println("Tagihan anda : Rp. 8.500");
            } break;

            case 4: if (tujuan == 1 )
            if (golongan == 1) {
                System.out.println("Tagihan anda : Rp. 9000");
            } else if (golongan == 2 || golongan == 3) {
                System.out.println("Tagihan anda : Rp. 14.000");
            } if (tujuan == 2)
            if (golongan == 1) {
               System.out.println("Tagihan anda : Rp. 5.500");
            } else if (golongan == 2 || golongan == 3) {
               System.out.println("Tagihan anda : Rp. 8.500");
            } if (tujuan == 4) 
            if (golongan == 1) {
                System.out.println("Tagihan anda : Rp. 6000");
            } else if (golongan == 2 || golongan == 3) {
                System.out.println("Tagihan anda : Rp. 8.500");
            } break;

            case 5: if (tujuan == 5) 
            if (golongan == 1) {
                System.out.println("Tagihan anda : Rp. 3000");
            } else if (golongan == 2 || golongan == 3) {
                System.out.println("Tagihan anda : Rp. 5000");
            } break;
            default: System.out.println("ID is not detected or is not valid.");
         }
         System.out.println("==============Selesai======================");
         
           
        
        
        
        
        
    }
}
