class Mahasiswa {
    String nama;
    int umur;
    int nim;
    int semester;
    double ipk;
    String jurusan;
    String fakultas;
    String universitas;
    String alamat;
    String email;

    Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
        this.nim = 0;
        this.semester = 0;
        this.ipk = 0;
        this.jurusan = "";
        this.fakultas = "";
        this.universitas = "";
        this.alamat = "";
        this.email = "";
    }

    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("NIM: " + nim);
        System.out.println("Semester: " + semester);
        System.out.println("IPK: " + ipk);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Fakultas: " + fakultas);
        System.out.println("Universitas: " + universitas);
        System.out.println("Alamat: " + alamat);
        System.out.println("Email: " + email);
    }
}