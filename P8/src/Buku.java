class Buku {
    private String idBuku;
    private String judul;
    private String penulis;
    private String status;

    public Buku(String idBuku, String judul, String penulis) {
        this.idBuku = idBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.status = "Tersedia"; 
    }

    public String getIdBuku() { return idBuku; }
    public String getJudul() { return judul; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    // Method void
    public void tampilInfo() {
        System.out.println("[" + idBuku + "] " + judul + " - " + penulis + " | Status: " + status);
    }
}