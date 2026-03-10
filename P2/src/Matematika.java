class Matematika {
    private double hasil;

    public double jumlah(double a, double b) {
        hasil = a + b;
        return hasil;
    }

    public double kurang(double a, double b) {
        hasil = a - b;
        return hasil;
    }

    public double kali(double a, double b) {
        hasil = a * b;
        return hasil;
    }

    public double bagi(double a, double b) {
        hasil = a / b;
        return hasil;
    }

    public int modulus(int a, int b) {
        int hasilModulus = a % b;
        return hasilModulus;
    }

    public double pangkat(double a, double b) {
        hasil = Math.pow(a, b);
        return hasil;
    }

    public double akar(double a) {
        hasil = Math.sqrt(a);
        return hasil;
    }

    public double logaritma(double a) {
        hasil = Math.log(a);
        return hasil;
    }
}