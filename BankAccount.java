import java.util.Random;

public class BankAccount{
    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfAccount = 0;
    private static int totalAmount = 0;
    private String accountNumber;

    private static String toString(char[] a){
        String string = new String(a);
        return string;
    }

    private String createAccountNumber(){
        char[] numGen = new char[10];
        Random rnd = new Random();
        int REDIX = 10;
        for(int i=0; i< numGen.length; i++){
            numGen[i] = Character.forDigit(rnd.nextInt(10), REDIX);
        }
        return toString(numGen);
    }
    public BankAccount(){
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        numberOfAccount++;
        this.accountNumber = createAccountNumber();
    }


    public String getAccountNumber(){
        return this.accountNumber;
    }

    public double getCheckingBalance(){
        return this.checkingBalance;
    }
    public double getSavingsBalance(){
        return this.savingsBalance;
    }

    public static int totalAmountCount(){
        return totalAmount;
    }

    public static int totalAccountCount(){
        return numberOfAccount;
    }

    public void deposit(String typeofBalance, double amount){
        if(typeofBalance == "checking"){
            this.checkingBalance += amount;
            totalAmount += amount;
        } else if(typeofBalance == "savings"){
            this.savingsBalance += amount;
            totalAmount += amount; 
        } else{
            System.out.println("Enter valid balance type.");
        }
    }

    public double getTotalAmount(){
        return this.checkingBalance + this.savingsBalance;
    }

    public void withdraw(String typeofBalance, double amount){
        if(typeofBalance == "checking"){
            if(amount > this.checkingBalance){
                System.out.println("Insufficient funds");
            } else{
                this.checkingBalance -= amount;
            }
        } else if(typeofBalance == "savings"){
            if(amount > this.savingsBalance){
                System.out.println("Insufficient funds");
            } else{
                this.savingsBalance -= amount;
            }
        } else{
            System.out.println("Enter valid balance type");
        }
    }


}