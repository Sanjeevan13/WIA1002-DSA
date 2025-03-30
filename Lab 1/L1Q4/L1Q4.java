package l1q3;

public class L1Q3 {

    public static void main(String[] args) {
        Account1 account = new Account1(1122, 1000, "George");
        System.out.println("Succesfully created a new account! ");
        System.out.println("Account created on: " + account.getDateCreated());
        
        System.out.println("ID: " + account.getId());
        System.out.println("Balance: $" + account.getBalance());
        
        account.setAnnualInterestRate(0.015);
        System.out.println("Annual Interest Rate: " + (account.getAnnualInterestRate()*100) + "%");
        System.out.println("Monthly Interest Rate: " + (account.getMonthlyInterestRate()*100) + "%");
        System.out.println("Monthly Interest: $" + account.getMonthlyInterest());
        
        account.deposit(30, "1st deposit");
        account.deposit(40, "2nd deposit");
        account.deposit(50, "3rd deposit");
        account.withdraw(5, "1st withdrawal");
        account.withdraw(4, "2nd withdrawal");
        account.withdraw(2, "3rd withdrawal");

         for (Transaction transaction : account.getTransactions()) {
            System.out.println("Date: " + transaction.getDateCreated());
            if (transaction.getType() == 'W'){
                System.out.println("Type: Withdrawal");
            }
            else if (transaction.getType() == 'D'){
                System.out.println("Type: Deposit");
            }
            System.out.println("Amount: " + transaction.getAmount());
            System.out.println("Balance: " + transaction.getBalance());
            System.out.println("Description: " + transaction.getDescription());
        }   
    }
