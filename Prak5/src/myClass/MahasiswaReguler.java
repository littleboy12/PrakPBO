package myClass;

public class MahasiswaReguler extends Mahasiswa{

    public MahasiswaReguler() {
        super();
    }

    public MahasiswaReguler(String nama, String nim, int semester) {
        super(nama, nim, semester);
    }

    @Override
    public void infoMahasiswa() {
        super.infoMahasiswa();
        System.out.println("Status: Mahasiswa Reguler");
        this.cekMatakuliah();
    }

    public void cekMatakuliah () {
        System.out.println("Mata Kuliah yang dapat dipelajari:");
        if (semester == 1) {
            System.out.println("1. DDP\n2. DSK\n3. Logika");
        } 
        if (semester == 2) {
            System.out.println("1. ALPRO\n2. PWEB");
        } 
        if (semester == 3) {
            System.out.println("1. PBO");
        } 
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
}
