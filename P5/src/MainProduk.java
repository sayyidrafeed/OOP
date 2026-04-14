public class MainProduk {
    public static void main(String[] args) {
        Produk produk1 = new Produk("Laptop", 15000000, 10);
        System.out.println("Nama Produk: " + produk1.getNamaProduk());
        System.out.println("Harga: " + produk1.getHarga());
        System.out.println("Stok: " + produk1.getStok());

        produk1.tambahStok(12);
        produk1.setHarga(241051207);
        System.out.println("Setelah perubahan - Harga: " + produk1.getHarga());
        System.out.println("Setelah perubahan - Stok: " + produk1.getStok());
        System.out.println("Pengurangan stok berhasil: " + produk1.kurangiStok(3));
        System.out.println("Sisa stok: " + produk1.getStok());
        System.out.println("Total harga untuk 2 produk: " + produk1.hitungTotalHarga(2));
        System.out.println(produk1.deskripsiProduk());
    }
}
