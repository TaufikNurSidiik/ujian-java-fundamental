package com.juaracoding.tnsujian1jf.ujian1;

import java.util.Scanner;

/*
    Deskripsi:
    Buat sebuah program Java yang meminta pengguna memasukkan nama film yang ingin mereka tonton.
    Simpan nama-nama film ini dalam array dan cetak ke layar menggunakan perulangan.

    Contoh Output:
    Daftar film bioskop
    Masukkan nama film 1: Avengers: Endgame
    Masukkan nama film 2: Spiderman: Homecoming
    Masukkan nama film 3: Black Panther
    Masukkan nama film 4: Thor: Ragnarok
    Masukkan nama film 5: Doctor Strange
    Film yang  ingin ditonton:
    1. Avengers: Endgame
    2. Spiderman: Homecoming
    3. Black Panther
    4. Thor: Ragnarok
    5. Doctor Strange
 */
public class Soal4 {
    public static void main(String[] args) {
        String [] namaFilm = new String [5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Film yang ingin ditonton: ");

        for (int i = 0; i < namaFilm.length; i++) {
            System.out.print("Masukkan nama film " + (i+1) + ": ");
            namaFilm[i] = sc.nextLine();
        }

        System.out.println("Film yang ingin ditonton: ");
        for (int i = 0; i < namaFilm.length; i++) {
            System.out.println((i+1) + ". " + namaFilm[i]);
        }
    }
}
