import myClass.Barang;

public class App {
    public static void main(String[] args) throws Exception {
        Barang barang1 = new Barang(5000);


        // barang1.setNamaBarang("Maninan");
        // barang1.setJumlah(3);
        // long total = barang1.getHarga() * barang1.getJumlah();
        // System.out.println("Total Harga : " + total);

        barang1.setNamaBarang("KULIAH");
        barang1.setJumlah(3);

        if (barang1.getJumlah() > 2) barang1.setHarga(10000);

        long total = barang1.getHarga() * barang1.getJumlah();
        System.out.println("Total Harga : " + total);
                
    }


        
}
