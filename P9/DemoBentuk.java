abstract class Bentuk {
    public abstract double hitungLuas();
}

class Lingkaran extends Bentuk {
    private double radius;

    public Lingkaran(double radius) {
        this.radius = radius;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * radius * radius;
    }
}

class PersegiPanjang extends Bentuk {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }
}

public class DemoBentuk {
    public static void main(String[] args) {
        Bentuk b1 = new Lingkaran(7);
        Bentuk b2 = new PersegiPanjang(5, 3);

        System.out.println("Luas Lingkaran: " + b1.hitungLuas());
        System.out.println("Luas Persegi Panjang: " + b2.hitungLuas());
    }
}