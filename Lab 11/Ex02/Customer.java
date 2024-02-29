// Customer
public class Customer {

    // Varibel
    private CheckingAccount acct;
    private String firstName;
    private String lastName;

    // Init
    public Customer() {
        firstName = "";
        lastName = "";
        acct = null;
    }
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        acct = null;
    }
    public Customer(String firstName, String lastName, CheckingAccount acct) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = acct;
    }

    // Getter
    public CheckingAccount getAcct() {
        return acct;
    }
    public String getFirsName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    // Setter
    public void setAcct(CheckingAccount acct) {
        this.acct = acct;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Equals
    public boolean equals(Customer c) {
        return getFirsName().equals(c.getFirsName()) && getLastName().equals(c.getLastName());
    }

    // Override
    @Override
    public String toString() {
        if (getAcct() == null) {
            return getFirsName() + " " + getLastName() + " doesn’t have account.";
        }
        else {
            return "The " + getFirsName() + " account has " + getAcct().getBalance() + " baht and " + getAcct().getCredit() + " credits.";
        }
    }
}
