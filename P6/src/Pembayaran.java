public class Pembayaran {
    double jumlah;

    public Pembayaran(double jumlah) {
        this.jumlah = jumlah;
    }

    public void prosesPembayaran() {
        System.out.println("Pembayaran sebesar Rp." + jumlah + " sedang diproses...");
    }
}
