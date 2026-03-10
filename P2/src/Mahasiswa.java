class Mahasiswa {
    String nama;
    int umur;

    Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}