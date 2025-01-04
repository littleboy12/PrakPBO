package classApp;

public abstract class Person {
    protected String nama;

    public Person(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract void tampilkanInfo();
}
