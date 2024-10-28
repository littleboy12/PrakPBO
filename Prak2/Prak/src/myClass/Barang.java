package myClass;

/**
 * Barang
 */
public class Barang {
    public String namaBarang = "NoName";
    public int jumlah = 0;
    public long harga = 0;

    public Barang(int harga) {
        this.harga = harga;
    }

    public Barang(String namaBarang, int jumlah, long harga) {
        this.namaBarang = namaBarang;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public long getHarga() {
        return harga;
    }

    public void setHarga(long harga) {
        this.harga = harga;
    }

    
    public void cetak() {
        System.out.println("Nama : " + getNamaBarang() + "\n" +
                "Harga : " + harga + "\n" +
                "Jumalah : " + jumlah + "\n");
    }
}