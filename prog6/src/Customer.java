public class Customer {
    public static void main(String[] args) {
        Account ac=new Account();
        ac.curBalance();
        ac.Withdraw(350);
        ac.curBalance();
        ac.deposit(500,"NEW");
        ac.curBalance();
        ac.deposit(600,"OLD");
        ac.Withdraw(250);
        ac.curBalance();
    }


}
