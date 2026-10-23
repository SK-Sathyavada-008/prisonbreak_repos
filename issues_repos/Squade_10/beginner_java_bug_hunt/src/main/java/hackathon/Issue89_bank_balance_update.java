public class Issue89_bank_balance_update {

    public static void main(String[] args) {
        Account a = new Account(560);
        a.deposit(56);
        a.withdraw(32);
        System.out.println("Balance: " + a.balance);
    }

    static class Account {

        int balance;

        Account(int b) {
            balance = b;
        }

        void deposit(int n) {
            balance -= n;
        }

        void withdraw(int n) {
            balance -= n + 1;
        }
    }
}
