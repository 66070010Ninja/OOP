public class WithdrawException extends Exception {
    public WithdrawException() {
        super("Yes");
    }
    public WithdrawException(String s) {
        super("Account " + s + " has not enough money!");
    }
}
