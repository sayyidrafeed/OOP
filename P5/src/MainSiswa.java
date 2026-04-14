public class MainSiswa {
    public static void main(String[] args) {
        Siswa siswa1 = new Siswa("Andi", 15, 85.5);
        Siswa siswa2 = new Siswa("Budi", 16, 90.0);

        System.out.println("Nama: " + siswa1.getNama());
        System.out.println("Usia: " + siswa1.getUsia());
        System.out.println("Nilai: " + siswa1.getNilai());

        System.out.println("Nama: " + siswa2.getNama());
        System.out.println("Usia: " + siswa2.getUsia());
        System.out.println("Nilai: " + siswa2.getNilai());

        // Mengubah nilai siswa1
        siswa1.setNilai(88.0);
        System.out.println("Nilai baru untuk " + siswa1.getNama() + ": " + siswa1.getNilai());
    }
}
