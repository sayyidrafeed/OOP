public class MainAkunBank {
    public static void main(String[] args) {
        AkunBank akun1 = new AkunBank(1000.0);
        System.out.println("Saldo awal: " + akun1.getSaldo());

        akun1.deposit(500.0);
        System.out.println("Saldo setelah deposit: " + akun1.getSaldo());
        akun1.withdraw(200.0);
        System.out.println("Saldo setelah penarikan: " + akun1.getSaldo());
        akun1.withdraw(1500.0);
        System.out.println("Saldo setelah penarikan gagal: " + akun1.getSaldo());
    }
}
