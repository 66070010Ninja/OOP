// Account
public class Account {

    // Variabel
    protected double balance;
    protected String name;

    // Init
    public Account(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    // Getter
    public double getBalance() {
        return balance;
    }
    public String getName() {
        return name;
    }

    // Setter
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Deposit
    public void deposit(double a) {
        if (a > 0) {
            setBalance(getBalance() + a);
            System.out.println(a + " baht is deposited to " + getName() + ".");
        }
        else {
            System.out.println("Input number must be a positive integer.");
        }
    }

    // Show Account
    public void showAccount() {
        System.out.println(getName() + " account has " + getBalance() + " baht.");
    }

    // With Draw
    public void withdraw(double a) throws WithdrawException {
        if (((this.getBalance() - a) > 0) && (a > 0)) {
            this.setBalance(this.getBalance() - a);
            System.out.println(a + " baht is withdrawn from " + this.getName() + ".");
        }
        else if (((this.getBalance() - a) < 0) && (a > 10)) {
            throw new WithdrawException(getName());
        }
        else {
            System.out.println("Input number must be a positive integer.");
        }
    }
}
