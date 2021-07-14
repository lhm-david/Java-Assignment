public class BankAccountTest {
    public static void main (String[] args){
        BankAccount newCustomer1 = new BankAccount();
        BankAccount newCustomer2 = new BankAccount();
        newCustomer1.openAccount();
        newCustomer2.openAccount();
        newCustomer1.depositChecking(234.99);
        System.out.println(newCustomer1.getCheckingBalance());
        newCustomer1.depositSavings(123.99);
        System.out.println(newCustomer1.getSavingsBalance());
        newCustomer1.withdraw(100.99);
    }
}