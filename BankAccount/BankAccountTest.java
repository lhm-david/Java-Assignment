public class BankAccountTest {
    public static void main (String[] args){
        BankAccount newCustomer = new BankAccount();
        newCustomer.openAccount();
        newCustomer.depositChecking(234.99);
        System.out.println(newCustomer.getCheckingBalance());
        newCustomer.depositSavings(123.99);
        System.out.println(newCustomer.getSavingsBalance());
        newCustomer.withdraw(100.99);
    }
}