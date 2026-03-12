class Example {
    static int count = 0;
    final String name;   

    public Example(String name) {
        this.name = name;
        count++;
    }
}

public class MainExample {
    public static void main(String[] args) {
        Example obj1 = new Example("Rafee");
        Example obj2 = new Example("Budi");

        System.out.println("Total objek yang ada: " + Example.count);
        System.out.println("Nama objek pertamah: " + obj1.name);
        System.out.println("Nama objek keduah: " + obj2.name);
    }
}