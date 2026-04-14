public class Restoran {
    public static void main(String[] args) {
        Makanan makanan1 = new Makanan("Ayam Goreng", 17000, true);
        System.out.println("Nama Makanan: " + makanan1.getNama());
        System.out.println("Harga: Rp. " + makanan1.getHarga());
        System.out.println("Apakah Spesial: " + makanan1.isSpesial());
    }    
}
