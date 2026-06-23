class Luar {
    static String pesan = "Ini pesan pakai Static Nested Class -Rafee";

    static class Dalam {
        void tampilkanPesan() {
            System.out.println(pesan);
        }
    }
}

public class StaticNestedClass {
    public static void main(String[] args) {
        Luar.Dalam nested = new Luar.Dalam();
        nested.tampilkanPesan();
    }
}