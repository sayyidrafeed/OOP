public class MainPerpustakaan {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();

        // Menambahkan buku ke koleksi
        Buku b1 = new Buku("BK001", "Clean Code", "Robert C. Martin");
        Buku b2 = new Buku("BK002", "Design Patterns", "Gang of Four");
        perpustakaan.tambahBuku(b1);
        perpustakaan.tambahBuku(b2);

        // Memproses peminjaman
        int total = perpustakaan.hitungPinjaman(b1);
        System.out.println("Total Peminjaman Saat Ini: " + total);

        // Menampilkan laporan akhir
        perpustakaan.tampilLaporan();
    }
}