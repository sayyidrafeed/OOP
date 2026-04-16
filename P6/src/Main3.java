public class Main3 {
    public static void main(String[] args) {
        Motor motor = new Motor("Yamaha", true);
        Mobil mobil = new Mobil("Toyota", 4);

        mobil.jalan();
        mobil.infoMobil();

        motor.jalan();
        motor.infoMotor();
    }
}
