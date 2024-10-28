package myClass;

public class Mahasiswa {
    protected String nama;
    protected String nim;
    protected int semester;

    public Mahasiswa() {}

    public Mahasiswa(String nama, String nim, int semester) {
        this.nama = nama;
        this.nim = nim;
        this.semester = semester;
    }

    public void infoMahasiswa() {
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("NIM: " + nim);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
}