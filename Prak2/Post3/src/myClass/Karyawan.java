package myClass;

public class Karyawan {
    private String nama;
    private long gaji;
    private long bonus;
    private int lamaKerja;

    public Karyawan(long gaji){
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public long getGaji() {
        return gaji;
    }

    public void setGaji(long gaji) {
        this.gaji = gaji;
    }

    public long getBonus() {
        return bonus;
    }

    public void setBonus(long bonus) {
        this.bonus = bonus;
    }

    public long hitungTotalBonus(int lamaKerja) {
        this.lamaKerja = lamaKerja;

        return this.bonus * lamaKerja;
    }

    public long hitungGajiTotal() {
        return gaji + hitungTotalBonus(lamaKerja);
    }

    
}
