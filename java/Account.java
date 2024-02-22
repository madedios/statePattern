class Account {
    private String accountNumber;
    private double balance;
    private AccountState accountState;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountState = new ActiveState(this);
    }

    // Getters and setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountState getAccountState() {
        return accountState;
    }

    public void setAccountState(AccountState accountState) {
        this.accountState = accountState;
    }

    // Account actions
    public void deposit(double amount) {
        accountState.deposit(amount);
        System.out.println("Deposit of " + amount + " made to account " + accountNumber + ". New balance: " + balance);
    }
    
    public void withdraw(double amount) {
        accountState.withdraw(amount);
        System.out.println("Withdrawal of " + amount + " made from account " + accountNumber + ". New balance: " + balance);
    }
    

    public void suspend() {
        accountState.suspend();
    }

    public void activate() {
        accountState.activate();
    }

    public void close() {
        accountState.close();
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}