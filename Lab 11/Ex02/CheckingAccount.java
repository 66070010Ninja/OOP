// Checking Account
public class CheckingAccount extends Account {

    // Varibel
    private double credit;

    // Init
    public CheckingAccount() {
        super(0, "");
    }

    public CheckingAccount(double balance, String name, double credit) {
        super(balance, name);
        this.credit = credit;
    }

    // Getter
    public double getCredit() {
        return credit;
    }

    // Setter
    public void setCredit(double credit) {
        if (credit > 0) {
            this.credit = credit;
        } else {
            System.out.println("Input number must be a positive integer.");
        }
    }

    // toString
    @Override
    public String toString() {
        return "The " + getName() + " account has " + super.getBalance() + " baht and " + getCredit()
                + " credits.";
    }

    // With Draw
    @Override
    public void withdraw(double a) throws WithdrawException {
        if (((this.getBalance() + this.getCredit() - a) > 0) && (a > 0)) {
            if ((this.getBalance() - a) < 0) {
                this.setCredit(this.getBalance() + this.getCredit() - a);
                this.setBalance(0);
            }
            else {
                this.setBalance(this.getBalance() - a);
            }
            System.out.println(a + " baht is withdrawn from " + this.getName() + " and your credit balance is " + this.getCredit() + ".");
        }
        else {
            throw new WithdrawException(getName());
        }
    }
    public void withdraw(String a) throws WithdrawException {
        withdraw(Double.parseDouble(a));
    }
}
