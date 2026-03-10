public class MainMhs {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Rafee", 20);
        mhs1.nim = 78;
        mhs1.semester = 4;
        mhs1.ipk = 3.9;
        mhs1.jurusan = "Sistem Informasi";
        mhs1.fakultas = "Ilmu Komputer";
        mhs1.universitas = "UPN Veteran Jakarta";
        mhs1.alamat = "Jl. Contoh No. 123, Kota ABC";
        mhs1.email = "2410512078@mahasiswa.upnvj.ac.id";
        mhs1.tampilkanInfo();
    }
}