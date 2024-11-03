/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.array1;

import java.util.Scanner;  // Import the Scanner class
import java.util.stream.*;  // Import the Scanner class

/**
 *
 * @author kinna
 */
public class kasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String belanja[] = new String[5];
        int harga[] = new int[5];
        int jumlah[] = new int[5];
        int total[] = new int[5];
        int sum = IntStream.of(total).sum();
        int pilih = 0, item = 0, jumlahinput;
        
        do {
            System.out.println("Kasir Toko Kita");
            System.out.println("1. Tas Ransel\t[Rp100000]");
            System.out.println("2. Sepatu\t[Rp150000]");
            System.out.println("3. Sandal\t[Rp25000 ]");
            System.out.println("4. Baju Tidur\t[Rp200000]");
            System.out.println("5. Jaket\t[Rp250000]");
            System.out.println("6. Selesai");
            System.out.print("Pilih : ");
            pilih = input.nextInt();
            switch(pilih){
                case 1:
                    if (item < belanja.length){
                        belanja[item] = "Tas";
                        harga[item] = 100000;
                        System.out.print("Jumlah : ");
                        jumlahinput = input.nextInt();
                        jumlah[item] = jumlahinput;
                        total[item] = harga[item] * jumlah[item];
                    } else System.out.println("Keranjang Penuh!");
                    break;
                case 2:
                    if (item < belanja.length){
                        belanja[item] = "Sepatu";
                        harga[item] = 150000;
                        System.out.print("Jumlah : ");
                        jumlahinput = input.nextInt();
                        jumlah[item] = jumlahinput;
                        total[item] = harga[item] * jumlah[item];
                    } else System.out.println("Keranjang Penuh!");
                    break;
                case 3:
                    if (item < belanja.length){
                        belanja[item] = "Sandal";
                        harga[item] = 25000;
                        System.out.print("Jumlah : ");
                        jumlahinput = input.nextInt();
                        jumlah[item] = jumlahinput;
                        total[item] = harga[item] * jumlah[item];
                    } else System.out.println("Keranjang Penuh!");
                    break;
                case 4:
                    if (item < belanja.length){
                        belanja[item] = "Baju";
                        harga[item] = 200000;
                        System.out.print("Jumlah : ");
                        jumlahinput = input.nextInt();
                        jumlah[item] = jumlahinput;
                        total[item] = harga[item] * jumlah[item];
                    } else System.out.println("Keranjang Penuh!");
                    break;
                case 5:
                    if (item < belanja.length){
                        belanja[item] = "Jaket";
                        harga[item] = 250000;
                        System.out.print("Jumlah : ");
                        jumlahinput = input.nextInt();
                        jumlah[item] = jumlahinput;
                        total[item] = harga[item] * jumlah[item];
                    } else System.out.println("Keranjang Penuh!");
                    break;
                case 6:
                    System.out.println("Daftar Belanjga");
                    for (int i = 0; i < item; i++) {
                        sum += total[i];
                        System.out.println((i+1) + "." + belanja[i] + "\t [Rp" + harga[i] + "]\t[" + jumlah[i] + "]\t[Rp" + total[i] + "]");
                    }
                    System.out.println("Grand Total : Rp" + sum);
                    break;
            }
            item++;
            if (item > 5) {
                System.out.println("Jumlah Item : " + item);
                break;
            }
        } while (pilih!=6);
    }
}
