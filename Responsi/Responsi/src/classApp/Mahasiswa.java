package classApp;

public class Mahasiswa extends Person implements AktivitasAkademik {
    private String nim;
    private MataKuliah mataKuliah;

    public Mahasiswa(String nama, String nim) {
        super(nama);
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    @Override
    public void tambahMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public int hitungTotalSKS() {
        return mataKuliah != null ? mataKuliah.getSks() : 0;
    }

    @Override
    public void tampilkanMataKuliah() {
        if (mataKuliah != null) {
            System.out.println("Mahasiswa: " + nama + " (NIM: " + nim + ")");
            System.out.println("Mengambil Mata Kuliah: " + mataKuliah.getNama() + " (" + mataKuliah.getSks() + " SKS)");
        } else {
            System.out.println("Mahasiswa: " + nama + " (NIM: " + nim + ")");
            System.out.println("Belum mengambil mata kuliah.");
        }
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Mahasiswa: " + nama + " (NIM: " + nim + ")");
    }
}

