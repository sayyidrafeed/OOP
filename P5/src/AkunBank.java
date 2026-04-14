public class AkunBank {
    private double saldo;

    public AkunBank(double saldoAwal) {
        this.saldo = saldoAwal;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposit(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Deposit berhasil: " + jumlah);
        } else {
            System.out.println("Jumlah deposit harus positif.");
        }
    }

    public void withdraw(double jumlah) {
        if (jumlah > 0) {
            if (saldo >= jumlah) {
                saldo -= jumlah;
                System.out.println("Penarikan berhasil: " + jumlah);
            } else {
                System.out.println("Saldo tidak cukup untuk penarikan.");
            }
        } else {
            System.out.println("Jumlah penarikan harus positif.");
        }
    }
}
