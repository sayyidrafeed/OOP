class Buku {
    String judul, penulis;
    boolean isTersedia;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.isTersedia = true;
    }

    public void pinjamBuku() {
        if (isTersedia) {
            isTersedia = false;
            System.out.println("Buku '" + judul + "' berhasil dipinjam.");
        } else {
            System.out.println("Maaf, buku '" + judul + "' sedang tidak tersedia.");
        }
    }

    public void kembalikanBuku() {
        isTersedia = true;
        System.out.println("Buku '" + judul + "' telah dikembalikan.");
    }

    public void tampilInfo() {
        String status = isTersedia ? "Tersedia" : "Dipinjam";
        System.out.println("Judul: " + judul + ", Penulis: " + penulis + " [" + status + "]");
    }
}

public class MainPerpustakaan {
    public static void main(String[] args) {
        Buku b1 = new Buku("Laskar Pelangi", "Andrea Hirata");
        Buku b2 = new Buku("Matematika Dasar", "Dr. Andi");

        b1.tampilInfo();
        b1.pinjamBuku();
        b1.pinjamBuku(); 
        b2.tampilInfo();
    }
}