class Luar {
    static String pesan = "Ini pesan dari Static Nested Class -Rafee";

    static class Dalam {
        void tampil() {
            System.out.println(pesan);
        }
    }
}

public class StaticNested {
    public static void main(String[] args) {
        Luar.Dalam nested = new Luar.Dalam();
        nested.tampil();
    }
}