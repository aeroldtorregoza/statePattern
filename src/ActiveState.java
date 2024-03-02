public class ActiveState implements AccountState{
    private Account account;

    public ActiveState(Account account)
    {
        this.account = account;
    }

    @Override
    public void deposit(Double depositAmount) {
        account.setBalance(account.getBalance() + depositAmount);
        System.out.println("Deposit Successfully!");
        account.toString();
    }

    @Override
    public void withdraw(Double withdrawAmount) {
        account.setBalance(account.getBalance() - withdrawAmount);
        System.out.println("Withdraw Successfully!");
        account.toString();
    }

    @Override
    public void suspendState(Account account) {
        account.setAccountState(new SuspendedState(account));
        System.out.println("Account is suspended!");

    }

    @Override
    public void activateState(Account account) {
        System.out.println("Account is already activated!");
    }

    @Override
    public void closeState(Account account) {
        account.setAccountState(new ClosedState(account));
        System.out.println("Account is closed!");

    }
}
