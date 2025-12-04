package junit;

public class AccountService {
    private double balance;

    public AccountService(double balance, double deposit, double withdrawal) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    void deposit(){
        
    }
}
