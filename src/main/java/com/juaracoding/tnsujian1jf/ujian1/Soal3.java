package com.juaracoding.tnsujian1jf.ujian1;

import java.util.Scanner;

/*
    Deskripsi:
    Buat sebuah program java yang menghitung total harga tiket berdasarkan jumlah tiket yang dibeli.
    Jika jumlah tiket lebih dari 5, berikan diskon 10%. Jika tidak, tidak ada diskon.
    Harga weekday 35.000 dan weekend 45.000
    Contoh output:
    Jumlah tiket: 6
    Total harga (dengan diskon): 270000
 */
public class Soal3 {
    public static void main(String[] args) {
        String hariPemesanan;
        int jumlahTiket;
        int totalhargaTiket = 0;
        int hargaTiketWeekday = 35000;
        int hargaTiketWeekend = 45000;

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan hari pemesanan tiket: ");
        hariPemesanan = sc.nextLine();
        System.out.print("Masukkan jumlah tiket yang akan dibeli: ");
        jumlahTiket = sc.nextInt();
        if (hariPemesanan.equalsIgnoreCase("Senin") || hariPemesanan.equalsIgnoreCase("Selasa") ||
                hariPemesanan.equalsIgnoreCase("Rabu") || hariPemesanan.equalsIgnoreCase("Kamis") ||
                hariPemesanan.equalsIgnoreCase("Jumat")) {
            totalhargaTiket = jumlahTiket * hargaTiketWeekday;
        } else if(hariPemesanan.equalsIgnoreCase("Sabtu") || hariPemesanan.equalsIgnoreCase("Minggu")) {
            totalhargaTiket = jumlahTiket * hargaTiketWeekend;
        }else {
            System.out.println("Data Input Invalid");
        };

        if (jumlahTiket > 5) {
            totalhargaTiket = (int) (totalhargaTiket - (totalhargaTiket * 0.1));
            System.out.println("Total Harga (dengan diskon): " + totalhargaTiket);
        }else{
            System.out.println("Total Harga: " + totalhargaTiket);
        }


    }
}
