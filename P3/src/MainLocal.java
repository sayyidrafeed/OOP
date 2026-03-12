class LuarLocal {
    void tampilkan() {
        class LocalInner {
            void show() {
                System.out.println("Ini Local Inner Class di dalam method tampilkan() -Rafee");
            }
        }
        LocalInner local = new LocalInner();
        local.show();
    }
}

public class MainLocal {
    public static void main(String[] args) {
        LuarLocal obj = new LuarLocal();
        obj.tampilkan();
    }
}