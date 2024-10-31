package myClass;

public class Penyihir extends Karakter {
    private int hp = 10;
    private boolean kondisi = true;

    public Penyihir(String nama) {
        super(nama);
    }

    @Override
    public void menyerang() {
        if (this.hp != 0) {
            System.out.println("--Mengurangi HP penyihir Sebanyak 5--");
            
            diserang();
            System.out.println("---KAMU DI SERANG---STATUS HP KAMU TERISA " + this.hp + "HP");
        } else {
            this.kondisi = false;
            System.out.println("---KAMU TEWASSS---");
        }
    }

    @Override
    public void diserang() {
        if (this.hp != 0) {
            this.hp -= 5;
        } else {
            this.kondisi = false;
            System.out.println("---PENYIHIR TEWASSS---");
        }
    }

    @Override
    public boolean kondisi() {
        return this.kondisi;
    }


    @Override
    public void healing() {
        if (this.hp != 0) {
            this.hp += 10;
            System.out.println("---KAMU DI HEALING---STATUS HP KAMU MENAJADI " + this.hp + "HP");
        } else {
            System.out.println("---KAMU TEWASSS---");
        }
    }
}
