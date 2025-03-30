package l1q3;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    
    public Account(){
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
    }
    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    
    public Date getDateCreated(){
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        return (annualInterestRate/12);
    }
    
    public double getMonthlyInterest(){
        return (balance*getMonthlyInterestRate());
    }
    
    public void withdraw(double amount){
        if (amount < balance && amount > 0){
            balance -= amount;
            System.out.println("You have successfully withdrew $" + amount);
        }
        else{
            System.out.println("Unsuccessful withdrawal!");
        }
    }
    
    public void depostit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("You have succesfully deposited $" + amount);
        }
        else{
            System.out.println("Unsuccessful deposit!");
        }
    }
}
