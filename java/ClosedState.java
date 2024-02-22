class ClosedState implements AccountState {
    private Account account;

    public ClosedState(Account account) {
        this.account = account;
    }

    public void deposit(double amount) {
        System.out.println("Cannot deposit into a closed account");
    }

    public void withdraw(double amount) {
        System.out.println("Cannot withdraw from a closed account");
    }

    public void suspend() {
        System.out.println("Cannot suspend a closed account");
    }

    public void activate() {
        System.out.println("Cannot activate a closed account");
    }

    public void close() {
        System.out.println("Account already closed");
    }
}
