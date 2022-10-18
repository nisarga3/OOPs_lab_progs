public class DemonitisationException extends Exception{
    int amt;
    DemonitisationException(int amt){amt=amt;}
    public String toString()
    {
        return "Deposit of Old currency of Rs. "+ amt+ "crosses Rs. 5000 and cannot be deposited";
    }
}
