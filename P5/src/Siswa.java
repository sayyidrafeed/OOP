public class Siswa {
    private String nama;
    private int usia;
    private double nilai;

    public Siswa(String nama, int usia, double nilai) {
        this.nama = nama;
        this.usia = usia;
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }

    public String setNama(String nama) {
        this.nama = nama;
        return nama;
    }

    public int getUsia() {
        return usia;
    }

    public int setUsia(int usia) {
        if (usia > 0) {
            this.usia = usia;
        }
        return usia;
    }

    public double getNilai() {
        return nilai;
    }

    public double setNilai(double nilai) {
        if (nilai >= 0 && nilai <= 100) {
            this.nilai = nilai;
        }
        return nilai;
    }
}
