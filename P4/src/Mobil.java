public class Mobil {
    String merk;

    Mobil(String merk) {
        this.merk = merk;
    }

    void tampilMerk() {
        System.out.println("Merk mobil: " + merk);
    }
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota");
        Mobil mobil2 = new Mobil("Honda");

        mobil1.tampilMerk();
        mobil2.tampilMerk();
    }
}
