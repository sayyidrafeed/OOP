public class Makanan {
    private String nama;
    private double harga;
    private boolean isSpesial;

    public Makanan(String nama, double harga, boolean isSpesial) {
        this.nama = nama;
        this.harga = harga;
        this.isSpesial = isSpesial;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public boolean isSpesial() {
        return isSpesial;
    }
}
