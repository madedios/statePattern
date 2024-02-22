class SuspendedState implements AccountState {
    private Account account;

    public SuspendedState(Account account) {
        this.account = account;
    }

    public void deposit(double amount) {
        System.out.println("Cannot deposit into a suspended account");
    }

    public void withdraw(double amount) {
        System.out.println("Cannot withdraw from a suspended account");
    }

    public void suspend() {
        System.out.println("Account already suspended");
    }

    public void activate() {
        account.setAccountState(new ActiveState(account));
        System.out.println("Account activated");
    }

    public void close() {
        account.setAccountState(new ClosedState(account));
        System.out.println("Account closed");
    }
}
