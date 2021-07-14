import java.util.Random;
import java.util.ArrayList;

public class BankAccount{
    private String Accountnumber;
    private double checkingBalance;
    private double savingsBalance;
    static int numberOfAccounts;
    static double totalMoneyC;
    static double totalMoneyS;
    

    private String AccountNumber(){
        Random r = new Random();
        ArrayList<Integer> accountnumber = new ArrayList<Integer>();
        for (int i=0; i<10; i++) {
            int num = r.nextInt(10);
            accountnumber.add(num);
        }
        return accountnumber.toString();
    }

    public void openAccount() {
        this.Accountnumber = AccountNumber();
        totalMoneyC = checkingBalance;
        totalMoneyS = savingsBalance;
        numberOfAccounts++;
        System.out.println(AccountNumber());
        System.out.println(numberOfAccounts);
        System.out.println(totalMoneyC + " " + totalMoneyS);
    }

    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public void depositChecking(double money) {
        this.checkingBalance = this.checkingBalance + money;
    }

    public void depositSavings(double money) {
        this.savingsBalance = this.savingsBalance + money;
    }

    public void withdraw(double money) {

        if (this.checkingBalance < money) {
            System.out.println("INSUFFICIENT FUNDS in Checking");
        }
        else {
            this.checkingBalance = this.checkingBalance - money;
            System.out.println("Remain Balance is " + this.checkingBalance);
        }
    }
}