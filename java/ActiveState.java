class ActiveState implements AccountState {
    private Account account;

    public ActiveState(Account account) {
        this.account = account;
    }

    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        System.out.println("Deposit of " + amount + " processed. Current balance: " + account.getBalance());
    }

    public void withdraw(double amount) {
        if (account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Withdrawal of " + amount + " processed. Current balance: " + account.getBalance());
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void suspend() {
        account.setAccountState(new SuspendedState(account));
        System.out.println("Account suspended");
    }

    public void activate() {
        System.out.println("Account already active");
    }

    public void close() {
        account.setAccountState(new ClosedState(account));
        System.out.println("Account closed");
    }
}

