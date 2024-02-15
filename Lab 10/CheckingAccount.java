public class CheckingAccount extends Account {
    private double credit;
    public CheckingAccount() {
        super(0, "");
    }
    public CheckingAccount(double balance, String name, double credit) {
        super(balance, name);
        this.setCredit(credit);
    }
    public double getCredit() {
        return this.credit;
    }
    public void setCredit(double credit) {
        if (credit > 0) {
            this.credit = credit;
        }
        else {
            System.out.println("Input number must be a positive integer.");
        }
    }
    @Override
    public String toString() {
        return "The " + this.getName() + " account has " + this.getBalance() + " baht and " + this.getCredit() + " credits.";
    }
    @Override
    public void withdraw(double a) {
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
            System.out.println("Not enough money!");
        }
    }
    public void withdraw(String a) {
        this.withdraw(Double.parseDouble(a));
    }
}