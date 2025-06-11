package com.juaracoding.tnsujian1jf.ujian1;

import java.util.Scanner;

/*
    Deskripsi:
    Buat sebuah program Java yang menyimpan harga tiket untuk 5 film yang berbeda dalam sebuah array.
    Kemudian, hitung dan cetak total harga tiket dari semua film tersebut.
    Contoh Output:
    Harga tiket film 1: 50000
    Harga tiket film 2: 60000
    Harga tiket film 3: 70000
    Harga tiket film 4: 80000
    Harga tiket film 5: 90000
    Total harga tiket: 350000

 */
public class Soal5 {
    public static void main(String[] args) {
        int [] hargaTiket = new int [5];
        int totalHargaTiket = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < hargaTiket.length; i++) {
            System.out.print("Harga tiket film " + (i + 1) + ":");
            hargaTiket[i] = sc.nextInt();
            totalHargaTiket += hargaTiket[i];
        }


        System.out.println("Total harga tiket: " + totalHargaTiket);
    }
}
