class Kendaraan {
    void kecepatanMaks() {
        System.out.println("Kecepatan tidak diketahui");
    }
}

class Mobil extends Kendaraan {
    @Override
    void kecepatanMaks() {
        System.out.println("Kecepatan maksimal mobil: 200 km/h");
    }
}

class Motor extends Kendaraan {
    @Override
    void kecepatanMaks() {
        System.out.println("Kecepatan maksimal motor: 150 km/h");
    }
}

public class DemoKendaraan {
    public static void main(String[] args) {
        Kendaraan k1 = new Mobil();
        Kendaraan k2 = new Motor();

        k1.kecepatanMaks(); 
        k2.kecepatanMaks();
    }
}