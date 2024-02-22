public class AccountTest {
    public static void main(String[] args) {
        Account myAccount = new Account("1234", 10000.0);
        myAccount.activate();

        // Suspend the account
        myAccount.suspend();

        // Activate the account
        myAccount.activate();

        // Deposit to the account
        myAccount.deposit(1000.0);

        // Withdraw from the account
        myAccount.withdraw(100.0);

        // Close the account
        myAccount.close();

        // Activate the account
        myAccount.activate(); // Displays "You cannot activate a closed account!"

        // Suspend the account
        myAccount.suspend(); // Displays "You cannot suspend a closed account!"

        // Withdraw from the account
        myAccount.withdraw(500.0); // Show message "You cannot withdraw from a closed account!". Call the toString() to show current balance and account number.

        // Deposit to the account
        myAccount.deposit(1000.0); // Show message "You cannot deposit into a closed account!". Call the toString() to show current balance and account number.
    }
}