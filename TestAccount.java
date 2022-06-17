package Account;

public class TestAccount {
    public static void main(String[] args) {
        Account account_1 = new Account(1234);
        System.out.println(account_1.toString());

        Account account_2 = new Account(1233,1000);
        System.out.println(account_2.toString());

        System.out.println("The account number is " + account_1.getNumber());
        System.out.println("The account balance is " + account_1.getBalance());

        account_1.credit(5000);
        System.out.println("The account balance is " + account_1.getBalance());

        account_1.debit(10000);
        System.out.println("The account balance is " + account_1.getBalance());

        account_1.transfer(3000, account_2);
        System.out.println("The account 2 balance is " + account_2.getBalance());
        
        account_1.transfer(15000, account_2);
        System.out.println("The account 2 balance is " + account_2.getBalance());
    }
}
