package bankaccountexample;

public class BankAccount {
    // instance variables
    // account number, balance, customer name, email and phone number
    long accountNumber;
    double balance;
    String name;
    String email;
    long phoneNumber;

    public double depositToFund(double newFundAmount){
        balance = balance + newFundAmount;
        return balance;
    }

    public double withdrawFromFunds(double withdrawFundAmount){

        double afterBalance = balance - withdrawFundAmount;
        if(afterBalance >= 0){
            balance = afterBalance;
            return balance;
        } else {
            System.err.println("There is not enough balance to withdraw!");
            return balance;
        }
    }
}
