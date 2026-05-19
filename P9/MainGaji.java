abstract class Pegawai {
    public abstract long hitungGaji();
}

class PegawaiTetap extends Pegawai {
    private long gajiBulanan;

    public PegawaiTetap(long gajiBulanan) {
        this.gajiBulanan = gajiBulanan;
    }

    @Override
    public long hitungGaji() {
        return gajiBulanan;
    }
}

class PegawaiHarian extends Pegawai {
    private long upahPerJam;
    private long jumlahJam;

    public PegawaiHarian(long upahPerJam, long jumlahJam) {
        this.upahPerJam = upahPerJam;
        this.jumlahJam = jumlahJam;
    }

    @Override
    public long hitungGaji() {
        return upahPerJam * jumlahJam;
    }
}

public class MainGaji {
    public static void main(String[] args) {
        Pegawai Rafee = new PegawaiTetap(50000000);
        Pegawai Djamil = new PegawaiHarian(50000, 800);

        System.out.println("Gaji Rafee: Rp" + formatNumber(Rafee.hitungGaji()));
        System.out.println("Gaji Djamil: Rp" + formatNumber(Djamil.hitungGaji()));
    }

    public static String formatNumber(long number) {
        return String.format("%,d", number).replace(",", ".");
    }
}