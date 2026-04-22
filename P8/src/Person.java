class Person {
    protected String nama;
    protected int umur;

    public Person(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void tampilData() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}

class Employee extends Person {
    private String idKaryawan;

    public Employee(String nama, int umur, String idKaryawan) {
        super(nama, umur);
        this.idKaryawan = idKaryawan;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("ID Karyawan: " + idKaryawan);
    }
}