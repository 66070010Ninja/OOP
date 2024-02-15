import java.util.ArrayList;

public class Customer {
    private ArrayList<Account> acct;
    private int numOfAccount;
    private String firstName;
    private String lastName;
    public void addAccount(Account acct) {
        this.acct.add(acct);
        this.numOfAccount += 1;
    }
    public Account getAccount(int index) {
        return (Account)this.acct.get(index);
    }
    public int getNumOfAccount() {
        return this.numOfAccount;
    }
    public Customer() {
        this.setFirstName("");
        this.setLastName("");
        acct = new ArrayList<>();
    }
    public Customer(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        acct = new ArrayList<>();
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public boolean equals(Customer c) {
        return this.getFirstName().equals(c.getFirstName()) && this.getLastName().equals(c.getLastName());
    }
    @Override
    public String toString() {
        if (this.numOfAccount == 0){
            return this.getFirstName() + " " + this.getLastName() + " doesn’t have account.";
        }
        return "The " + this.getFirstName() + " " + this.getLastName() + " account has " + this.getNumOfAccount() + " account.";
    }
}
