package Account;

public class Account {
    private int number;
    private int balance;

    public Account(int number) {
        this.number = number;
        this.balance = 0;
    }
    public Account(int number, int balance) {
        this.number = number;
        this.balance = balance;
    }
    
    public int getBalance() {
        return this.balance;
    }
    public int getNumber() {
        return this.number;
    }

    public String toString() {
        return String.format("Account[%d, %d]", number, balance);
    }

    public void credit(int amount) {
        balance += amount;
    }
    public void debit(int amount) {
        if (balance >=  amount) {
            balance -= amount;
        } else {
            System.out.println("amount exceeds");
        }
    }
    public void transfer(int amount, Account anotherAccount) {
        if (balance >=  amount) {
            this.balance -=  amount;
            anotherAccount.balance +=  amount;
        } else {
            System.out.println("amount exceeds");
        }
    }
}
