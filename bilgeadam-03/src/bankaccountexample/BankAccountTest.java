package bankaccountexample;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.name = "Ali Veli";
        System.out.println(bankAccount.name + " has " + bankAccount.balance);
        bankAccount.depositToFund(500);
        System.out.println(bankAccount.name + " has " + bankAccount.balance);
        bankAccount.withdrawFromFunds(200);
        System.out.println(bankAccount.name + " has " + bankAccount.balance);
        bankAccount.withdrawFromFunds(500);
        System.out.println(bankAccount.name + " has " + bankAccount.balance);

    }
}
