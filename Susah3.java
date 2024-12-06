package UKL;

import java.util.Scanner;

public class Susah3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Meminta input jumlah elemen dan elemen array dari pengguna
        System.out.print("------------------------------\nMasukkan Jumlah Elemen Array : ");
        int jumlahElemen = input.nextInt();
        System.out.println("------------------------------");
        int[] array = new int[jumlahElemen];

        System.out.print("Masukkan Elemen Array : \n");
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Elemen ke-" + (i + 1) + " : ");
            array[i] = input.nextInt();
        }

        int elemenSeringMuncul = array[0];
        int jumlahSebanyak = 0;
        boolean semuaSama = true;

        // Perulangan untuk menghitung jumlah kemunculan tiap elemen
        for (int i = 0; i < jumlahElemen; i++) {
            int hitung = 0;

            for (int j = 0; j < jumlahElemen; j++) {
                if (array[i] == array[j]) {
                    hitung++;
                }
            }

            // Update elemen dengan jumlah tertinggi
            if (hitung > jumlahSebanyak) {
                elemenSeringMuncul = array[i];
                jumlahSebanyak = hitung;

            }
            // Cek apakah ada elemen yang berbeda frekuensi
            if (i > 0 && hitung != jumlahSebanyak) {
                semuaSama = false;

            }
        }
        // Output
        if (semuaSama) {
            System.out.println(
                    "------------------------------------------\nSemua elemen memiliki frekuensi yang sama\n------------------------------------------");
        } else {
            System.out.println(
                    "-------------------------------------------------\nElemen Sering Muncul adalah "
                            + elemenSeringMuncul
                            + " dan sebanyak " + jumlahSebanyak
                            + " kali\n-------------------------------------------------");
        }
        input.close();
    }
}