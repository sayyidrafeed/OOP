class Peminjaman {
    private Buku buku;
    private int jumlahPinjam;

    public Peminjaman(Buku buku) {
        this.buku = buku;
        this.jumlahPinjam = 0;
    }

    // Method non-void
    public int hitungTotalPinjaman() {
        jumlahPinjam++;
        buku.setStatus("Dipinjam");
        return jumlahPinjam;
    }

    public Buku getBuku() { return buku; }
}