package lab1q3;

import java.util.ArrayList;

public class Account1 extends Account{
    private String name;
    private ArrayList<Transaction> ls;
    
    public Account1(int id, double balance, String name){
        super(id, balance);
        this.name = name;
        this.ls = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Transaction> getTransactions() {
        return ls;
    }
    
    public void withdraw(double amount, String description){
        super.withdraw(amount);
        ls.add(new Transaction('W', amount, this.getBalance(), description)); 
    }
    
    public void deposit(double amount, String description){
        super.depostit(amount);
        ls.add(new Transaction('D', amount, this.getBalance(), description)); 
    }   
}
