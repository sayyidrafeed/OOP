public class Pertama {
    private int a = 10;

    protected void terproteksi() {
        System.out.println("Method ini hanya dapat diakses dalam kelas ini dan kelas turunannya.");
    }

    public void info() {
        System.out.println("a = " + a);
        System.out.println("Dipanggil pada: " + this.getClass());
    }
}
