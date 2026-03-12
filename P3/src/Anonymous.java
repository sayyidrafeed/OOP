class Hewan {
    void suara() {
        System.out.println("Hewan mengeluarkan suara...");
    }
}

public class Anonymous {
    public static void main(String[] args) {
        Hewan kuda = new Hewan() {
            @Override
            void suara() {
                System.out.println("Neigh! (override dari anonymous inner classnya hewan)");
            }
        };
        kuda.suara();
    }
}