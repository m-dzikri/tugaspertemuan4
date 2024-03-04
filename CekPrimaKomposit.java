package cekprimakomposit;

import java.util.Scanner;

public class CekPrimaKomposit {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan batas awal: ");
        int batasAwal = scanner.nextInt();

        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = scanner.nextInt();

        // Memastikan input valid sebelum melakukan pengecekan bilangan prima dan komposit
        if (isValidInput(batasAwal, batasAkhir)) {
            System.out.println("Bilangan prima " + batasAwal + " s.d. " + batasAkhir + " adalah: ");
            printPrimes(batasAwal, batasAkhir);

            System.out.println("\nBilangan komposit " + batasAwal + " s.d.1 " + batasAkhir + " adalah: ");
            printComposites(batasAwal, batasAkhir);
        } else {
            System.out.println("Input tidak valid. Pastikan batasAwal >= 1 dan batasAkhir <= 100.");
        }
    }

    // Fungsi untuk memeriksa validitas input
    private static boolean isValidInput(int batasAwal, int batasAkhir) {
        return batasAwal >= 1 && batasAkhir <= 100 && batasAwal <= batasAkhir;
    }

    // Fungsi untuk memeriksa apakah suatu bilangan adalah prima
    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Fungsi untuk mencetak bilangan prima dalam rentang tertentu
    private static void printPrimes(int batasAwal, int batasAkhir) {
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Fungsi untuk mencetak bilangan komposit dalam rentang tertentu
    private static void printComposites(int batasAwal, int batasAkhir) {
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (!isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}