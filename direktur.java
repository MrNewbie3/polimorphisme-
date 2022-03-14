package polimorfisNo3;

public class direktur {
}
class pegawai{
    String nama;
    int gaji;
    pegawai(String nm){
        this.nama = nm;
        System.out.println(nama);
    }

    public int Gaji() {
        return 0;
    }
}
class dir extends pegawai{
    private  static final int gajiDir = 100000;
    private static final int tunjangan = 50000;

    dir(String nm) {
        super(nm);
    }

    @Override
    public int Gaji() {
        return gajiDir;
    }

    public int getTunjangan() {
        return tunjangan;
    }
}
class staf extends pegawai{
    private static final int gajiStaf = 50000;
    private static final int bonusStaf = 10000;

    staf(String nm) {
        super(nm);
    }
    @Override
    public int Gaji() {
        return gajiStaf;
    }

    public static int getBonusStaf() {
        return bonusStaf;
    }
}
class pembayaranGaji{
    public int hitungGaji(pegawai peg){
        int uang = peg.Gaji();
        if (peg instanceof dir) {
            uang+=((dir)peg).getTunjangan();
        }
        if (peg instanceof staf)
            uang += ((staf)peg).getBonusStaf();

        return uang;
    }

    public static void main(String[] args) {
        pembayaranGaji pg = new pembayaranGaji();
        staf ali = new staf("Ali");
        dir tony = new dir("tony");
        System.out.println("Gaji staff = "+pg.hitungGaji(ali));
        System.out.println("Gaji direktur = "+pg.hitungGaji(tony));
    }
}
