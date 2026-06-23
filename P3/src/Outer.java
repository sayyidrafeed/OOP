class Outer {
    private String pesan = "Hello dari Rafee!";
    private int angka = 2026;

    class Inner {
        void tampilPesan() {
            System.out.println(pesan);
            System.out.println(angka);
        }
    }
}

public class NonStaticInnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.tampilPesan();
    }
}