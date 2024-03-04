package cekribuan;

import java.util.Scanner;

public class CekRibuan {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Memasukkan tiga bilangan
        System.out.print("Masukkan bilangan ke-1: ");
        int bilangan1 = scanner.nextInt();

        System.out.print("Masukkan bilangan ke-2: ");
        int bilangan2 = scanner.nextInt();

        System.out.print("Masukkan bilangan ke-3: ");
        int bilangan3 = scanner.nextInt();

        // Mengecek apakah ketiga bilangan adalah ribuan
        if (isRibuan(bilangan1) && isRibuan(bilangan2) && isRibuan(bilangan3)) {
            System.out.println("Ketiga bilangan adalah ribuan");
        } else if ((isRibuan(bilangan1) && isRibuan(bilangan2)) ||
                   (isRibuan(bilangan1) && isRibuan(bilangan3)) ||
                   (isRibuan(bilangan2) && isRibuan(bilangan3))) {
            System.out.println("Dua bilangan di antaranya adalah ribuan");
        } else if (isRibuan(bilangan1)) {
            System.out.println("Bilangan ke-1 adalah ribuan");
        } else if (isRibuan(bilangan2)) {
            System.out.println("Bilangan ke-2 adalah ribuan");
        } else if (isRibuan(bilangan3)) {
            System.out.println("Bilangan ke-3 adalah ribuan");
        } else {
            System.out.println("Tidak ada bilangan yang ribuan");
        }

        scanner.close();
    }

    // Fungsi untuk mengecek apakah sebuah bilangan adalah ribuan
    public static boolean isRibuan(int bilangan) {
        return bilangan >= 1000 && bilangan <= 9999;
    }
}