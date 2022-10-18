public class Main {
    public static void main(String[] args) throws InterruptedException {
        Market m =new Market(4);

        Thread farmer=new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    m.farmer("apple");
                    m.farmer("orange");
                    m.farmer("grape");
                    m.farmer("watermelon");
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
        });

        Thread consumer=new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    m.consumer();
                    m.consumer();
                    m.consumer();
                    m.consumer();
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
        });
        farmer.start();
        consumer.start();

        farmer.join();
        consumer.join();
    }
}