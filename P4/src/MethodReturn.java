public class MethodReturn {
    public static String nama = "Rafee";

    public static String getNama() {
        return nama;
    }

    public static int hitungUmur(int lahir, int sekarang) {
        return sekarang - lahir;
    }

    public static void main(String[] args) {
        String namaSaya = getNama();
        System.out.println("Nama saya: " + namaSaya);

        int umur = hitungUmur(2006, 2026);
        System.out.println("Umur saya: " + umur);
    }
}
