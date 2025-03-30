package t1q5;

public class T1Q5 {

    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount(200);
        
        System.out.println("Your current balance is: " + myAcc.getBalance());
        
        myAcc.deposit(400);
        System.out.println("After deposit of 400: " + myAcc.getBalance());
        
        boolean success = myAcc.withdraw(300);
        System.out.println("Withdraw 300 successful? " + success);
        System.out.println("Balance after withdrawal: " + myAcc.getBalance());

        success = myAcc.withdraw(1500);
        System.out.println("Withdraw 1500 successful? " + success);
        System.out.println("Final Balance: " + myAcc.getBalance());
        
    }
    
}
interface Account{
    int deposit(int amount);
    boolean withdraw(int amount);
}

class BankAccount implements Account{
    private int balance;
    
    public BankAccount(int balance){
        this.balance = balance;
    }
    
    @Override
    public int deposit(int amount){
        if (amount > balance){
            balance += amount;
        }
        return balance;
    }
    
    @Override
    public boolean withdraw(int amount){
        if ((amount > 0) && (amount <= balance)){
            balance-=amount;
            return true;
        }
        return false;
    }
    
    public int getBalance(){
        return balance;
    }
}
