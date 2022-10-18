import java.sql.SQLOutput;

public class Account {
    public int Balance;
    public Account()
    { Balance=500;}
    public void deposit(int amount, String curtype)
    {
        if( amount>5000 && curtype.equals("OLD"))
        {
            try {
                throw new DemonitisationException(amount);
            } catch (DemonitisationException e) {
                System.out.println(e);
            }
        }
        else {
            Balance+=amount;
        }
    }
     public void curBalance()
     {
         System.out.println("Cuurent Balance: "+Balance);
     }
     public void Withdraw(int amt)
     {
         if(Balance-amt<500)
         {
             System.out.println("Minimum Balance will not be maintained if you withdraw\n");
         }
     }
}
