package myClass;

public class Karakter {
    protected String nama;
    
    public Karakter(String nama) {
        this.nama = nama;
    }
    
    // Metode abstrak yang akan diimplementasikan oleh subclass
    public void menyerang(){}
    public void healing(){}
    public void diserang(){}
    public boolean kondisi(){
        return true;
    }

    
    
    public void infoKarakter() {
        System.out.println("Karakter: " + nama);
    }
}
