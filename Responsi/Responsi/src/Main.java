// RESPONSI_222_AGUS SUGENG_

import java.util.Scanner;

import classApp.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Dosen dosen = null;
        Mahasiswa mahasiswa = null;
        MataKuliah mataKuliah = null;

        while (true) {
            try {
                System.out.println("\nMenu:");
                System.out.println("1. Tambah Dosen");
                System.out.println("2. Tambah Mahasiswa");
                System.out.println("3. Tambah Mata Kuliah");
                System.out.println("4. Tampilkan Data Mahasiswa");
                System.out.println("5. Tampilkan Data Dosen");
                System.out.println("6. Hitung Total SKS Mahasiswa");
                System.out.println("7. Hitung Total SKS Dosen");
                System.out.println("8. Keluar");
                System.out.print("Pilih menu: ");
                int pilihan = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (pilihan) {
                    case 1:
                        System.out.print("Nama Dosen: ");
                        String namaDosen = scanner.nextLine();
                        System.out.print("NIDN Dosen: ");
                        String nidn = scanner.nextLine();
                        dosen = new Dosen(namaDosen, nidn);
                        System.out.println("Dosen berhasil ditambahkan.");
                        break;

                    case 2:
                        System.out.print("Nama Mahasiswa: ");
                        String namaMahasiswa = scanner.nextLine();
                        System.out.print("NIM Mahasiswa: ");
                        String nim = scanner.nextLine();
                        mahasiswa = new Mahasiswa(namaMahasiswa, nim);
                        System.out.println("Mahasiswa berhasil ditambahkan.");
                        break;

                    case 3:
                        if (dosen == null) {
                            throw new InvalidInputException("Dosen belum ditambahkan.");
                        }
                        System.out.print("Nama Mata Kuliah: ");
                        String namaMk = scanner.nextLine();
                        System.out.print("Jumlah SKS: ");
                        int sks = scanner.nextInt();
                        scanner.nextLine(); // Consume newline

                        mataKuliah = new MataKuliah(namaMk, sks, dosen);
                        dosen.tambahMataKuliah(mataKuliah);

                        if (mahasiswa != null) {
                            mahasiswa.tambahMataKuliah(mataKuliah);
                            System.out.println("Mata kuliah berhasil ditambahkan ke mahasiswa.");
                        }
                        break;

                    case 4:
                        if (mahasiswa != null) {
                            mahasiswa.tampilkanMataKuliah();
                        } else {
                            System.out.println("Mahasiswa belum ditambahkan.");
                        }
                        break;

                    case 5:
                        if (dosen != null) {
                            dosen.tampilkanMataKuliah();
                        } else {
                            System.out.println("Dosen belum ditambahkan.");
                        }
                        break;

                    case 6:
                        if (mahasiswa != null) {
                            System.out.println("Total SKS yang diambil oleh " + mahasiswa.getNama() + ": " + mahasiswa.hitungTotalSKS());
                        } else {
                            System.out.println("Mahasiswa belum ditambahkan.");
                        }
                        break;

                    case 7:
                        if (dosen != null) {
                            System.out.println("Total SKS yang diajarkan oleh " + dosen.getNama() + ": " + dosen.hitungTotalSKS());
                        } else {
                            System.out.println("Dosen belum ditambahkan.");
                        }
                        break;

                    case 8:
                        System.out.println("Keluar dari program...");
                        scanner.close();
                        return;

                    default:
                        throw new InvalidInputException("Pilihan menu tidak valid.");
                }
            } catch (InvalidInputException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Kesalahan input. Silakan coba lagi.");
                scanner.nextLine(); // Clear input buffer
            }
        }
    }
}

