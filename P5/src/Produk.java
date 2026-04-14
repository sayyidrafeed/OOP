public class Produk {
    private String namaProduk;
    private double harga;
    private int stok;

    public Produk(String namaProduk, double harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void setHarga(double hargaBaru) {
        if (hargaBaru > 0) {
            this.harga = hargaBaru;
        }
    }

    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            this.stok += jumlah;
        }
    }

    public boolean kurangiStok(int jumlah) {
        if (jumlah > 0 && jumlah <= stok) {
            this.stok -= jumlah;
            return true;
        } else {
            return false;
        }
    }

    public boolean cekStok(int jumlah) {
        return jumlah > 0 && jumlah <= stok;
    }

    public double hitungTotalHarga(int jumlah) {
        if (cekStok(jumlah)) {
            return harga * jumlah;
        } else {
            return -1; // Indikator stok tidak cukup
        }
    }

    public String deskripsiProduk() {
        return "Produk: " + namaProduk + ", Harga: " + harga + ", Stok: " + stok;
    }
}
