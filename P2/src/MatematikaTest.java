public class MatematikaTest {
    public static void main(String[] args) {
        double a = 100.0;
        double b = 3.0;
        double hasilJumlah, hasilKurang, hasilKali, hasilBagi;

        Matematika hitung = new Matematika();
        
        hasilJumlah = hitung.jumlah(a, b);
        hasilKurang = hitung.kurang(a, b);
        hasilKali = hitung.kali(a, b);
        hasilBagi = hitung.bagi(a, b);

        System.out.println("\nPROGRAM DEMO OPERASI MATEMATIKA");
        System.out.println("-------------------------------\n");
        System.out.println("Penjumlahan " + a + " + " + b + " = " + hasilJumlah);
        System.out.println("Pengurangan " + a + " - " + b + " = " + hasilKurang);
        System.out.println("Perkalian " + a + " x " + b + " = " + hasilKali);
        System.out.println("Pembagian " + a + " / " + b + " = " + hasilBagi);
    }
}