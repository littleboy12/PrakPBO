package classApp;

public class Dosen extends Person implements AktivitasAkademik {
    private String nidn;
    private MataKuliah mataKuliah;

    public Dosen(String nama, String nidn) {
        super(nama);
        this.nidn = nidn;
    }

    public String getNidn() {
        return nidn;
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
            System.out.println("Dosen: " + nama + " (NIDN: " + nidn + ")");
            System.out.println("Mengajar Mata Kuliah: " + mataKuliah.getNama() + " (" + mataKuliah.getSks() + " SKS)");
        } else {
            System.out.println("Dosen: " + nama + " (NIDN: " + nidn + ")");
            System.out.println("Belum mengajar mata kuliah.");
        }
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Dosen: " + nama + " (NIDN: " + nidn + ")");
    }
}

