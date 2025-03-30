import java.util.Date;

public class Transaction {
    private Date dateCreated;
    private char type;
    private double amount;
    private double balance;
    private String description;
    
    public Transaction(char type, double amount, double balance, String description){
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        this.dateCreated = new Date();
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public void printDetails() {
	      System.out.println("Date: " + this.getDateCreated());
        System.out.println("Type: " + this.getType());
        System.out.println("Amount: " + this.getAmount());
        System.out.println("Balance: " + this.getBalance());
        System.out.println("Description: " + this.getDescription());
        System.out.println();
	}
}
