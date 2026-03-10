public class MamaliaDarat {
    public static void main(String[] args) {
        Anjing anjing = new Anjing();
        System.out.println(anjing.menggonggong());
        System.out.println(anjing.makan());
        System.out.println(anjing.tidur());

        Kucing kucing = new Kucing();
        System.out.println(kucing.mengeong());
        System.out.println(kucing.makan());
        System.out.println(kucing.berkelahi());
      
        Macan macan = new Macan();
        System.out.println(macan.mengaum());
        System.out.println(macan.berlari());
        System.out.println(macan.menerkam());
    }
}