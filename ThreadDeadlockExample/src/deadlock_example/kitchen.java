package deadlock_example;

public class kitchen {

    public static Object spoon = new Object();
    public static Object bowl = new Object();

    public static void main(String[] args) {
        Thread cook1 = new Thread(()->{
            synchronized (spoon) {
                System.out.println("Cook1: Holding the spoon...");
                System.out.println("Cook1: Waiting for the bowl");

                synchronized (bowl){
                    System.out.println("Cook1: Holding the spoon and the bowl.");
                }
            }
        });

        Thread cook2 = new Thread(()->{
            synchronized (bowl){
                System.out.println("Cook2: Holding the spoon...");
                System.out.println("Cook2: Waiting for the bowl");

                synchronized (spoon){
                    System.out.println("Cook2: Holding the spoon and the bowl");/*解决办法：交换这里的bowl和spoon
                    下次应用时避免使用nested blocks of synchronized code*/
                }
            }
        });

        cook1.start();
        cook2.start();
    }
}
