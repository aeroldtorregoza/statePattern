public class SuspendedState implements AccountState{
    private Account account;

    public SuspendedState(Account account){
        this.account = account;
    }

    @Override
    public void deposit(Double depositAmount) {
        System.out.println("You cannot deposit on suspended account!");
        System.out.println(account.toString());
    };

    @Override
    public void withdraw(Double withdrawAmount) {
        System.out.println("You cannot withdraw on suspended account!");
        System.out.println(account.toString());
    };

    @Override
    public void activateState(Account account) {
        account.setAccountState(new ActiveState(account));
        System.out.println("Account is activated!\n");
    };

    @Override
    public void suspendState(Account account) {
        System.out.println("Account is already suspended!\n");
    };

    @Override
    public void closeState(Account account) {
        account.setAccountState(new ClosedState(account));
        System.out.println("Account is closed!\n");
    };
}
