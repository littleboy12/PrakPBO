package myClass;

public class MahasiswaTransfer extends Mahasiswa{
    public MahasiswaTransfer() {
        super();
    }

    public MahasiswaTransfer(String nama, String nim, int semester) {
        super(nama, nim, semester);
    }

    @Override
    public void infoMahasiswa() {
        super.infoMahasiswa();
        System.out.println("Status: Mahasiswa Transfer");
        this.cekMatakuliah();
    }

    public void cekMatakuliah () {
        System.out.println("Mata Kuliah yang dapat dipelajari:");
        System.out.println("1. PWD\n2. PBO\n3. PMESIN");
        
    }

}
