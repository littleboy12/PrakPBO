import java.util.Scanner;

import myClass.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Pilih Kategori : \n1. Reguler\n2. Transfer\npilih : ");
        int pilih = inp.nextInt();
        inp.nextLine();

        Mahasiswa mahasiswa;
        
        if (pilih == 1) {
            mahasiswa = new MahasiswaReguler();
            
            System.out.print("Masukkan NIM : ");
            mahasiswa.setNim(inp.nextLine());
            System.out.print("Masukkan Nama : ");
            mahasiswa.setNama(inp.nextLine());
            System.out.print("Masukkan Semester : ");
            mahasiswa.setSemester(inp.nextInt());

            mahasiswa.infoMahasiswa();
            inp.nextLine();
        }


        if (pilih == 2) {
            mahasiswa = new MahasiswaTransfer();
            
            System.out.print("Masukkan NIM : ");
            mahasiswa.setNim(inp.nextLine());
            System.out.print("Masukkan Nama : ");
            mahasiswa.setNama(inp.nextLine());

            mahasiswa.infoMahasiswa();
        }

        
    }
}
