import java.util.ArrayList;

public class Market {
    public int fruitsNo;
    ArrayList<String> Fruits;

    public Market(int fruitsNo) {
        Fruits = new ArrayList<>();

        this.fruitsNo = fruitsNo;
    }
    synchronized boolean isfull()
    {
        return Fruits.size()==fruitsNo;
    }
    synchronized boolean isEmpty()
    {
        return Fruits.size()==0;
    }
    synchronized void farmer(String fruit) throws InterruptedException
    {
        if(isfull())
        {
            System.out.println("Farmer is waiting for the consumer to consume");
            wait();
        }
        System.out.println("farmer produces  "+ fruit);
        Fruits.add(fruit);
        notify();
        Thread.sleep(500);
    }
    synchronized void consumer() throws InterruptedException
    {
        if (isEmpty()) {
            System.out.println("Consumer waiting for farmer to produce");
            wait();
        }
        String str1 = Fruits.remove(0);
        System.out.println("Consumer consumed " + str1);

        notify();
        Thread.sleep(1000);
    }
}
