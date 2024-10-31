import java.util.Scanner;

import myClass.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Game Polymorphism!");
        System.out.print("Masukkan nama karakter Anda: ");
        String nama = scanner.nextLine();

        System.out.println("Pilih jenis karakter:");
        System.out.println("1. Prajurit");
        System.out.println("2. Penyihir");
        System.out.print("Pilihan Anda (1 atau 2): ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        // Membuat objek secara dinamis berdasarkan pilihan pengguna
        if (pilihan == 1) {
            Karakter prajurit = new Prajurit(nama);
            Karakter penyihir = new Penyihir(nama);
            while (true) {
                System.out.println("\n1. Serang\n2. Healing\nPilih Aksi : ");
                int pil2 = scanner.nextInt();
                if (pil2 == 1) {
                    if (penyihir.kondisi()) {
                        prajurit.menyerang();
                    }
                    if (prajurit.kondisi()) {
                        penyihir.diserang();
                    }
                } else if (pil2 == 2) {
                    prajurit.healing();
                } else if (pil2 > 2) {
                    break;
                }
            }

            prajurit.infoKarakter();
        } else if (pilihan == 2) {
            Karakter prajurit = new Prajurit(nama);
            Karakter penyihir = new Penyihir(nama);
            while (true) {
                System.out.println("\n1. Serang\n2. Healing\nPilih Aksi : ");
                int pil2 = scanner.nextInt();
                if (pil2 == 1) {
                    if (prajurit.kondisi()) {
                        penyihir.menyerang();
                    }
                    if (penyihir.kondisi()) {
                        prajurit.diserang();
                    }
                } else if (pil2 == 2) {
                    penyihir.healing();
                } else if (pil2 > 2) {
                    break;
                }
            }

            penyihir.infoKarakter();
        } else {
            System.out.println("Pilihan tidak valid. Program selesai.");

        }

        // Menampilkan informasi karakter dan melakukan aksi berdasarkan pilihan

        scanner.close();
    }
}
