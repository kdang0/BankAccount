public class BankAccountTest {
    public static void main(String[] pain){
        BankAccount bank1 = new BankAccount();
        BankAccount bank2 = new BankAccount();
        //TEST CASES
        System.out.println("Account Number: " + bank1.getAccountNumber());
        //NO MONEY
        bank1.withdraw("checking", 50);
        //DEPOSIT MONEY
        bank1.deposit("checking", 50);
        //WITHDRAW MONEY
        bank1.withdraw("checking", 50);
        //INVALID BANK TYPE
        bank1.withdraw("null", 60000);
        //TOTAL ACC COUNT
        System.out.println(BankAccount.totalAccountCount());
        //TOTAL MONEY COUNT
        bank1.deposit("checking", 500);
        bank2.deposit("savings", 300);
        System.out.println(BankAccount.totalAmountCount());
    }
    
}
