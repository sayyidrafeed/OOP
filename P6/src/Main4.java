public class Main4 {
    public static void main(String[] args) {
        Pembayaran pembayaran1 = new PembayaranTunai(50000);
        Pembayaran pembayaran2 = new PembayaranKartu(150000, "1234-5678-9012-3456");
        Pembayaran pembayaran3 = new PembayaranEWallet(75000, "user123");

        pembayaran1.prosesPembayaran();
        pembayaran2.prosesPembayaran();
        pembayaran3.prosesPembayaran();
    }
}
