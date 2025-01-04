package classApp;

public class MataKuliah {
    private String nama;
    private int sks;
    private Dosen dosenPengampu;

    public MataKuliah(String nama, int sks, Dosen dosenPengampu) {
        this.nama = nama;
        this.sks = sks;
        this.dosenPengampu = dosenPengampu;
    }

    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }

    public Dosen getDosenPengampu() {
        return dosenPengampu;
    }
}

