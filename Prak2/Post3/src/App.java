import java.util.Scanner;

import myClass.Karyawan;

public class App {
    public static void main(String[] args) throws Exception {
        Karyawan karyawan = new Karyawan(2000000);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Pilih: \n1. Baru \n2. Lama \nPilih : ");
        int pilih = scanner.nextInt();

        scanner.nextLine();

        if (pilih == 1) {
            System.out.print("Nama : ");
            String nama = scanner.nextLine();
            karyawan.setNama(nama);

            System.out.println("Data Karyawan : \nNama : " + karyawan.getNama() + "\nGaji : " + karyawan.getGaji());
        } else if (pilih == 2) {
            System.out.print("Nama : ");
            karyawan.setNama(scanner.nextLine());
            
            System.out.print("Bonus : ");
            karyawan.setBonus(scanner.nextLong());

            System.out.print("Lama Kerja : ");
            karyawan.hitungTotalBonus(scanner.nextInt());
            
            System.out.println("Data Karyawan : \nNama : " + karyawan.getNama() + "\nGaji : " + karyawan.hitungGajiTotal());

            
        }
    }
}
