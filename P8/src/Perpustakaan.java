import java.util.ArrayList;
import java.util.List;

class Perpustakaan {
    private List<Buku> daftarBuku;
    private int totalPinjaman;

    public Perpustakaan() {
        this.daftarBuku = new ArrayList<>();
        this.totalPinjaman = 0;
    }

    // Method void
    public void tambahBuku(Buku b) {
        daftarBuku.add(b);
        System.out.println("Buku \"" + b.getJudul() + "\" berhasil ditambahkan.");
    }

    // Method non-void
    public int hitungPinjaman(Buku b) {
        Peminjaman p = new Peminjaman(b);
        totalPinjaman += p.hitungTotalPinjaman();
        return totalPinjaman;
    }

    // Method void: menampilkan laporan keseluruhan
    public void tampilLaporan() {
        System.out.println("===== LAPORAN PERPUSTAKAAN =====");
        System.out.println("Jumlah Koleksi Buku: " + daftarBuku.size());
        System.out.println("Total Peminjaman   : " + totalPinjaman);
        System.out.println("--- Daftar Buku ---");
        for (Buku b : daftarBuku) {
            b.tampilInfo();
        }
    }
}