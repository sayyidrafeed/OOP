class ProductCategory {
    public static final int PULSA_ID = 101;
    public static final int VOUCHER_ID = 102;
    public static final int GAME_ID = 103;
}

class Product {
    private int categoryId;
    public Product(int categoryId) { this.categoryId = categoryId; }

    public String getCategoryName() {
        switch (categoryId) {
            case ProductCategory.PULSA_ID: return "Pulsa";
            case ProductCategory.VOUCHER_ID: return "Voucher";
            case ProductCategory.GAME_ID: return "Game";
            default: return "Unknown";
        }
    }
}

public class MainProduct {
    public static void main(String[] args) {
        Product p = new Product(ProductCategory.PULSA_ID);
        System.out.println("Category Name: " + p.getCategoryName());
    }
}