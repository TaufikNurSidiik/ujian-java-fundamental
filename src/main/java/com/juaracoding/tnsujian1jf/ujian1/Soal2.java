package com.juaracoding.tnsujian1jf.ujian1;

import java.util.Scanner;

/*
    Deskripsi:
    Buat sebuah program Java yang meminta pengguna memasukkan nama film
    dan kemudian mengubah nama film tersebut menjadi huruf besar semua dan mencetaknya.
    Contoh Output:
    Masukkan nama film: Avengers: Endgame
    Nama film dalam huruf besar: AVENGERS: ENDGAME
 */
public class Soal2 {
    public static void main(String[] args) {
        String namaFilm;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama film: ");
        namaFilm = sc.nextLine();
        System.out.println("Nama film dalam huruf besar: " + namaFilm.toUpperCase());
    }
}
