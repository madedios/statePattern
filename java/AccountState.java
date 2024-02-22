interface AccountState {
    void deposit(double amount);
    void withdraw(double amount);
    void suspend();
    void activate();
    void close();
}