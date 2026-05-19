class Kalkulator {
    public int tambah(int a, int b) {
        return a + b;
    }
    public double tambah(double a, double b) {
        return a + b;
    }
    public int tambah(int a, int b, int c) {
        return a + b + c;
    }
    
    // Overloaded methods for kurang (subtraction)
    public int kurang(int a, int b) {
        return a - b;
    }
    public double kurang(double a, double b) {
        return a - b;
    }
    public int kurang(int a, int b, int c) {
        return a - b - c;
    }
    
    // Overloaded methods for kali (multiplication)
    public int kali(int a, int b) {
        return a * b;
    }
    public double kali(double a, double b) {
        return a * b;
    }
    public int kali(int a, int b, int c) {
        return a * b * c;
    }
    
    // Overloaded methods for bagi (division)
    public int bagi(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
    public double bagi(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
    public int bagi(int a, int b, int c) {
        if (b == 0 || c == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b / c;
    }
}

public class Main {
    public static void main(String[] args) {
        Kalkulator kalk = new Kalkulator();
        
        // Testing tambah
        System.out.println("Tambah:");
        System.out.println("2 + 3 = " + kalk.tambah(2, 3));
        System.out.println("2.5 + 3.7 = " + kalk.tambah(2.5, 3.7));
        System.out.println("2 + 3 + 4 = " + kalk.tambah(2, 3, 4));
        
        // Testing kurang
        System.out.println("\nKurang:");
        System.out.println("10 - 4 = " + kalk.kurang(10, 4));
        System.out.println("10.5 - 4.2 = " + kalk.kurang(10.5, 4.2));
        System.out.println("20 - 5 - 3 = " + kalk.kurang(20, 5, 3));
        
        // Testing kali
        System.out.println("\nKali:");
        System.out.println("6 * 7 = " + kalk.kali(6, 7));
        System.out.println("2.5 * 4.0 = " + kalk.kali(2.5, 4.0));
        System.out.println("2 * 3 * 4 = " + kalk.kali(2, 3, 4));
        
        // Testing bagi
        System.out.println("\nBagi:");
        System.out.println("15 / 3 = " + kalk.bagi(15, 3));
        System.out.println("12.5 / 2.5 = " + kalk.bagi(12.5, 2.5));
        System.out.println("48 / 2 / 4 = " + kalk.bagi(48, 2, 4));
        
        // Testing division by zero (uncomment to see exception)
        // System.out.println(kalk.bagi(10, 0));
    }
}