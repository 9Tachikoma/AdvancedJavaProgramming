package runnable_interface;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableExample());
        thread1.start();

        Thread thread2 = new Thread(() -> {
            int i = 0;
            while(i <= 100){
                System.out.println(i + " " + Thread.currentThread().getName());
                i++;
            }
        });//如果没有单独类就可以这样写个lambda

        thread2.start();//the results are mixed together
    }
}
