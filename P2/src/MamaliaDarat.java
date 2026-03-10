public class MamaliaDarat {
    public static void main(String[] args) {
        String suaraHewan;
        System.out.println("\nDEMO KELAS, METHOD DAN DATA");
        System.out.println("---------------------------\n");
        
        Kucing pussy = new Kucing();
        suaraHewan = pussy.mengeong();
        System.out.println("Pussy: " + suaraHewan);
        
        Anjing doggy = new Anjing();
        suaraHewan = doggy.menggonggong();
        System.out.println("Doggy: " + suaraHewan);
        
        Macan sikumbang = new Macan();
        suaraHewan = sikumbang.mengaum();
        System.out.println("Si Kumbang: " + suaraHewan);
    }
}