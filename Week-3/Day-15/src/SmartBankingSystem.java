// Smart Banking System demonstrating all Inner Class types

class SmartBank {

    private String bankName;
    private static int totalAccounts = 0;

    // Constructor
    SmartBank(String bankName) {
        this.bankName = bankName;
    }

    // ================================
    // 1️⃣ MEMBER INNER CLASS
    // ================================
    class Account {
        private String accountHolder;
        private double balance;

        Account(String accountHolder, double balance) {
            this.accountHolder = accountHolder;
            this.balance = balance;
            totalAccounts++;
        }

        void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }

        void withdraw(double amount) {
            if (TransactionValidator.validate(balance, amount)) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance!");
            }
        }

        void showBalance() {
            System.out.println("Account Holder: " + accountHolder);
            System.out.println("Bank: " + bankName);
            System.out.println("Balance: " + balance);
        }

        // ================================
        // 3️⃣ LOCAL INNER CLASS
        // ================================
        void calculateInterest(double rate) {

            class InterestCalculator {
                void compute() {
                    double interest = balance * rate / 100;
                    balance += interest;
                    System.out.println("Interest added: " + interest);
                }
            }

            InterestCalculator ic = new InterestCalculator();
            ic.compute();
        }
    }

    // ================================
    // 2️⃣ STATIC NESTED CLASS
    // ================================
    static class TransactionValidator {

        static boolean validate(double balance, double withdrawAmount) {
            return withdrawAmount <= balance;
        }
    }

    static void showTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }
}


// ================================
// 4️⃣ ANONYMOUS INNER CLASS
// ================================

interface Notification {
    void send(String message);
}


// ================================
// MAIN CLASS
// ================================

public class SmartBankingSystem {

    public static void main(String[] args) {

        SmartBank bank = new SmartBank("Virtusa Bank");

        // Creating Member Inner Class Object
        SmartBank.Account account = bank.new Account("Saaqib", 10000);

        account.showBalance();
        account.deposit(2000);
        account.withdraw(5000);
        account.calculateInterest(5);
        account.showBalance();

        SmartBank.showTotalAccounts();

        // Anonymous Inner Class Implementation
        Notification smsNotification = new Notification() {
            @Override
            public void send(String message) {
                System.out.println("SMS Notification: " + message);
            }
        };

        smsNotification.send("Transaction Completed Successfully!");
    }
}