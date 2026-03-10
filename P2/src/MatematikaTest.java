public class MatematikaTest {
    public static void main(String[] args) {

        Matematika m = new Matematika();

        System.out.println("Penjumlahan: " + m.jumlah(10, 5));
        System.out.println("Pengurangan: " + m.kurang(10, 5));
        System.out.println("Perkalian: " + m.kali(10, 5));
        System.out.println("Pembagian: " + m.bagi(10, 5));
        System.out.println("Modulus: " + m.modulus(10, 5));
        System.out.println("Pangkat: " + m.pangkat(2, 3));
        System.out.println("Akar: " + m.akar(16));
        System.out.println("Logaritma: " + m.logaritma(10));
    }
}