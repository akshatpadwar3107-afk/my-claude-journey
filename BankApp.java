import java.util.Scanner;

class Account{

    private String accountHolder;
    private double balance;

    public String getAccountHolder() {
        return accountHolder;
    }
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

  
    
    public void deposit(double amount){

        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Your current balance after depositing :" +amount+ "is :" +balance);
            
        }
        else{
            System.out.println("Invalid amount");
        }
    }
    public void withdrawn(double amount){
        if (amount > 0 && amount<=balance) {
            balance = balance - amount;
            System.out.println("Your current balance after withdrawl of" +amount+ "is " +balance);
            
        }
        else{
            System.out.println("Invalid withdrawl");
        }

    }
}

public class BankApp {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        Account account=new Account();
        account.setAccountHolder("Deepak");


        System.out.println("1.Amount Deposit");
        System.out.println("2.Amount Withdraw");

        System.out.println("Enter the choice");
        int choice=sc.nextInt();

        System.out.println("Enter the amount :");
        double amount=sc.nextDouble();
        
    switch (choice) {
        case 1:
            account.deposit(amount);
            
            break;

            case 2:
                account.withdrawn(amount);
                break;
                
    
        default:
            System.out.println("Invalid choice");
            break;
    }
    sc.close();
        
        
    }
    
}
