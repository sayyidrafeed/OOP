import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SistemKRS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== SISTEM MANAJEMEN KRS ===");
            System.out.println("1. Lihat Semua Mata Kuliah");
            System.out.println("2. Tambah Mata Kuliah ke KRS");
            System.out.println("3. Hapus Mata Kuliah dari KRS");
            System.out.println("4. Tampilkan KRS Mahasiswa");
            System.out.println("5. Hitung Total SKS Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (pilihan) {
                case 1:
                    lihatMataKuliah();
                    break;
                case 2:
                    System.out.print("Masukkan NIM: ");
                    String nimTambah = scanner.nextLine();
                    System.out.print("Masukkan Kode MK: ");
                    String mkTambah = scanner.nextLine();
                    tambahKRS(nimTambah, mkTambah);
                    break;
                case 3:
                    System.out.print("Masukkan NIM: ");
                    String nimHapus = scanner.nextLine();
                    System.out.print("Masukkan Kode MK yang ingin dihapus: ");
                    String mkHapus = scanner.nextLine();
                    hapusKRS(nimHapus, mkHapus);
                    break;
                case 4:
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    String nimKRS = scanner.nextLine();
                    tampilkanKRS(nimKRS);
                    break;
                case 5:
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    String nimSKS = scanner.nextLine();
                    hitungTotalSKS(nimSKS);
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        scanner.close();
    }

    // Fitur 1: Melihat Semua Mata Kuliah
    private static void lihatMataKuliah() {
        String sql = "SELECT * FROM mata_kuliah";
        try (Connection conn = Koneksi.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("\n--- Daftar Mata Kuliah ---");
            while (rs.next()) {
                System.out.println(rs.getString("kode_mk") + " - " +
                        rs.getString("nama_mk") + " (" +
                        rs.getInt("sks") + " SKS)");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Fitur 2: Menambahkan Mata Kuliah ke KRS (Insert)
    private static void tambahKRS(String nim, String kodeMk) {
        String sql = "INSERT INTO krs (nim, kode_mk) VALUES (?, ?)";
        try (Connection conn = Koneksi.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nim);
            pstmt.setString(2, kodeMk);
            pstmt.executeUpdate();
            System.out.println("Berhasil menambahkan mata kuliah ke KRS!");
        } catch (Exception e) {
            System.out.println("Gagal menambahkan! Pastikan NIM dan Kode MK valid.");
        }
    }

    // Fitur 3: Menghapus Mata Kuliah dari KRS (Delete)
    private static void hapusKRS(String nim, String kodeMk) {
        String sql = "DELETE FROM krs WHERE nim = ? AND kode_mk = ?";
        try (Connection conn = Koneksi.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nim);
            pstmt.setString(2, kodeMk);
            int affected = pstmt.executeUpdate();
            if (affected > 0) {
                System.out.println("Mata kuliah berhasil dihapus dari KRS.");
            } else {
                System.out.println("Data tidak ditemukan.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Fitur 4: Menampilkan KRS Mahasiswa (Select + Join)
    private static void tampilkanKRS(String nim) {
        String sql = "SELECT m.nama, mk.kode_mk, mk.nama_mk, mk.sks " +
                "FROM krs k " +
                "JOIN mahasiswa m ON k.nim = m.nim " +
                "JOIN mata_kuliah mk ON k.kode_mk = mk.kode_mk " +
                "WHERE k.nim = ?";
        try (Connection conn = Koneksi.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nim);
            ResultSet rs = pstmt.executeQuery();

            System.out.println("\n--- KRS Mahasiswa ---");
            boolean hasData = false;
            while (rs.next()) {
                if (!hasData) {
                    System.out.println("Nama: " + rs.getString("nama"));
                    hasData = true;
                }
                System.out.println("- " + rs.getString("kode_mk") + " | " +
                        rs.getString("nama_mk") + " (" +
                        rs.getInt("sks") + " SKS)");
            }
            if (!hasData) {
                System.out.println("Belum ada mata kuliah yang diambil.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Fitur 5: Menghitung Total SKS Mahasiswa
    private static void hitungTotalSKS(String nim) {
        String sql = "SELECT SUM(mk.sks) AS total_sks " +
                "FROM krs k " +
                "JOIN mata_kuliah mk ON k.kode_mk = mk.kode_mk " +
                "WHERE k.nim = ?";
        try (Connection conn = Koneksi.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nim);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                int total = rs.getInt("total_sks");
                System.out.println("Total SKS yang diambil: " + total + " SKS");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}