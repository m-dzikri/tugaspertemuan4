package polasegitiga;

import java.util.Scanner;

public class PolaSegitiga {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan nilai n
        System.out.print("Masukkan nilai n (1 - 1000): ");
        int n = scanner.nextInt();

        // Memeriksa apakah nilai n berada dalam rentang yang valid
        if (n >= 1 && n <= 1000) {
            // Loop pertama untuk mengatur baris
            for (int i = 1; i <= n; i++) {
                // Loop kedua untuk mencetak bintang pada setiap baris
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                // Pindah ke baris baru setelah mencetak bintang pada baris tertentu
                System.out.println();
            }
        } else {
            // Jika nilai n tidak valid, cetak pesan kesalahan
            System.out.println("Nilai n harus antara 1 s.d. 1000.");
        }

        // Menutup objek Scanner untuk mencegah memory leak
        scanner.close();
    }
}